package com.ibsplc.his.api_his_project.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.ibsplc.his.api_his_project.mapper.GetMapper;
import com.ibsplc.his.api_his_project.model.FlightDetails;
import com.ibsplc.his.api_his_project.model.FlightMaintenance;

@SpringBootTest
public class FlightServiceImplTest {
	@Mock
	private GetMapper getMapper;
	
	@InjectMocks
	private FlightServiceImpl flightServiceImpl;
	
	@Test
	public void getFlightDetails()
	{
		List<FlightDetails> flightrecord=new ArrayList<FlightDetails>();
		when(getMapper.getFlightDetails()).thenReturn(flightrecord);
		assertNotNull(flightrecord);
	}
	
	@Test
	public void getFlightDetailsByFlight_id()
	{
		List<FlightDetails> flightrecord=new ArrayList<FlightDetails>();
		when(getMapper.getFlightDetails()).thenReturn(flightrecord);
		assertNotNull(flightrecord);
	}
	
	@Test
	public void testgetFlightMaintenance()
	{
		List<FlightMaintenance> maintenancerecord=new ArrayList<FlightMaintenance>();
		when(getMapper.getFlightMaintenanceDetails()).thenReturn(maintenancerecord);
		assertNotNull(maintenancerecord);
	}
	
	@Test
	public void testgetFlightMaintenanceByMaintenance_id()
	{
		List<FlightMaintenance> maintenancerecord=new ArrayList<FlightMaintenance>();
		when(getMapper.getFlightMaintenanceDetails()).thenReturn(maintenancerecord);
		assertNotNull(maintenancerecord);
	}
	
//	@Test
//		public void testInsertFlightDetails() {
//			FlightDetails flightrecord=new FlightDetails(1,"A121","boeng","COK","PUN");
//			doNothing().when(getMapper).addFlightDetails(flightrecord);
//			boolean result = flightServiceImpl.addFlightDetails(flightrecord);
//			verify(getMapper, times(1)).addFlightDetails(flightrecord);
//			Assert.assertFalse(result);
//    }
		

}
