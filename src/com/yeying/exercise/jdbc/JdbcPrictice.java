package com.yeying.exercise.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JdbcPrictice {
    public static void main(String[] args) {

        String  sql="Select * from user_t";

        Connection con=null;
        Statement st=null;
        ResultSet rs=null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载成功");

            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/learn","root","yy94482664");
            System.out.println("数据库连接成功");
            st=con.createStatement();

            rs=st.executeQuery(sql);

            while(rs.next()){

                System.out.print(rs.getInt("id")+"   ");
                System.out.print(rs.getString("name")+"  ");
                System.out.print(rs.getString("password")+"  ");
                System.out.print(rs.getString("email")+"   ");
                System.out.println();

            }

        } catch (Exception e) {

            e.printStackTrace();

        }finally{

            try {
                rs.close();

            } catch (Exception e2) {
                e2.printStackTrace();
            }
            try {
                st.close();

            } catch (Exception e2) {
                e2.printStackTrace();
            }
            try {
                con.close();

            } catch (Exception e2) {
                e2.printStackTrace();
            }


        }


    }

}
