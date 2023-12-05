package com.ibsplc.his.api_his_project.model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class FlightMaintenanceTest {
	
	@Test
	public void testConstructorAndGetter() 
	{
		int maintenance_id=1;
		int flight_id=1;
		String maintenance_type="routine check";
		String maintenance_date="2023-10-11";
		int maintenance_estimate_time=2;
		int status_in_percent=80;
		
		FlightMaintenance flightMaintenance = mock(FlightMaintenance.class);
		when(flightMaintenance.getMaintenance_id()).thenReturn(maintenance_id);
		when(flightMaintenance.getFlight_id()).thenReturn(flight_id);
		when(flightMaintenance.getMaintenance_type()).thenReturn(maintenance_type);
		when(flightMaintenance.getMaintenance_date()).thenReturn(maintenance_date);
		when(flightMaintenance.getMaintenance_estimate_time()).thenReturn(maintenance_estimate_time);
		when(flightMaintenance.getStatus_in_percent()).thenReturn(status_in_percent);

		
		assertEquals(maintenance_id,flightMaintenance.getMaintenance_id());
		assertEquals(flight_id,flightMaintenance.getFlight_id());
		assertEquals(maintenance_type,flightMaintenance.getMaintenance_type());
		assertEquals(maintenance_date,flightMaintenance.getMaintenance_date());
		assertEquals(maintenance_estimate_time,flightMaintenance.getMaintenance_estimate_time());
		assertEquals(status_in_percent,flightMaintenance.getStatus_in_percent());


		
	}
	
	@Test
	public void testToString() {
		int maintenance_id = 1;
		int flight_id = 1;
		String maintenance_type = "routine";
		String maintenance_date = "2023-11-10";
		int maintenance_estimate_time = 5;
		int status_in_percent=90;

		FlightMaintenance flightMaintenance = new FlightMaintenance(maintenance_id, flight_id, maintenance_type, maintenance_date, maintenance_estimate_time,status_in_percent);

		String toStringResult = flightMaintenance.toString();

		assertTrue(toStringResult.contains("FlightMaintenance"));
		assertTrue(toStringResult.contains("maintenance_id=" + maintenance_id));
		assertTrue(toStringResult.contains("flight_id=" + flight_id));
		assertTrue(toStringResult.contains("maintenance_type=" + maintenance_type));
		assertTrue(toStringResult.contains("maintenance_date=" + maintenance_date));
		assertTrue(toStringResult.contains("maintenance_estimate_time=" + maintenance_estimate_time));
		assertTrue(toStringResult.contains("status_in_percent="+status_in_percent));
	}


}
