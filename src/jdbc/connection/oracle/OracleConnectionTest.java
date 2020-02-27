package jdbc.connection.oracle;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author zhangke
 * @version 1.0
 * @className mysqlConnection
 * @description TODO 测试 mysql8的连接
 * @date 2019/4/19 3:20 PM
 **/
public class OracleConnectionTest {
    public static  void main(String [] args){
		// 数据库驱动
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@172.24.8.133:1521/orcl";
        // **指的是数据库名称
        String username = "BFDTEST";
        // 数据库用户名
        String password = "bfdtest";
        //测试前的参数非空校验
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            System.out.print("测试成功");
        } catch (Exception e) {
            System.out.print(e);
        }
        finally {
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.print(e);
                }
            }
        }
    }
}