package com.ibsplc.his.api_his_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibsplc.his.api_his_project.model.FlightDetails;
import com.ibsplc.his.api_his_project.model.FlightExpandedInfo;
import com.ibsplc.his.api_his_project.model.FlightMaintenance;
import com.ibsplc.his.api_his_project.service.FlightService;

@CrossOrigin(origins = "*")
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
	public FlightDetails showFlightDetailsById(@PathVariable int flight_id) 
	{
		return flightService.getFlightDetailsByFlight_id(flight_id);
	}
	
	@GetMapping("/maintenancedetails")
	public List<FlightMaintenance> showMaintenanceDetails() 
	{
		return flightService.getFlightMaintenanceDetails();
	}
	
	@GetMapping("/maintenancedetails/{maintenance_id}")
	public FlightMaintenance showMaintenanceDetailsById(@PathVariable int maintenance_id) 
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
		String addStatus="{\"Status\":\"Success\"}";
		ResponseEntity<String> newFlightEntity=null;
		flightService.addFlightDetails(flightDetails);
		newFlightEntity=new ResponseEntity<String>(addStatus,HttpStatus.CREATED);
		return newFlightEntity;
	}
	
	@PostMapping("/addmaintenancedetails")
	public  ResponseEntity<String> insertMaintenanceDetails(@RequestBody FlightMaintenance flightMaintenance)
	{
		System.out.println(flightMaintenance);
		String addStatus="{\"Status\":\"Success\"}";
		ResponseEntity<String> newMaintenanceEntity=null;
		flightService.addMaintenanceDetails(flightMaintenance);
		newMaintenanceEntity=new ResponseEntity<String>(addStatus,HttpStatus.CREATED);
		return newMaintenanceEntity;
	}

}
