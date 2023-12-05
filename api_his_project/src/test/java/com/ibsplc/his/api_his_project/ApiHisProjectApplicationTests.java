package com.ibsplc.his.api_his_project;


import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;


public class ApiHisProjectApplicationTests {
	
	@Autowired
	private ApiHisProjectApplication app;
	
	@LocalServerPort
	private int port=8081;
	
	private TestRestTemplate restTemplate =new TestRestTemplate();
	
	@Test
	public void contextLoads() {
		assertNull(app);
	}
	
	@Test
	public void apiEndpointShouldReturnExcpectedResult()
	{
		String url="http://localhost:" + port + "/hisproject/flightdetails/1";
		String expectedResult = "[{\"flight_id\":1,\"flight_number\":\"ABC123\",\"aircraft_type\":\"Boeing 737\",\"depature_location\":\"City A\",\"destination_location\":\"City B\"}]";
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        assertEquals(expectedResult, responseEntity.getBody());
	}
			
}
