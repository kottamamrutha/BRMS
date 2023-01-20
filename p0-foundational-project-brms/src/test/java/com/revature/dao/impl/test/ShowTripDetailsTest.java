package com.revature.dao.impl.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.revature.daoimpl.TripDaoImpl;
public class ShowTripDetailsTest {
	@Test
	public void test()
	{
		TripDaoImpl td=new TripDaoImpl();
		
		try {
			td.showTripDetails();
			int x=TripDaoImpl.r;
			assertEquals(x,TripDaoImpl.r);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
