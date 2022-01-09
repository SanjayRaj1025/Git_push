package com.techno.crudjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

public class InsertUsingPrepare {
	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement statement=null;
		try {
		Connection connection2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","sraj@123");
		statement=connection2.prepareStatement("insert into sweets values(?,?,?,?)");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id of the sweet");
		int id=sc.nextInt();
		System.out.println("enter the name of the sweet");
		String name=sc.next();
		System.out.println("enter the cost of the cost");
		double cost=sc.nextDouble();
		System.out.println("enter the the quantity");
		int quantity=sc.nextInt();
		statement.setInt(1, id);
		statement.setString(2, name);
		statement.setDouble(3, 50);
		statement.setInt(4, 1);
		int executeUpdate = statement.executeUpdate();
		System.out.println(executeUpdate);
	}catch(SQLException e) {
		e.printStackTrace();
	}

}
}
