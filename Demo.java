package com.techno.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		Connection connection=null;
		Statement statement = null;
		Savepoint setSavepoint = null;
		System.out.println("outside try");
		try {
			connection = DriverManager.getConnection(url,"root","sraj@123");
			System.out.println("connection established");
			statement = connection.createStatement();
			System.out.println("statement established");
			connection.setAutoCommit(false);
			System.out.println("set point auto saved");
			statement.execute("insert into trans values(1,'Unlocking by fingerprint')");
			statement.execute("insert into trans values(2,'Entering the pin')");
			statement.execute("insert into trans values(3,'Check balance')");
			System.out.println("Balance is 10000000000000");
			setSavepoint = connection.setSavepoint();
			statement.execute("insert into trans values(4,'Debiting the amount')");
			statement.execute("insert into trans values(5,'Transfer through network')");
			statement.execute("insert into trans values(6,'Crediting to account')");
			System.out.println("Transaction completed !! tin din!!");
			connection.commit();
		} catch (Exception e) {
			System.out.println("entered exception");
			try {
				if(setSavepoint!=null) {
				connection.rollback(setSavepoint);
				connection.commit();
				}
			} catch (SQLException e1) {
				System.out.println("Transaction failed!!");
			}
		}
	}

}
