package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.model.Trip;

public interface TripManagement {
	public Trip getTrip(Trip toBeInserted) throws SQLException;
	public abstract int addTripDetails(Trip trip)throws SQLException;

	public abstract void deleteTripDetails(int tripId)throws SQLException;

	public abstract void updateTripDetails(int tripId,String newValue,int press);
	
	public abstract void showTripDetails();
}

