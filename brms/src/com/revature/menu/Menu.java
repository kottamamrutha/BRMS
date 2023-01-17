package com.revature.menu;

import java.util.Scanner;
import com.revature.daoimpl.ChildTrip;
 
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ChildTrip obj =new ChildTrip();
		
		while(true)
		{
			System.out.println("----Enter the Trip Details----");
			System.out.println("1.Add Trip Details");
			System.out.println("2.deleteTripDetails");
			System.out.println("3.upadateTripDetails");
			System.out.println("4.showTripDetails\n");
			System.out.println("Enter your choice: ");
			
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:obj.addTripDetails();break;
			case 2:obj.deleteTripDetails();break;
			case 3:obj.updateTripDetails();break;
			case 4:obj.showTripDetails();break;
			default: System.out.println("enter between 1 and 4 only");break;
			}

			
			
		}
		

	}

}
