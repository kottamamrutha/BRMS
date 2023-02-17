package com.revature.daoimpl;

import com.revature.config.ConnectionFactory;
import com.revature.config.DatabaseConnection;
import com.revature.constants.Constant;
import com.revature.dao.TripManagement;

import java.sql.Connection;
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
	private static Connection con=ConnectionFactory.getConnection();
	
	Scanner sc=new Scanner(System.in);
	public static int v=0;
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

	
	public int addTripDetails(Trip trip) throws SQLException{
		int n = 0;
		con = ConnectionFactory.getConnection();
		try {
			String insertQuery = Constant.INSERT_QUERY;
			PreparedStatement ps = con.prepareStatement(insertQuery);
			ps.setInt(1, trip.getTripId());
			ps.setString(2, trip.getBoardingTime());
			ps.setString(3, trip.getArrivalTime());
			ps.setInt(4, trip.getTicketCharges());
			ps.setString(5, trip.getBusRegNo());
			ps.setInt(6, trip.getRouteId());
			n = ps.executeUpdate();
			logger.info(n);

		} catch (SQLException e) {
			logger.error(e.getMessage());
		}
		return n;
	}

 
	
	
	public void deleteTripDetails(int tripId) throws SQLException{
		con = ConnectionFactory.getConnection();
		int n=0;
		try {
			String deleteQuery = Constant.DELETE_QUERY;
			PreparedStatement ps = con.prepareStatement(deleteQuery);
			ps.setInt(1, tripId);
			n = ps.executeUpdate();
			

		} catch (SQLException e) {
			logger.info(e.getMessage());
		}
		
	}
	 	
 
	
	
	public void updateTripDetails(int tripId,String newValue,int press) {
		con = ConnectionFactory.getConnection();
		try {
			switch (press) {
			case 1:
				int newValue1=Integer.parseInt(newValue);
				String updateQuery = Constant.UPDATE_QUERY;
				PreparedStatement ps = con.prepareStatement(updateQuery);
				ps.setInt(1, newValue1);
				ps.setInt(2, tripId);
				int n = ps.executeUpdate();
				logger.info(n);
				break;
			case 2:
				
			    updateQuery = Constant.UPDATE_QUERY1;
			    ps = con.prepareStatement(updateQuery);
				
				ps = con.prepareStatement(updateQuery);
				ps.setString(1, newValue);
				ps.setInt(2, tripId);
				n = ps.executeUpdate();
				logger.info(n);
				break;
			case 3:
				
				updateQuery = Constant.UPDATE_QUERY2;
				//String newArrivalTime=sc.next();
				ps = con.prepareStatement(updateQuery);
				
				ps.setString(1, newValue);
				ps.setInt(2, tripId);
				n = ps.executeUpdate();
				logger.info(n);
				break;
			case 4:
				
			
				updateQuery = Constant.UPDATE_QUERY3;
				//int newTicketCharges=sc.nextInt();
				ps = con.prepareStatement(updateQuery);
				int newValue2=Integer.parseInt(newValue);
				ps.setInt(1, newValue2);
				ps.setInt(2, tripId);
				n = ps.executeUpdate();
				logger.info(n);
				break;

			default:
				logger.info("\nplease enter a valid number");

			}

		} catch (SQLException e) {
			logger.error(e.getMessage());
		}

	}
		
	
	

	public void showTripDetails() {
		
		con = ConnectionFactory.getConnection();
		try {
			stm = con.createStatement();
			ResultSet res = stm.executeQuery("SELECT * FROM trip_management");
			while (res.next()) {
				v = v + 1;
				logger.info("\nTopic Name is :-  " + res.getString("Trip_Id"));
				logger.info("\nDuration is  :- " + res.getString("Boarding_Time"));
				logger.info("\nStart Date is :- " + res.getString("Arrival_Time"));
				logger.info("\nEnd Date is  :- " + res.getString("Ticket_Charges"));
				
			}
			logger.info(v);
		} catch (SQLException e) {
			logger.error(e.getMessage());
		}
	}
	
}
