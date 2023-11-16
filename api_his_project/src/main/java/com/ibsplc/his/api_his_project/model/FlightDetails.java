package com.ibsplc.his.api_his_project.model;

public class FlightDetails {

	private int flight_id;
	private String flight_number;
	private String aircraft_type;
	private String depature_location;
	private String destination_location;
	
	
	public FlightDetails()
	{		
	}
	
	public FlightDetails(int flight_id, String flight_number, String aircraft_type, String depature_location,
			String destination_location) {
		super();
		this.flight_id = flight_id;
		this.flight_number = flight_number;
		this.aircraft_type = aircraft_type;
		this.depature_location = depature_location;
		this.destination_location = destination_location;
	}

	public int getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}

	public String getFlight_number() {
		return flight_number;
	}

	public void setFlight_number(String flight_number) {
		this.flight_number = flight_number;
	}

	public String getAircraft_type() {
		return aircraft_type;
	}

	public void setAircraft_type(String aircraft_type) {
		this.aircraft_type = aircraft_type;
	}

	public String getDepature_location() {
		return depature_location;
	}

	public void setDepature_location(String depature_location) {
		this.depature_location = depature_location;
	}

	public String getDestination_location() {
		return destination_location;
	}

	public void setDestination_location(String destination_location) {
		this.destination_location = destination_location;
	}

	@Override
	public String toString() {
		return "FlightDetails [flight_id=" + flight_id + ", flight_number=" + flight_number + ", aircraft_type="
				+ aircraft_type + ", depature_location=" + depature_location + ", destination_location="
				+ destination_location + "]";
	}
	
	
	
}
