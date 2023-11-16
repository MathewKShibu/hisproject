package com.ibsplc.his.api_his_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibsplc.his.api_his_project.mapper.GetMapper;
import com.ibsplc.his.api_his_project.model.FlightDetails;
import com.ibsplc.his.api_his_project.model.FlightExpandedInfo;
import com.ibsplc.his.api_his_project.model.FlightMaintenance;

@Service
public class FlightServiceImpl implements FlightService {
	
	@Autowired
	GetMapper getMapper;

	@Override
	public List<FlightDetails> getFlightDetails() {
		return getMapper.getFlightDetails();
	}

	@Override
	public FlightDetails getFlightDetailsByFlight_id(int flight_id) {
		return getMapper.getFlightDetailsByFlight_id(flight_id);
	}

	@Override
	public List<FlightMaintenance> getFlightMaintenanceDetails() {
		return getMapper.getFlightMaintenanceDetails();
	}

	@Override
	public FlightMaintenance getFlightMaintenanceDetailsByMaintenance_id(int maintenance_id) {
		return getMapper.getFlightMaintenanceDetailsByMaintenance_id(maintenance_id);
	}

	@Override
	public List<FlightExpandedInfo> getExpandedFlightInfo() {
		return getMapper.getExpandedFlightInfo();
	}

	@Override
	public void addFlightDetails(FlightDetails flightDetails) {
		getMapper.addFlightDetails(flightDetails);
	}
	
    @Override
	public void addMaintenanceDetails(FlightMaintenance flightMaintenance) {
		getMapper.addMaintenanceDetails(flightMaintenance);	
	}
}
