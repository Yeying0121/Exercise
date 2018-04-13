package com.yeying.production.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class JdbcPrictice {

    public static void main(String[] args) {

        String sql = "Select name from user_t";

        // 封装的JDBC 工具类，属于数据库操作层
        JDBCUtils jdbcUtils = new JDBCUtils();
        List<String> nameQueryResult = jdbcUtils.getUserName(sql);
        System.out.println(nameQueryResult);

        // method(nameQueryResult) => 数据处理的业务逻辑函数

        // 使用后记得要关闭数据库连接
        jdbcUtils.closeDBConnector();
    }

}
