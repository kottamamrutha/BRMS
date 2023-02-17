package com.revature.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.daoimpl.TripDaoImpl;
import com.revature.model.Trip;

/**
 * Servlet implementation class AddTrip
 */
public class AddTrip extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTrip() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int tId=Integer.parseInt(request.getParameter("tripId"));
		String bTime=request.getParameter("boardingTime");
		String aTime=request.getParameter("arrivalTime");
		int tCharges=Integer.parseInt(request.getParameter("ticketCharges"));
		String bReg=request.getParameter("busReg");
		int rId=Integer.parseInt(request.getParameter("routeId"));
		 
		Trip trip=new Trip(tId,bTime,aTime,tCharges,bReg,rId);
		TripDaoImpl t=new TripDaoImpl();
		try {
			t.addTripDetails(trip);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("addtrip.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
