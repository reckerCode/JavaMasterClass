package com.reckercode;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
//        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\JavaProjects\\TestDB\\testjava.db");
//            Statement statement = conn.createStatement();){
//            statement.execute("CREATE TABLE contacts(name TEXT, phone INTEGER, email TEXT)");
//        }
        try{
            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\JavaProjects\\TestDB\\testjava.db");
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts" +
                    "(name TEXT, phone INTEGER, email TEXT)");// creating a table if it does not already exist.
//            statement.execute("INSERT INTO contacts(name, phone, email) " +
//                    "VALUES('Joe', 654321, 'myemail@joe.com') ");// inserting new row into the created table.
//
//            statement.execute("INSERT INTO contacts(name, phone, email) " +
//                    "VALUES('Smith', 9876543, 'myemail@smith.com') ");// inserting new row into the created table.
//
//            statement.execute("INSERT INTO contacts(name, phone, email) " +
//                    "VALUES('Ryan', 123456789, 'myemail@ryan.com') ");// inserting new row into the created table.

//            statement.execute("UPDATE contacts " +
//                    "SET phone = 704704704 WHERE name = 'Recker' ");// updating existing row.
//            statement.execute("DELETE FROM contacts WHERE name = 'Ryan'");// deleting a record.

            statement.execute("SELECT * FROM contacts");// retrieving the whole table
            ResultSet results = statement.getResultSet();// creating a result instance for printing the table
            System.out.println("Fetched data by Column name: \n");
            while(results.next()){// checking for the end of the table
                System.out.println(results.getString("name") + " " +results.getInt("phone")
                +" "+ results.getString("email\n"));// printing using the column name
            }
            results.close();// closing the result instance because it can only be used once

            statement.execute("SELECT * FROM contacts");
            ResultSet results1 = statement.getResultSet();
            System.out.println("Fetched data by Column index: \n");
            while(results1.next()){
                System.out.println(results1.getString(1) + " " +results1.getInt(2)
                        +" "+ results1.getString(3)+"\n");// printing using the column index
            }
            results1.close();
            statement.close();// statement has to be closed first and not the connection.
            conn.close();// one should only close the connection after the statement has been closed to avoid error.
        }
	    catch (SQLException e){
            System.out.println("Something went wrong "+e.getMessage());
        }
    }
}
