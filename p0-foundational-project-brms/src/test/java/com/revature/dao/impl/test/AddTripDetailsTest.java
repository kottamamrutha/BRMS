package com.revature.dao.impl.test;
import static org.junit.Assert.assertEquals;
 
import com.revature.dao.TripManagement;
 
import com.revature.daoimpl.TripDaoImpl;
import com.revature.model.Trip;
public class AddTripDetailsTest {
	
	@org.junit.Test
	public void Test(){
	Trip toBeInserted=new Trip(1001,"08:10:15","03:20:00",900,101);
	Trip inserted=null;
	try {
		TripManagement t=new TripDaoImpl();
		t.addTripDetails();
		inserted=t.getTrip(toBeInserted);
	} catch (Exception e) {}
	assertEquals(toBeInserted.getTripId(),inserted.getTripId());
	assertEquals(toBeInserted.getBoardingTime(), inserted.getBoardingTime());
	assertEquals(toBeInserted.getArrivalTime(), inserted.getArrivalTime());
	assertEquals(toBeInserted.getTicketCharges(), inserted.getTicketCharges());
 
	}
}
