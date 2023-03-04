package com.revature.model;

public class Trip {
	private int tripId;
	private String boardingTime;
	private String arrivalTime;
	private int ticketCharges;
	private String busRegNo;
	private int routeId;
	public Trip() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trip(int tripId, String boardingTime, String arrivalTime, int ticketCharges, String busRegNo, int routeId) {
		super();
		this.tripId = tripId;
		this.boardingTime = boardingTime;
		this.arrivalTime = arrivalTime;
		this.ticketCharges = ticketCharges;
		this.busRegNo = busRegNo;
		this.routeId = routeId;
	}
	public int getTripId() {
		return tripId;
	}
	public void setTripId(int tripId) {
		this.tripId = tripId;
	}
	public String getBoardingTime() {
		return boardingTime;
	}
	public void setBoardingTime(String boardingTime) {
		this.boardingTime = boardingTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getTicketCharges() {
		return ticketCharges;
	}
	public void setTicketCharges(int ticketCharges) {
		this.ticketCharges = ticketCharges;
	}
	public String getBusRegNo() {
		return busRegNo;
	}
	public void setBusRegNo(String busRegNo) {
		this.busRegNo = busRegNo;
	}
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	@Override
	public String toString() {
		return "Trip [tripId=" + tripId + ", boardingTime=" + boardingTime + ", arrivalTime=" + arrivalTime
				+ ", ticketCharges=" + ticketCharges + ", busRegNo=" + busRegNo + ", routeId=" + routeId + "]";
	}
	
	
}
