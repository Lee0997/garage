package garage.entity;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private static int id = 1;
	private String name;
	public ArrayList<Vehicle> vehicles;

	public Garage() {
		this.vehicles = new ArrayList<>();
	}

	public Garage(int id, String name) {
		this.id = id;
		this.name = name;
		Garage.id++;
	}

	public Object getName() {
			return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}	

	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	
	public Vehicle removeById(int id) {
		for (int i = 0; i < vehicles.size(); i++) {
			Vehicle currentVehicle = vehicles.get(i);
			if(currentVehicle.getName() == name) {
				return currentVehicle;
			}
		}
		return null;
	}

}