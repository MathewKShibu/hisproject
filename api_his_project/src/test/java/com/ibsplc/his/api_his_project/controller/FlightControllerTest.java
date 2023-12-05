package com.ibsplc.his.api_his_project.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.ibsplc.his.api_his_project.model.FlightDetails;
import com.ibsplc.his.api_his_project.model.FlightMaintenance;
import com.ibsplc.his.api_his_project.service.FlightService;

@SpringBootTest
public class FlightControllerTest
{
		@Mock
		private FlightService flightService;

		@Autowired
		private FlightController flightController;
	
	 @Test
	    public void testUpdateMaintenanceDetails() {
	        // Arrange
	        int maintenance_id =1 ;
	        

	        FlightMaintenance flightMaintenance = new FlightMaintenance(1,1,"Routine","2023-01-10",3,20);
	        when(flightService.updateMaintenanceDetails(maintenance_id, flightMaintenance)).thenReturn(true);
	 
	        // Act
	        ResponseEntity<String> responseEntity = flightController.updateMaintenanceDetails(maintenance_id, flightMaintenance);
	 
	        // Assert
	        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	        assertEquals("{\"Status\":\"Success\"}", responseEntity.getBody());
	    }
	 
	 @Test
	 	public void testShowFlightDetails() {
		 	List<FlightDetails> flightrecord=new ArrayList<FlightDetails>();
		 	when(flightService.getFlightDetails()).thenReturn(flightrecord);
		 	assertNotNull(flightrecord);
	 }
	 
	 @Test
	 	public void testShowFlightDetailsByFlight_id()
	 	{
		 	List<FlightDetails> flightrecord=new ArrayList<FlightDetails>();
		 	when(flightService.getFlightDetailsByFlight_id(1)).thenReturn(flightrecord);
		 	assertNotNull(flightrecord);
	 	}
	 
	 @Test
	 	public void testShowMaintenanceDetails() {
		 	List<FlightMaintenance> maintenancerecord=new ArrayList<FlightMaintenance>();
		 	when(flightService.getFlightMaintenanceDetails()).thenReturn(maintenancerecord);
		 	assertNotNull(maintenancerecord);
	 }
	 
	 @Test
	 	public void testshowMaintenanceDetailsByMaintenance_id()
	 	{
		 	List<FlightMaintenance> maintenancerecord=new ArrayList<FlightMaintenance>();
		 	when(flightService.getFlightMaintenanceDetailsByMaintenance_id(1)).thenReturn(maintenancerecord);
		 	assertNotNull(maintenancerecord);
	 	}
	 
	 @Test
	 	public void testInsertFlightDetails() {
		 	FlightDetails mockFlightdetails=new FlightDetails(15,"A121","Boeng","cok","pun");
		 	when(flightService.addFlightDetails(mockFlightdetails)).thenReturn(true);
	 }
	 
	 @Test 
	 	public void testInsertMaintenanceDetails() {
		 FlightMaintenance mockMaintenanceDetails=new FlightMaintenance(40,1,"routine","2023-10-11",6,90);
		 when(flightService.addMaintenanceDetails(mockMaintenanceDetails)).thenReturn(true);
	 }
	 
	 @Test
	 	public void testDeleteFlightDetails() {
		 int flight_id=1;
		 when(flightService.deleteFlightDetails(flight_id)).thenReturn(true);
//	     ResponseEntity<String> responseEntity = flightController.deleteFlightDetails(flight_id);
//	     assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
//	     assertEquals("{\"Status\":\"Success\"}", responseEntity.getBody());
	 }
	 
	 @Test
	 	public void testDeleteFlightMaintenance() {
		 int maintenance_id=1;
		 when(flightService.deleteMaintenanceDetails(maintenance_id)).thenReturn(true);
	 }
}
