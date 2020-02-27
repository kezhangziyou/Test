package jdbc.connection.mysql;

import java.sql.*;

/**
 * Created by 刘权 on 2020-2-21.
 */
public class MysqlConnectionUtil {
    private  String driver = null;
    private  String url=null;
    private  String userName=null;
    private  String password=null;
    private  String dataBase=null;
    private  String schema=null;

    Connection connection = null;
    Statement stat = null;
    ResultSet rs = null;

    public  MysqlConnectionUtil(String driver, String url,String userName,
                                String password ,String dataBase,String schema) {
        this.driver = driver;
        this.url = url;
        this.userName = userName;
        this.password = password;
        this.dataBase = dataBase;
        this.schema = schema;

    }

    /**
     * 获得连接
     */
    public void initConnection() {
        try {
            // 加载数据库驱动

            Class.forName(driver);
            connection = DriverManager.getConnection(url, userName, password);
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 创建连接
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public  void executeQuery() throws SQLException {
        try {
            stat = (Statement) connection.createStatement();
            String sql = "select * from sys_user";
            // 执行sql语句返回结果集
            rs = stat.executeQuery(sql);
            int count=0;

            while (rs.next()) {
                System.out.println(rs.getInt("user_id"));
                System.out.println(rs.getString("user_code"));
                System.out.println(rs.getString("user_name"));
                System.out.println(rs.getString("user_password"));
                System.out.println(rs.getInt("user_state"));
            }
            System.out.println(count);
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库的所有表名
     *
     * @return
     * @throws SQLException
     */
    public void getTables() throws SQLException {
        DatabaseMetaData databaseMetaData = connection.getMetaData();
        String[] types = {"TABLE" };
        ResultSet resultSet = databaseMetaData.getTables(
                dataBase, null, null, types);
        System.out.println("数据库"+dataBase+"下面所有的表为：");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("TABLE_NAME"));
        }
    }

    /**
     * 获取表的列信息的 List
     *
     * @return
     * @throws SQLException
     */
    public void getColNames(String tableName) throws SQLException {
        DatabaseMetaData databaseMetaData = connection.getMetaData();
        ResultSet resultSet = databaseMetaData.getColumns(
                dataBase, null, tableName, "%");
        System.out.println("数据库"+dataBase+"下面表"+tableName+"的信息为：");
        while (resultSet.next()) {
            //TABLE_CAT:data_integration_copy
            //TABLE_SCHEM:null
            //TABLE_NAME:itg_datasource_category
            //COLUMN_NAME:id
            //DATA_TYPE:-5
            //TYPE_NAME:BIGINT
            //COLUMN_SIZE:19
            //BUFFER_LENGTH:65535
            //DECIMAL_DIGITS:0
            //NUM_PREC_RADIX:10
            //NULLABLE:0
            //REMARKS:主键
            //COLUMN_DEF:null
            //SQL_DATA_TYPE:0
            //SQL_DATETIME_SUB:0
            //CHAR_OCTET_LENGTH:null
            //ORDINAL_POSITION:1
            //IS_NULLABLE:NO
            //SCOPE_CATALOG:null
            //SCOPE_SCHEMA:null
            //SCOPE_TABLE:null
            //SOURCE_DATA_TYPE:null
            //IS_AUTOINCREMENT:YES
            //IS_GENERATEDCOLUMN:NO
            //for (int j = 1; j <=resultSet.getMetaData().getColumnCount() ; j++) {
            //	System.out.println(resultSet.getMetaData().getColumnName(j)+":"+resultSet.getString(resultSet.getMetaData().getColumnName(j)));
            //
            //}

            //列名
            String COLUMN_NAME = resultSet.getString("COLUMN_NAME");

            //java.sql.Types类型名称(列类型名称)
            String TYPE_NAME = resultSet.getString("TYPE_NAME");

            //列备注
            String REMARKS = resultSet.getString("REMARKS");

            //列大小
            int COLUMN_SIZE = resultSet.getInt("COLUMN_SIZE");

            //小数精度
            int DECIMAL_DIGITS = resultSet.getInt("DECIMAL_DIGITS");

            //是否为空，yes，可以；NO：否
            String IS_NULLABLE = resultSet.getString("IS_NULLABLE");
            System.out.println("COLUMN_NAME:"+COLUMN_NAME+";TYPE_NAME:"+TYPE_NAME+ ";REMARKS:"+REMARKS+
                    "COLUMN_SIZE:"+COLUMN_SIZE+";DECIMAL_DIGITS:"+DECIMAL_DIGITS+ ";IS_NULLABLE:"+IS_NULLABLE);
        }
    }



    public  void close(){
        try {
            if(rs!=null){
                rs.close();
            }
            if(stat!=null){
                stat.close();
            }
            if(connection!=null){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
