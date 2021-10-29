package com.jdbc_demo;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try{
            Connection conn= DriverManager.getConnection(
                            "jdbc:sqlite:C:\\Users\\markf\\IdeaProjects\\FirstJDBCDemo\\DB\\myfirstdb.db");
            Statement statement=conn.createStatement();
            statement.execute("CREATE TABLE students (name Text, phone Integer, email Text)");
            statement.close();
            conn.close();
        }catch(SQLException e){
            System.out.println("Something went wrong... "+e.getMessage());
        }
    }
}
