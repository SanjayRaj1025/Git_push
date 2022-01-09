package com.techno.crudjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","sraj@123");
		statement=connection.createStatement();
		boolean execute = statement.execute("insert into sweets values(102,'mysorepak',10,2)");
		boolean execute1 = statement.execute("insert into sweets values(103,'rasagulla',20,2)");
	}catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}finally {
		if(connection!=null) {
			try {
		
			connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
		if(statement!=null) {
			try {
				statement.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

}
	}
}
