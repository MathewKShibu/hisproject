package com.ibsplc.his.api_his_project.service;

import java.util.List;

import com.ibsplc.his.api_his_project.model.FlightDetails;
import com.ibsplc.his.api_his_project.model.FlightExpandedInfo;
import com.ibsplc.his.api_his_project.model.FlightMaintenance;

public interface FlightService {
	public List<FlightDetails> getFlightDetails();
	public List<FlightDetails> getFlightDetailsByFlight_id(int flight_id);
	public List<FlightMaintenance> getFlightMaintenanceDetails();
	public List<FlightMaintenance> getFlightMaintenanceDetailsByMaintenance_id(int maintenanace_id);
	public List<FlightExpandedInfo> getExpandedFlightInfo();
	
	public boolean addFlightDetails(FlightDetails flightDetails);
	public boolean addMaintenanceDetails(FlightMaintenance flightMaintenance);
	public boolean deleteFlightDetails(int flight_id);
	public boolean deleteMaintenanceDetails(int maintenance_id);
	
	public boolean updateMaintenanceDetails(int maintenance_id,FlightMaintenance flightMaintenance);

}
