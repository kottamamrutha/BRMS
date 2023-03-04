package com.revature.daoimpl;

import com.revature.config.DatabaseConnection;
import com.revature.constants.Constant;
import com.revature.dao.TripManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.model.Trip;

public class TripDaoImpl implements TripManagement {
	 
	public static final Logger logger=Logger.getLogger(TripDaoImpl.class);
	private static Connection con=DatabaseConnection.getConnection();
	
	Scanner sc=new Scanner(System.in);
	public static int r=0;
	Statement stm=null;
    
	
	public Trip getTrip(Trip toBeInserted) throws SQLException {
		Connection con = null;
		con = DatabaseConnection.getConnection();
		boolean found=false;
		Trip obj=new Trip();
		try {
			int getTripId=toBeInserted.getTripId();
			stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM trip_management");
			
			while(rs.next()) {
				if(getTripId==rs.getInt(1)) {
					found=true;
					obj.setTripId(getTripId);
					obj.setBoardingTime(rs.getString(2));
					obj.setArrivalTime(rs.getString(3));
					obj.setTicketCharges(rs.getInt(4));
					
				}
			}
			
			
		} catch (SQLException e) {
		}
		// TODO Auto-generated method stub
		if(found==true) {
			return obj;
		}
		return null;
	}

  
	public void addTripDetails() throws SQLException {
		 
		
		String insertQuery = Constant.INSERT_QUERY;
		PreparedStatement ps = con.prepareStatement(insertQuery);
		logger.info("enter TripId");
		int tripId=sc.nextInt();
		
		logger.info("enter  BoardingTime");
		String boardingTime=sc.next();
		
		logger.info("enter ArrivalTime");
		String arrivalTime=sc.next();
		
		logger.info("enter TicketCharges");
		int ticketCharges=sc.nextInt();
		
		logger.info("enter BusRegNo");
		String busRegNo=sc.next();
		
		logger.info("enter routeId");
		int routeId=sc.nextInt();
		
	    ps.setInt(1,tripId);
    	ps.setString(2,boardingTime);
        ps.setString(3,arrivalTime);
        ps.setInt(4,ticketCharges);
        ps.setString(5,busRegNo);
        ps.setInt(6, routeId);
		//logger.debug("I want to inspect PreparedStatement Object: " +ps);
		int n = ps.executeUpdate();
		ps.close();
		//logger.info("Added Trip Details");
		if(n>0)
			logger.info("Values inserted Successfully");
		//tripDetails.add(route1);
		
		
	}



	public void deleteTripDetails() throws SQLException {
		// TODO Auto-generated method stub
		String deleteQuery = Constant.DELETE_QUERY;
		PreparedStatement ps = con.prepareStatement(deleteQuery);
		logger.info("enter TripId");
		int tripId=sc.nextInt();
		ps.setInt(1, tripId);
		int n=ps.executeUpdate();
		if(n>0)
			logger.info("Values Deleted Sucessfully");

	}

	 	
	public void updateTripDetails() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// logger.info("Driver Loaded");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306" + "/project_brms", "root", "Amrutha+123");
			//logger.info("Connection Established");
			
			logger.info(
					"Which field you want to update \npress 1:update to TripId\nPress 2:Update BoardingTime\nPress 3:Update ArrivalTime\nPress 4:Update TicketCharges");
			int press = sc.nextInt();

			switch (press) {
			case 1:
				logger.info("enter TripId to update: ");
				int tripId=sc.nextInt();
				logger.info("enter new TripId: ");
				int newTripId=sc.nextInt();
				String updateQuery = Constant.UPDATE_QUERY;
				PreparedStatement ps = con.prepareStatement(updateQuery);
				ps.setInt(1,newTripId );
				ps.setInt(2, tripId);
				int n=ps.executeUpdate();
				logger.info(n);
				;break;
			case 2:
				logger.info("enter TripId to update: ");
				int tripId1=sc.nextInt();
				logger.info("enter new BoardingTime: ");
				String newBoardingTime=sc.next();
				String updateQuery1 = Constant.UPDATE_QUERY1;
				PreparedStatement ps1 = con.prepareStatement(updateQuery1);
				ps1.setString(1,newBoardingTime );
				ps1.setInt(2, tripId1);
				int n1=ps1.executeUpdate();
				logger.info(n1);
				;break;
			case 3:
				logger.info("enter TripId to update: ");
				tripId1=sc.nextInt();
				logger.info("enter new ArrivalTime: ");
				String newArrivalTime=sc.next();
				updateQuery1 = Constant.UPDATE_QUERY2;
				ps1 = con.prepareStatement(updateQuery1);
				ps1.setString(1, newArrivalTime);
				ps1.setInt(2, tripId1);
				n1=ps1.executeUpdate();
				logger.info(n1);
				;break;
			case 4:
				logger.info("enter TripId to update: ");
				tripId1=sc.nextInt();
				logger.info("enter new TicketCharges: ");
				String newTicketCharges=sc.next();
				updateQuery1 = Constant.UPDATE_QUERY3;
				ps1 = con.prepareStatement(updateQuery1);
				ps1.setString(1,newTicketCharges );
				ps1.setInt(2, tripId1);
				n1=ps1.executeUpdate();
				logger.info(n1);
				;break; 		 

			default:
				logger.info("please enter a valid number");

			}
			

		} catch (ClassNotFoundException | SQLException e) {
			logger.info(e.getMessage());
		}
		
			
		
	}
		
	
	
	public List<Trip> showTripDetails()throws SQLException {
		// TODO Auto-generated method stub
		
		String selectAllQuery = Constant.SELECT_ALL_QUERY;
		PreparedStatement ps = con.prepareStatement(selectAllQuery);
		ResultSet rs=ps.executeQuery();
		List<Trip> trips=new ArrayList<Trip>();
		while(rs.next()) {
			r=r+1;
			Trip trip=new Trip();
			
			int tripId=rs.getInt(1);
			String boardingTime=rs.getString(2);
			String arrivalTime=rs.getString(3);
			int ticketCharges=rs.getInt(4);
			String busRegNo=rs.getString(5);
			int routeId=rs.getInt(6);
			
			trip.setTripId(tripId);
			trip.setBoardingTime(boardingTime);
			trip.setArrivalTime(arrivalTime);
			trip.setTicketCharges(ticketCharges);
			trip.setBusRegNo(busRegNo);
			trip.setRouteId(routeId);
			
			trips.add(trip);
		}
		for(Trip a:trips) {
			logger.info(a);
		}
		return trips;
		
	}

	

	
}
