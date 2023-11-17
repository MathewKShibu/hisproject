package com.ibsplc.his.api_his_project.service;

import java.util.ArrayList;
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
		List<FlightDetails> fd=new ArrayList<FlightDetails>();
		try
		{
			fd=getMapper.getFlightDetails();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return fd;
	}

	@Override
	public FlightDetails getFlightDetailsByFlight_id(int flight_id) {
		FlightDetails fdid = null;
		try
		{
			fdid=getMapper.getFlightDetailsByFlight_id(flight_id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return fdid;
	}

	@Override
	public List<FlightMaintenance> getFlightMaintenanceDetails() {
		List<FlightMaintenance> fmd=new ArrayList<FlightMaintenance>();
		try
		{
		fmd=getMapper.getFlightMaintenanceDetails();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return fmd;
	}

	@Override
	public FlightMaintenance getFlightMaintenanceDetailsByMaintenance_id(int maintenance_id) {
		FlightMaintenance fmdid=null;
		try
		{
		fmdid=getMapper.getFlightMaintenanceDetailsByMaintenance_id(maintenance_id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return fmdid;
	}

	@Override
	public List<FlightExpandedInfo> getExpandedFlightInfo() {
		List<FlightExpandedInfo> ei=new ArrayList<FlightExpandedInfo>();
		try
		{
		ei=getMapper.getExpandedFlightInfo();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ei;
	}

	@Override
	public void addFlightDetails(FlightDetails flightDetails) {
		try
		{
			getMapper.addFlightDetails(flightDetails);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
    @Override
	public void addMaintenanceDetails(FlightMaintenance flightMaintenance) {
    	try
    	{
		getMapper.addMaintenanceDetails(flightMaintenance);	
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
	}
}
