package com.eb.database;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CP {
static Connection conn;
	
	public static Connection createc()
 {
try {	
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/crud11221";;
	String username="root";
	String password="root";
	conn=DriverManager.getConnection(url,username,password);
}
catch(Exception e)
{
	e.printStackTrace();
}
return conn;
}
	public static void shoAllMenus() {
		boolean f=false;
		try {
			Connection conn=CP.createc();
			String query="Select * from menu";
			Statement st=(Statement) conn.createStatement();
			ResultSet rs=((java.sql.Statement) st).executeQuery(query);
			while(rs.next()) {
				int id=rs.getInt(1);
				String menuname=rs.getString(2);
				String menutype=rs.getString(3);
				int prise=rs.getInt(4);
				int quantity=rs.getInt(5);
				System.out.println("Menu Id:"+id+"\nMenu Name:"+menuname+
						"\nMenu Type:"+menutype+"\nMenu Prise:"+prise+"\nMenu quantity:"+quantity);
				
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}}

}
