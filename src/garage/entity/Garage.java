package garage.entity;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private static int id = 1;
	private String name;
	private ArrayList<Vehicle> vehicles;

	public Garage(int id, String name) {
		this.id = id;
		this.name = name;
		Garage.id++;
	}

	public void addVehicle(int id) {
		
	}
	
	public void removeVehicle() {
		
	}
	
	public void removeVehicle(int id) {
		
}
}