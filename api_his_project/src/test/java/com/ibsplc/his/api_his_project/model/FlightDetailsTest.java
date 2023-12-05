package com.ibsplc.his.api_his_project.model;



import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class FlightDetailsTest {
	@Test
	public void testConstructorAndGetter() {
		int flight_id = 1;
		String flight_number = "ABC123";
		String aircraft_type = "Boeng";
		String depature_location = "City A";
		String destination_location = "City B";

		FlightDetails flightDetails = mock(FlightDetails.class);
		when(flightDetails.getFlight_id()).thenReturn(flight_id);
		when(flightDetails.getFlight_number()).thenReturn(flight_number);
		when(flightDetails.getAircraft_type()).thenReturn(aircraft_type);
		when(flightDetails.getDepature_location()).thenReturn(depature_location);
		when(flightDetails.getDestination_location()).thenReturn(destination_location);

		assertEquals(flight_id, flightDetails.getFlight_id());
		assertEquals(flight_number, flightDetails.getFlight_number());
		assertEquals(aircraft_type, flightDetails.getAircraft_type());
		assertEquals(depature_location, flightDetails.getDepature_location());
		assertEquals(destination_location, flightDetails.getDestination_location());
	}

	@Test
	public void testToString() {
		int flight_id = 1;
		String flight_number = "ABC123";
		String aircraft_type = "Boeng";
		String depature_location = "City A";
		String destination_location = "City B";

		FlightDetails flightDetails = new FlightDetails(flight_id, flight_number, aircraft_type, depature_location, destination_location);

		String toStringResult = flightDetails.toString();

		assertTrue(toStringResult.contains("FlightDetails"));
		assertTrue(toStringResult.contains("flight_id=" + flight_id));
		assertTrue(toStringResult.contains("flight_number=" + flight_number));
		assertTrue(toStringResult.contains("aircraft_type=" + aircraft_type));
		assertTrue(toStringResult.contains("depature_location=" + depature_location));
		assertTrue(toStringResult.contains("destination_location=" + destination_location));
	}

}
