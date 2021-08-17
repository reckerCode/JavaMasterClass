package com.reckercode;

import java.sql.*;

public class Main {
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:D:\\JavaProjects\\TestDB\\"+DB_NAME;
    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

//    public static final String PATH = "D:\\JavaProjects\\TestDB\\";
    public static void main(String[] args) {
//        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\JavaProjects\\TestDB\\testjava.db");
//            Statement statement = conn.createStatement();){
//            statement.execute("CREATE TABLE contacts(name TEXT, phone INTEGER, email TEXT)");
//        }
        try{
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute(" DROP TABLE IF EXISTS "+ TABLE_CONTACTS);
            statement.execute(" CREATE TABLE IF NOT EXISTS " +TABLE_CONTACTS+
                    " ( "+COLUMN_NAME +" text, "
                    +COLUMN_PHONE+" integer, "
                    +COLUMN_EMAIL+" text)");// creating a table if it does not already exist.
//            statement.execute(" INSERT INTO "+TABLE_CONTACTS+" ("+
//                    COLUMN_NAME+", " +
//                    COLUMN_PHONE+", "+
//                    COLUMN_EMAIL+
//                    " ) "+
//                    " VALUES('Recker', 123456, 'recker@myemail.com')");
//            statement.execute(" INSERT INTO "+TABLE_CONTACTS+" ("+
//                    COLUMN_NAME+", " +
//                    COLUMN_PHONE+", "+
//                    COLUMN_EMAIL+" ) "+" VALUES('Smith', 654321, 'smith@myemail.com')");
//            statement.execute(" INSERT INTO "+TABLE_CONTACTS+" ( "+
//                    COLUMN_NAME+", " +
//                    COLUMN_PHONE+", "+
//                    COLUMN_EMAIL+" ) "+" VALUES('Joe', 567567567, 'joe@myemail.com')");
//            statement.execute(" INSERT INTO "+TABLE_CONTACTS+" ( "+
//                    COLUMN_NAME+", " +
//                    COLUMN_PHONE+", "+
//                    COLUMN_EMAIL+" ) "+" VALUES('Kevin', 999999, 'kevin@myemail.com')");

            insertContacts(statement, "Recker", 123456, "recker@myemail.com");
            insertContacts(statement, "Smith", 654321, "smith@myemail.com");
            insertContacts(statement, "Joe", 567567567, "joe@myemail.com");
            insertContacts(statement, "Kevin", 999999, "kevin@myemail.com");

            statement.execute(" UPDATE "+ TABLE_CONTACTS+" SET "+
                    COLUMN_PHONE+" = 98798798 "+" WHERE "+ COLUMN_NAME+"= ' Kevin'");
            statement.execute(" DELETE FROM "+TABLE_CONTACTS+" WHERE "+COLUMN_NAME+"= 'Joe'");
//
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

//            statement.execute("SELECT * FROM contacts");// retrieving the whole table
//            ResultSet results = statement.getResultSet();// creating a result instance for printing the table

//            ResultSet results = statement.executeQuery("SELECT * FROM contacts");// shorter way to create the instance
            ResultSet results = statement.executeQuery("SELECT * FROM "+ TABLE_CONTACTS);
            System.out.println("Fetched data by Column name: \n");

            while(results.next()){// checking for the end of the table
                System.out.println(results.getString(COLUMN_NAME) + " " +results.getInt(COLUMN_PHONE)
                +" "+ results.getString(COLUMN_EMAIL)+" ");// printing using the column name
            }
            results.close();// closing the result instance because it can only be used once

//            statement.execute("SELECT * FROM contacts");
//            ResultSet results1 = statement.getResultSet();
//            ResultSet results1 = statement.executeQuery("SELECT * FROM contacts");
            ResultSet results1 = statement.executeQuery("SELECT * FROM "+ TABLE_CONTACTS);
            System.out.println("Fetched data by Column index: \n");

            while(results1.next()){
                System.out.println(results1.getString(1) + " " +results1.getInt(2)
                        +" "+ results1.getString(3)+" ");// printing using the column index
            }
            results1.close();
            statement.close();// statement has to be closed first and not the connection.
            conn.close();// one should only close the connection after the statement has been closed to avoid error.
        }
	    catch (SQLException e){
            System.out.println("Something went wrong "+e.getMessage());
        }
    }
//      method for executing the sql insert statements
    private static void insertContacts(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute(" INSERT INTO "+TABLE_CONTACTS+" ( "+
                COLUMN_NAME+", " +
                COLUMN_PHONE+", "+
                COLUMN_EMAIL+" ) "+" VALUES('"+name+"', "+phone+", '"+email+"')");
    }

}
