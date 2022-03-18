package garage.entity;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private static int id = 1;
	private String name;
	public ArrayList<Vehicle> vehicles;
	private String damage;
	private int cost;

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
			if (currentVehicle.getName() == name) {
				return currentVehicle;
			}
		}
		return null;
	}

	public Vehicle removeByType(String type) {
		for (int i = 0; i < type.length(); i++) {
			Vehicle currentType = vehicles.get(i);
			String vehicleType = currentType.getType();
			if (vehicleType == type) {
				vehicles.remove(currentType);
			}
		}
		return null;
	}

	public Vehicle removeAll() {
		vehicles.clear();
		System.out.println("Cleared all vehicles");
		return null;
	}

	public void damage(Vehicle vehicle) {
		System.out.println("The " + vehicle + "damage: " + damage);
	}

	public String repairCost(int cost) {
		this.cost = cost;
		this.damage = damage;
		
		if(damage == "Heavy") {
			if(cost > 500) {
				return "It's going to be expensive";
			}
		} else if(damage == "Medium") {
			if(cost < 500 && cost > 250) {
			return "It isn't huge I guess";	
			}
		} else(damage == "Light") {
			if (cost > 0 && cost < 250) {
			return "It's pretty cheap";	
			}
			
		}
		
	}
}