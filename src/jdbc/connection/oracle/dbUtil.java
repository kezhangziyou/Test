package jdbc.connection.oracle;

import java.sql.*;

/**
 * Created by 刘权 on 2020-2-21.
 */
public class dbUtil {
    public static  void main(String [] args) {
         getConnection();
    }


    public static Connection getConnection(){
        Connection conn=null;

        try {
            String url="jdbc:oracle:thin:@172.24.8.133:1521/orcl";
            String user="bfdtest";
            String password="bfdtest";

            Class.forName("oracle.jdbc.driver.OracleDriver");//加载数据驱动
            conn = DriverManager.getConnection(url, user, password);// 连接数据库
            System.out.println("连接数据库成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("加载数据库驱动失败");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("连接数据库失败");
        }
        return conn;
    }
    public static void close(Connection conn, PreparedStatement ps, ResultSet rs){
        try {
            if(rs!=null){
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if(ps!=null){
                ps.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if(conn!=null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
