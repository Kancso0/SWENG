package Hibakezelõ_alrendszer;

import java.sql.Date;

public class Shut_Down {

	private String reason;
	private Date date_time;
	private String service_station;
	
	
	public void shutDownCauseError(Error error) {
	}
	
	public void shutDownCauseBattery(Battery_Check battery) {
	}
	
	
	public void seviceSation() {
	}
	

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getDate_time() {
		return date_time;
	}

	public void setDate_time(Date date_time) {
		this.date_time = date_time;
	}

	public String getService_station() {
		return service_station;
	}

	public void setService_station(String service_station) {
		this.service_station = service_station;
	}
	
	
	
	
}
