package com.yeying.production.jdbc;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class JDBCUtils {

    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    /**
     * 在实例化这个JDBC工具类的同时，建立数据库连接
     */
    JDBCUtils() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载成功");

            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learn", "root", "");
            System.out.println("数据库连接成功");
            this.statement = this.connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 封装后给外界提供的方法，通过sql语句，获得数据表中的所有name字段的数据
     *
     * @param sql
     * @return
     */
    public List<String> getUserName(String sql) {
        List<String> result = new ArrayList<String>();
        try {
            this.resultSet = this.statement.executeQuery(sql);
            while (this.resultSet.next()) {
                String name = this.resultSet.getString("name");
                result.add(name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void closeDBConnector() {
        try {
            this.resultSet.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            this.statement.close();

        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            this.connection.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

}
