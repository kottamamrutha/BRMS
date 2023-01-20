package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.model.Trip;

public interface TripManagement {
	public Trip getTrip(Trip toBeInserted) throws SQLException;
	public abstract void addTripDetails()throws SQLException;

	public abstract void deleteTripDetails()throws SQLException;

	public abstract void updateTripDetails();
	
	public abstract List<Trip> showTripDetails()throws SQLException;
}

