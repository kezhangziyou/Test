package jdbc.connection.mysql;


import java.sql.SQLException;


/**
 * @author zhangke
 * @version 1.0
 * @className mysqlConnectionTest
 * @description TODO 测试阿里云数据库的时候能正常连接
 * @date 2019/3/21 下午2:36
 **/
public class ConnectionUtilTest {

    public static void main(String[] args) throws SQLException {

        String driver = "com.mysql.jdbc.Driver";
        String url="jdbc:mysql://47.105.165.247:3306/crm";
        String userName="root";
        String password="ZhangKe123!";
        String dataBase="crm";
        String schema="";
        MysqlConnectionUtil mysqlConnectionUtil = new MysqlConnectionUtil(driver,url,userName,password,dataBase,schema);
        mysqlConnectionUtil.initConnection();
        //mysqlConnectionUtil.executeQuery();
        //mysqlConnectionUtil.getTables();
        mysqlConnectionUtil.getColNames("sys_user");
        mysqlConnectionUtil.close();
    }

}