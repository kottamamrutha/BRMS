package com.revature.daoimpl;

import com.revature.dao.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Scanner;

import static java.lang.System.*;

import com.revature.model.*;



public class ChildTrip implements TripManagement {
	Scanner sc=new Scanner(System.in);
	
	private static LinkedHashSet<Trip>  details;
	static {
		details = new LinkedHashSet<Trip>();
	}

	public void addTripDetails()
	{
		Trip t1 = new Trip();
		
		System.out.println("Enter Boarding Time:");
		t1.setBoardingTime(sc.nextLine());
		
		System.out.println("Enter Arrival Time):");
		t1.setArrivalTime(sc.nextLine());
		
		System.out.println("Enter Ticket Charges:");
		
		t1.setTicketCharges(Integer.parseInt(sc.nextLine()));
			
		details.add(t1);
					
	}
	public  void deleteTripDetails() {
		
	}
	public  void updateTripDetails() {
		
		
	}
	
	public  void showTripDetails() {
		
		for(Trip i : details )
		{
			System.out.println(i);
		}
	}


	

}
