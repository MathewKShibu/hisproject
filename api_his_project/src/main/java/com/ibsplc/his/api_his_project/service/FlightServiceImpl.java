package com.ibsplc.his.api_his_project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
			if(fd.isEmpty())
			{
				throw new FlightDetailsNotFoundException("No flight details found");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return fd;
	}

	@Override
	public List<FlightDetails> getFlightDetailsByFlight_id(int flight_id) {
		//FlightDetails fdid = null;
		List<FlightDetails> flightdetails=new ArrayList<FlightDetails>();
		try
		{
			//fdid=getMapper.getFlightDetailsByFlight_id(flight_id);
			flightdetails=getMapper.getFlightDetails().stream()
					      .filter(flightinfo->flightinfo.getFlight_id()==flight_id)
					      .collect(Collectors.toList());
			if(flightdetails.isEmpty())
			{
				throw new FlightDetailsNotFoundException("No flight details flound on given flight_id");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flightdetails;
	}

	@Override
	public List<FlightMaintenance> getFlightMaintenanceDetails() {
		List<FlightMaintenance> fmd=new ArrayList<FlightMaintenance>();
		try
		{
			fmd=getMapper.getFlightMaintenanceDetails();
			if(fmd.isEmpty())
			{
				throw new FlightDetailsNotFoundException("No maintenance details found");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return fmd;
	}

	@Override
	public List<FlightMaintenance> getFlightMaintenanceDetailsByMaintenance_id(int maintenance_id) {
		//FlightMaintenance fmdid=null;
		List<FlightMaintenance> maintenancedetails=new ArrayList<FlightMaintenance>();
		try
		{
			//fmdid=getMapper.getFlightMaintenanceDetailsByMaintenance_id(maintenance_id);
			maintenancedetails=getMapper.getFlightMaintenanceDetails().stream()
							   .filter(maintenanceinfo->maintenanceinfo.getMaintenance_id()==maintenance_id)
							   .collect(Collectors.toList());
			if(maintenancedetails.isEmpty())
			{
				throw new FlightDetailsNotFoundException("No maintenance details found on given maintenance_id");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return maintenancedetails;
	}

	@Override
	public List<FlightExpandedInfo> getExpandedFlightInfo() {
		List<FlightExpandedInfo> ei=new ArrayList<FlightExpandedInfo>();
		try
		{
			ei=getMapper.getExpandedFlightInfo();
			if(ei.isEmpty())
			{
				throw new FlightDetailsNotFoundException("Expanded info not found");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ei;
	}

	@Override
	public boolean addFlightDetails(FlightDetails flightDetails) {
		boolean test;
		try
		{
			test=true;
			getMapper.addFlightDetails(flightDetails);
		}
		catch(Exception e)
		{
			test=false;
			e.printStackTrace();
		}
		return test;
	}
	
    @Override
	public boolean addMaintenanceDetails(FlightMaintenance flightMaintenance) {
    	boolean test;
    	try
    	{
    		test=true;
    		getMapper.addMaintenanceDetails(flightMaintenance);	
    	}
    	catch(Exception e)
    	{
    		test=false;
    		e.printStackTrace();
    	}
    	return test;
	}

	@Override
	public boolean deleteFlightDetails(int flight_id) {
		boolean test;
		try
		{
			test=true;
			getMapper.deleteFlightDetails(flight_id);
		}
		catch(Exception e)
		{
			test=false;
			e.printStackTrace();
		}
		return test;
	}

	@Override
	public boolean deleteMaintenanceDetails(int maintenance_id) {
		boolean test;
		try
		{
			test=true;
			getMapper.deleteMaintenanceDetails(maintenance_id);
		}
		catch(Exception e)
		{
			test=false;
			e.printStackTrace();
		}
		return test;
		
	}

	@Override
	public boolean updateMaintenanceDetails(int maintenance_id, FlightMaintenance flightMaintenance) {
		boolean test;
		try
		{
			test=true;
			getMapper.updateMaintenanceDetails(maintenance_id, flightMaintenance);
		}
		catch(Exception e)
		{
			test=false;
			e.printStackTrace();
		}
		return test;
		
	}
}
