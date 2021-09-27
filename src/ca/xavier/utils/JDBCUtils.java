package ca.xavier.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {
    private static DataSource ds;

    static{
        try {
        Properties pro=new Properties();
        InputStream is=JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");

        pro.load(is);
        ds= DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDs() {
        return ds;
    }

    public Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
