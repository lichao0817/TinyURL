package net.thepapaya.utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Chao on 2016/12/16.
 */
public class DbUtils {
    private static Connection con;
    static {
        if (System.getProperty("RDS_HOSTNAME") != null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String dbName = System.getProperty("RDS_DB_NAME");
                String userName = System.getProperty("RDS_USERNAME");
                String password = System.getProperty("RDS_PASSWORD");
                String hostname = System.getProperty("RDS_HOSTNAME");
                String port = System.getProperty("RDS_PORT");
                String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?user=" + userName + "&password=" + password;
                con = DriverManager.getConnection(jdbcUrl);
            }
            catch (Exception e) {}
        }
    }
    public static Connection getConnection() {
        return con;
    }
}