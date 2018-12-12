package Hibakezelõ_alrendszer;

public class Battery_Check extends Error {
	
	private int battery_id;
	private int battery_stat;
	
	
	public int getBattery_id() {
		return battery_id;
	}
	public void setBattery_id(int battery_id) {
		this.battery_id = battery_id;
	}
	public int getBattery_stat() {
		return battery_stat;
	}
	public void setBattery_stat(int battery_stat) {
		this.battery_stat = battery_stat;
	}
	

}
