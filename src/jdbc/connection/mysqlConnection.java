package jdbc.connection;




import java.sql.*;

/**
 * @author zhangke
 * @version 1.0
 * @className mysqlConnection
 * @description TODO 测试 mysql8的连接
 * @date 2019/4/19 3:20 PM
 **/
public class mysqlConnection {
    public static  void main(String [] args){
		// 数据库驱动
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://172.24.8.133:3306/data_service?allowMultiQueries=true&useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Hongkong";
        // **指的是数据库名称
        String username = "root";
        // 数据库用户名
        String password = "1qaz@WSX";
        // 数据库密码
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
			// 执行sql语句返回结果集
            String sql = "select * from t_product";
            rs = stat.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs);

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}