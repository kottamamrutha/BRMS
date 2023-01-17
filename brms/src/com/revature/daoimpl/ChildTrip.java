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
		
		System.out.println("Enter BoardingTime to Delete");
		String boardingTime=sc.nextLine();
		
		System.out.println("Enter ArrivalTime to Delete");
		String arrivalTime=sc.nextLine();
		
		System.out.println("Enter TicketCharges to Delete");
		int ticketCharges=sc.nextInt();
		
		Trip obj=new Trip();
		
		for(Trip i : details) {
			if(i.getBoardingTime().equals(boardingTime)&& i.getArrivalTime().equals(arrivalTime)&&
					i.getTicketCharges()==ticketCharges) 
			{
				obj=i;
				
			}
			
		}
		details.remove(obj);
	}
	
	public  void updateTripDetails() {
		
		System.out.println("Enter Trip Where to Update BoardingTime and ArrivalTime");
	    System.out.println("Enter BoardingTime");
	    String boardingTime=sc.nextLine();
	    
	    System.out.println("Enter ArrivalTime");
	    String arrivalTime=sc.nextLine();
	    
	    System.out.println("Enter TicketCharges");
	    int ticketCharges=sc.nextInt();
	    
		System.out.println("Select from below options to Update  ");
		System.out.println("1.BoardingTime");
		System.out.println("2.ArrivalTime");
		System.out.println("3.TicketCharges");
		 
		int choice=sc.nextInt();
		if(choice==1) {
		System.out.println("Enter BoardingTime to update:");
		
		for(Trip i:details) {
			if(i.getBoardingTime().equals(boardingTime)&& i.getArrivalTime().equals(arrivalTime)&&
					i.getTicketCharges()==ticketCharges) 
			{
				i.setBoardingTime(sc.nextLine());
				
			}
		}
		}
		else if(choice==2) {
			System.out.println("Enter ArrivalTime to update:");
			for(Trip i:details) {
				if(i.getBoardingTime().equals(boardingTime) && i.getArrivalTime().equals(arrivalTime)&& i.getTicketCharges()==ticketCharges) {
					i.setArrivalTime(sc.next());
					
				}
	     	}
		}
		 
		else if(choice==3) {
			System.out.println("Enter TicketCharges to update:");
 
			for(Trip i:details) {
				if(i.getBoardingTime().equals(boardingTime) && i.getArrivalTime().equals(arrivalTime)) {
					
					i.setTicketCharges(sc.nextInt());
					 
				
				}
			
			}
		}
	}
	
	public  void showTripDetails() {
		
		for(Trip i : details )
		{
			System.out.println(i);
		}
	}


	

}
