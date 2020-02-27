package jdbc.connection.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 * Created by 刘权 on 2020-2-21.
 */
public class ConnectionPoolUtil {
    private String url="";
    private String userName="";
    private String pas="";
    private static final String name = "com.mysql.jdbc.Driver";
    /**
     * 初始连接池大小
     */
    private static int initCount = 10;
    /**
     * 连接池最大
     */
    private static int maxCount = 20;
    
    private int currentCount = 0;
    private  volatile static  ConnectionPoolUtil connectionPoolUtil= null;
    
    LinkedList<Connection> connectionPool = new LinkedList<>();


    /**
     * 私有构造函数
     * @param url
     * @param userName
     * @param pas
     */
    private ConnectionPoolUtil(String url,String userName,String pas) {
        this.url=url;
        this.userName=userName;
        this.pas=pas;
        try {
            for (int i = 0; i < initCount; i++) {
                this.connectionPool.addLast(this.createConnection());
                this.currentCount++;
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /**
     * 创建连接
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    private Connection createConnection() throws SQLException, ClassNotFoundException {
        Class.forName(name);// 指定连接类型
        return (Connection) DriverManager.getConnection(url,userName, pas);
    }


    /**
     * 获取连接
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        synchronized (connectionPool) {
            if (connectionPool.size() > 0)
                return connectionPool.removeFirst();

            if (this.currentCount < maxCount) {
                this.currentCount++;
                return createConnection();
            }
            throw new SQLException("已没有链接");
        }
    }

    /**
     * 构造工具类的单例
     * @param url
     * @param user
     * @param password
     * @return
     */
    public static ConnectionPoolUtil getConnectionPoolUtil(String url, String user, String password) {
        if(connectionPoolUtil==null) {
            synchronized (ConnectionPoolUtil.class) {
                if(connectionPoolUtil == null) {
                    connectionPoolUtil = new ConnectionPoolUtil(url,user,password);
                }
            }
        }
        return connectionPoolUtil;
    }

    /**
     * 释放连接
     * @param conn
     */
    public void free(Connection conn) {
        connectionPool.addLast(conn);
    }



}
