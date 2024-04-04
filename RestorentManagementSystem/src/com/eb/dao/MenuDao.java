package com.eb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.eb.database.CP;
import com.eb.model.Menu;

public class MenuDao {
	
		public static boolean createMenu(Menu m) {
			
			try {
				boolean f=false;
				Connection conn=CP.createc();
				String query="insert into menu (menuname,menutype,prise,quantity)values(?,?,?,?)";
			     PreparedStatement p=conn.prepareStatement(query);
			     p.setString(1, m.getMenuName());
			     p.setString(2, m.getMenuType());
			     p.setInt(3,m.getPrise());
			     p.setInt(4, m.getQuantity());
			     p.executeUpdate();
			     f=true;
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return false;
			}
			     public static boolean updateMenuData(int val,String toUpdate,int id,Menu m) {
			 		boolean f=false;
			 		try {
			 			Connection conn=CP.createc();
			 			if(val==1) {
			 				//update menu name
			 				String query="update menu set menuname=? where menuid=?";
			 				PreparedStatement ps=conn.prepareStatement(query);
			 				ps.setString(1, toUpdate);
			 				ps.setInt(2, id);
			 				ps.executeUpdate();
			 				f=true;
			 			}
			 			else if(val==2) {
			 				//update menu type
			 				String query="update menu set menutype=? where menuid=?";
			 				PreparedStatement ps=conn.prepareStatement(query);
			 				ps.setString(1, toUpdate);
			 				ps.setInt(2, id);
			 				ps.executeUpdate();
			 				f=true;
			 			}
			 			
			 			else {
			 				System.out.println("No updation");
			 		
			     }}
			
			catch(Exception e) {
				e.printStackTrace();
			}}
			 		public static boolean deleteMenu(int menuid) {
			 			boolean f=false;
			 			try {
			 				Connection conn=CP.createc();
			 				String query="delete from menu where menuid=?";
			 				PreparedStatement ps=conn.prepareStatement(query);
			 				ps.setInt(1, menuid);
			 				ps.executeUpdate();
			 				f=true;
			 				
			 			}
			 			catch(Exception e) {
			 				e.printStackTrace();
			 			}
			return false;
		}
}