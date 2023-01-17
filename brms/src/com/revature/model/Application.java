package com.revature.model;

import java.util.Comparator;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		Trip t1 = new Trip(0001, "21:00:30","7:15:00",580);
		Trip t2 = new Trip(0002, "21:00:30","6:15:00",580);
		Trip t3 = new Trip(0003, "21:00:30","12:15:00",580);
		Trip t4 = new Trip(0004, "21:00:30","6:15:00",580);
		 
		TreeSet<Trip> ts = new TreeSet<Trip>(new Comparator<Trip>() {

			@Override
			public int compare(Trip o1, Trip o2) {
				// TODO Auto-generated method stub
				//return o1.getArrivalTime().compareTo(o2.getArrivalTime());
				return o1.getTicketCharges()-o2.getTicketCharges();
				
			}
		});
		ts.add(t1);
		ts.add(t2);
		ts.add(t3);
		ts.add(t4);
		
		System.out.println(ts); 

		


	}

}
