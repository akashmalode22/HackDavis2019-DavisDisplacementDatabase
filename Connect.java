package com.example.databaseinput;

import android.content.Context;
import android.os.AsyncTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect extends AsyncTask<Context, Integer, Long> {

    protected Long doInBackground(Context... contexts) {

        Connection connection;
        String query = "INSERT INTO ResourceList VALUES (\"asd\", 2, \"\", 2, \"asdasdasd\", \"asdasdad\", \"234345345\");";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://35.236.24.81/avian-direction-231117:us-west2:resource-list", "root", "EokP58kozjCDEcum");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Exception " + e);
            return null;
        }

        return null;
    }
}
