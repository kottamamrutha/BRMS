package com.revature.service.impl;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
 
import java.sql.Statement;
import java.util.Scanner;

import org.apache.log4j.Logger;
import com.revature.config.DatabaseConnection;
import com.revature.menu.Menu;
import com.revature.model.User;
import com.revature.service.Login;

public class LoginImplementation implements Login {
	Scanner sc = new Scanner(System.in);
	Menu m=new Menu();
	Connection con=null;
	private static final Logger logger=Logger.getLogger(LoginImplementation.class);
	public void adminLogin() throws SQLException {
		con=DatabaseConnection.getConnection();
		int logoff=0;
		do {
			logger.info("\n#####ENTER LOGIN DETAILS #####");
			logger.info("\n ENTER YOUR USERNAME : ");
			String username=sc.next();
			
			logger.info("\n ENTER YOUR PASSWORD");
			String password =sc.next();
			
			java.sql.Statement stms=con.createStatement();
			ResultSet rs = stms.executeQuery("select * from User");
			
			if(rs.next()) {
				if(username.equals(rs.getString(1)) && password.equals(rs.getString(2))) {
					logger.info("\n########### WELCOME ###########\n");
					m.menu();
					
				}
				else {
					logger.info("\nEnter correct details\n");
					logger.info("\nWant to enter again press-1\n");
					int again=sc.nextInt();
					logoff=again;
				}
			}

			}while(logoff==1);
	}

	@Override
	public User getUser(User u) {
		Connection con=null;
		con=DatabaseConnection.getConnection();
		try {
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("Select * from User");
			while(rs.next())
			{
				if(u.getUsername().equals(rs.getString(1))&& u.getPassword().equals(rs.getString(2))) {
					u.setUsername(rs.getString(1));
					u.setPassword(rs.getString(2));
					u.setPassword(rs.getString(3));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {}
		return u;
	}
		
}
			
			
		
