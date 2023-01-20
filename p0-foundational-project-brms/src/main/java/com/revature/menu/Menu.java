package com.revature.menu;

import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.daoimpl.TripDaoImpl;
import com.revature.model.Trip;
import com.revature.service.impl.LoginImplementation;
import com.revature.constants.Constant;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
 
	public static void main(String[] args) throws SQLException {
		
		LoginImplementation a= new LoginImplementation();
		a.adminLogin();
		

	}

	public static void menu() throws SQLException {
		final Logger logger=Logger.getLogger(TripDaoImpl.class);
		Scanner sc=new Scanner(System.in);
		TripDaoImpl ts=new TripDaoImpl ();
		Trip trip=new Trip();
		
		while(true)
		{
			System.out.println("----Enter the Trip Details----");
			System.out.println("1.Add Trip Details");
			System.out.println("2.deleteTripDetails");
			System.out.println("3.updateTripDetails");
			System.out.println("4.showTripDetails\n");
			System.out.println("Enter your choice: ");
			
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:ts.addTripDetails();break;
			case 2:ts.deleteTripDetails();break;
			case 3:ts.updateTripDetails();break;
			case 4:ts.showTripDetails();break;
			
			default: System.out.println("enter between 1 and 4 only");break;
			}

		}
	}

}
