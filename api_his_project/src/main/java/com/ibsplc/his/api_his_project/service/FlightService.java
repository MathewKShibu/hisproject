package com.ibsplc.his.api_his_project.service;

import java.util.List;

import com.ibsplc.his.api_his_project.model.FlightDetails;
import com.ibsplc.his.api_his_project.model.FlightExpandedInfo;
import com.ibsplc.his.api_his_project.model.FlightMaintenance;

public interface FlightService {
	public List<FlightDetails> getFlightDetails();
	public FlightDetails getFlightDetailsByFlight_id(int flight_id);
	public List<FlightMaintenance> getFlightMaintenanceDetails();
	public FlightMaintenance getFlightMaintenanceDetailsByMaintenance_id(int maintenanace_id);
	public List<FlightExpandedInfo> getExpandedFlightInfo();
	
	public void addFlightDetails(FlightDetails flightDetails);
	public void addMaintenanceDetails(FlightMaintenance flightMaintenance);

}
