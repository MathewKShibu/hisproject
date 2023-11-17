package com.ibsplc.his.api_his_project.model;

public class FlightExpandedInfo {
	private int flight_id;
	private String flight_number;
	private String aircraft_type;
	private int maintenance_id;
	private String maintenance_type;
	private String maintenance_date;
	private int maintenance_estimate_time;
	private int status_in_percent;
	
	public FlightExpandedInfo()
	{
		
	}
	
	

	public FlightExpandedInfo(int flight_id, String flight_number, String aircraft_type, int maintenance_id,
			String maintenance_type, String maintenance_date, int maintenance_estimate_time, int status_in_percent) {
		super();
		this.flight_id = flight_id;
		this.flight_number = flight_number;
		this.aircraft_type = aircraft_type;
		this.maintenance_id = maintenance_id;
		this.maintenance_type = maintenance_type;
		this.maintenance_date = maintenance_date;
		this.maintenance_estimate_time = maintenance_estimate_time;
		this.status_in_percent = status_in_percent;
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

	public int getMaintenance_id() {
		return maintenance_id;
	}

	public void setMaintenance_id(int maintenance_id) {
		this.maintenance_id = maintenance_id;
	}

	public String getMaintenance_type() {
		return maintenance_type;
	}

	public void setMaintenance_type(String maintenance_type) {
		this.maintenance_type = maintenance_type;
	}

	public String getMaintenance_date() {
		return maintenance_date;
	}

	public void setMaintenance_date(String maintenance_date) {
		this.maintenance_date = maintenance_date;
	}

	public int getMaintenance_estimate_time() {
		return maintenance_estimate_time;
	}

	public void setMaintenance_estimate_time(int maintenance_estimate_time) {
		this.maintenance_estimate_time = maintenance_estimate_time;
	}
	
	public int getStatus_in_percent() {
		return status_in_percent;
	}

	public void setStatus_in_percent(int status_in_percent) {
		this.status_in_percent = status_in_percent;
	}

	@Override
	public String toString() {
		return "FlightExpandedInfo [flight_id=" + flight_id + ", flight_number=" + flight_number + ", aircraft_type="
				+ aircraft_type + ", maintenance_id=" + maintenance_id + ", maintenance_type=" + maintenance_type
				+ ", maintenance_date=" + maintenance_date + ", maintenance_estimate_time=" + maintenance_estimate_time
				+ ", status_in_percent=" + status_in_percent + "]";
	}
	
}
