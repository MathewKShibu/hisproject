package com.ibsplc.his.api_his_project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ibsplc.his.api_his_project.model.FlightDetails;
import com.ibsplc.his.api_his_project.model.FlightExpandedInfo;
import com.ibsplc.his.api_his_project.model.FlightMaintenance;

@Mapper
public interface GetMapper {
	@Select("Select * from flight_details" )
	List<FlightDetails> getFlightDetails();
	
	@Select("Select * from flight_details where flight_id=#{flight_id}")
	FlightDetails getFlightDetailsByFlight_id( @Param("flight_id")int flight_id);
	
	@Select("Select * from flight_maintenance")
	List<FlightMaintenance> getFlightMaintenanceDetails();
	
	@Select("Select * from flight_maintenance where maintenance_id=#{maintenance_id}")
	FlightMaintenance getFlightMaintenanceDetailsByMaintenance_id(@Param("maintenance_id") int maintenanace_id);
	
	@Select("select" 
			+"`flight_details`.`flight_id`,"
			+"`flight_details`.`flight_number`,"
			+"`flight_details`.`aircraft_type`,"
			+"`flight_maintenance`.`maintenance_id`,"
			+"`flight_maintenance`.`maintenance_type`,"
			+"`flight_maintenance`.`maintenance_date`,"
			+"`flight_maintenance`.`maintenance_estimate_time`"
			+"`flight_maintenance`.`status_in_percent`"
			+"from"
			+"`flight_details`"
			+"inner join"
			+"`flight_maintenance`"
			+"on"
			+"`flight_details`.`flight_id`=`flight_maintenance`.`flight_id`;")
	List<FlightExpandedInfo> getExpandedFlightInfo();
	
	@Insert("Insert into flight_details("
			+"flight_id,"
			+"flight_number,"
			+"aircraft_type,"
			+"depature_location,"
			+"destination_location)"
			+"values"
			+"(#{flightDetails.flight_id},#{flightDetails.flight_number},#{flightDetails.aircraft_type},#{flightDetails.depature_location},#{flightDetails.destination_location})")
	void addFlightDetails(@Param("flightDetails") FlightDetails flightDetails);
	
	@Insert("Insert into flight_maintenance("
			+"maintenance_id,"
			+"flight_id,"
			+"maintenance_type,"
			+"maintenance_date,"
			+"maintenance_estimate_time,"
			+"status_in_percent)"
			+"values"
			+"(#{flightMaintenance.maintenance_id},#{flightMaintenance.flight_id},#{flightMaintenance.maintenance_type},#{flightMaintenance.maintenance_date},#{flightMaintenance.maintenance_estimate_time},#{flightMaintenance.status_in_percent})")
	void addMaintenanceDetails(@Param("flightMaintenance") FlightMaintenance flightMaintenance);
	
}
