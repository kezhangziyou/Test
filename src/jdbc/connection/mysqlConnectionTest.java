package jdbc.connection;




import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;


/**
 * @author zhangke
 * @version 1.0
 * @className mysqlConnectionTest
 * @description TODO 测试阿里云数据库的时候能正常连接
 * @date 2019/3/21 下午2:36
 **/
public class mysqlConnectionTest {
    public static  void main(String [] args){
        // 数据库驱动
        String driver = "com.mysql.jdbc.Driver";
        // **指的是数据库名称
        String url = "jdbc:mysql://47.105.165.247:3306/crm";
        // 数据库用户名
        String username = "root";
        // 数据库密码
        String password = "ZhangKe123!";
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            // 加载数据库驱动
            Class.forName(driver);
            // 连接Connection对象
            conn = (Connection) DriverManager.getConnection(url, username, password);
            // 创建Statement对象
            stat = (Statement) conn.createStatement();
            String sql = "select * from customer";
            // 执行sql语句返回结果集
            rs = stat.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getInt("cust_id"));
                System.out.println(rs);

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}