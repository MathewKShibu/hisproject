package com.ibsplc.his.api_his_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibsplc.his.api_his_project.model.FlightDetails;
import com.ibsplc.his.api_his_project.model.FlightExpandedInfo;
import com.ibsplc.his.api_his_project.model.FlightMaintenance;
import com.ibsplc.his.api_his_project.service.FlightService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class FlightController {
	
	@Autowired
	FlightService flightService;
	
	@GetMapping("/flightdetails")
	public List<FlightDetails> showFlightDetails() 
	{
		return flightService.getFlightDetails();
	}
	
	@GetMapping("/flightdetails/{flight_id}")
	public List<FlightDetails> showFlightDetailsById(@PathVariable int flight_id) 
	{
		return flightService.getFlightDetailsByFlight_id(flight_id);
	}
	
	@GetMapping("/maintenancedetails")
	public List<FlightMaintenance> showMaintenanceDetails() 
	{
		return flightService.getFlightMaintenanceDetails();
	}
	
	@GetMapping("/maintenancedetails/{maintenance_id}")
	public List<FlightMaintenance> showMaintenanceDetailsById(@PathVariable int maintenance_id) 
	{
		return flightService.getFlightMaintenanceDetailsByMaintenance_id(maintenance_id);
	}
	
	@GetMapping("/expandeddetails")
	public List<FlightExpandedInfo> showExpandedDetails()
	{
		return flightService.getExpandedFlightInfo();
	}
	
	@PostMapping("/addflightdetails")
	public ResponseEntity<String> insertFlightDetails(@RequestBody FlightDetails flightDetails)
	{
		System.out.println(flightDetails);
		String addStatus="";
		ResponseEntity<String> newFlightEntity=null;
		boolean test=flightService.addFlightDetails(flightDetails);
		if(test)
		{
			addStatus="{\"Status\":\"Success\"}";
			newFlightEntity=new ResponseEntity<String>(addStatus,HttpStatus.CREATED);
		}
		else
		{
			addStatus="{\"Status\":\"Failure\"}";
			newFlightEntity=new ResponseEntity<String>(addStatus,HttpStatus.NOT_IMPLEMENTED);
		}
		return newFlightEntity;
	}
	
	@PostMapping("/addmaintenancedetails")
	public  ResponseEntity<String> insertMaintenanceDetails(@RequestBody FlightMaintenance flightMaintenance)
	{
		System.out.println(flightMaintenance);
		String addStatus="";
		ResponseEntity<String> newMaintenanceEntity=null;
		boolean test=flightService.addMaintenanceDetails(flightMaintenance);
		if(test)
		{
			addStatus="{\"Status\":\"Success\"}";
			newMaintenanceEntity=new ResponseEntity<String>(addStatus,HttpStatus.CREATED);
		}
		else
		{
			addStatus="{\"Status\":\"Failure\"}";
			newMaintenanceEntity=new ResponseEntity<String>(addStatus,HttpStatus.NOT_IMPLEMENTED);
		}
		return newMaintenanceEntity;
	}
	
	@DeleteMapping("/deleteflightdetails/{flight_id}")
	public ResponseEntity<String> deleteFlightDetails(@PathVariable int flight_id)
	{
		String deleteStatus="";
		ResponseEntity<String> newMaintenanceEntity=null;
		boolean test=flightService.deleteFlightDetails(flight_id);
		if(test)
		{
			deleteStatus="{\"Status\":\"Success\"}";
			newMaintenanceEntity=new ResponseEntity<String>(deleteStatus,HttpStatus.OK);
		}
		else
		{
			deleteStatus="{\"Status\":\"Failure\"}";
			newMaintenanceEntity=new ResponseEntity<String>(deleteStatus,HttpStatus.NOT_IMPLEMENTED);
		}
		return newMaintenanceEntity;

	}
	
	@DeleteMapping("/deletemaintenancedetails/{maintenance_id}")
	public ResponseEntity<String> deleteMaintenanceDetails(@PathVariable int maintenance_id)
	{
		String deleteStatus="";
		ResponseEntity<String> newMaintenanceEntity=null;
		boolean test=flightService.deleteMaintenanceDetails(maintenance_id);
		if(test)
		{
			deleteStatus="{\"Status\":\"Success\"}";
			newMaintenanceEntity=new ResponseEntity<String>(deleteStatus,HttpStatus.OK);
		}
		else
		{
			deleteStatus="{\"Status\":\"Failure\"}";
			newMaintenanceEntity=new ResponseEntity<String>(deleteStatus,HttpStatus.NOT_IMPLEMENTED);
		}
		return newMaintenanceEntity;

	}
	
	@PostMapping("/updatemaintenancestatus/{maintenance_id}")
	public ResponseEntity<String> updateMaintenanceDetails(@PathVariable int maintenance_id,@RequestBody FlightMaintenance flightMaintenance)
	{
		String updateStatus="";
		ResponseEntity<String> newMaintenanceEntity=null;
		boolean test=flightService.updateMaintenanceDetails(maintenance_id, flightMaintenance);
		if(test)
		{
			updateStatus="{\"Status\":\"Success\"}";
			newMaintenanceEntity=new ResponseEntity<String>(updateStatus,HttpStatus.OK);
		}
		else
		{
			updateStatus="{\"Status\":\"Failure\"}";
			newMaintenanceEntity=new ResponseEntity<String>(updateStatus,HttpStatus.NOT_IMPLEMENTED);
		}
		return newMaintenanceEntity;
	}
	
	

}
