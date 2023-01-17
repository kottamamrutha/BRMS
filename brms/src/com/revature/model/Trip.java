package com.revature.model;

public class Trip {
	
	private String boardingTime;
	private String arrivalTime;
	private int ticketCharges;
	
	public Trip() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trip(String boardingTime, String arrivalTime, int ticketCharges) {
		super();
		this.boardingTime = boardingTime;
		this.arrivalTime = arrivalTime;
		this.ticketCharges = ticketCharges;
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

	@Override
	public String toString() {
		return "Trip [boardingTime=" + boardingTime + ", arrivalTime=" + arrivalTime + ", ticketCharges="
				+ ticketCharges + "]";
	}
		
}
