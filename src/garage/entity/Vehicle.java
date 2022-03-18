package garage.entity;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
	private int id;
	private String name;
	private String type;
	private String sound;
	private int price;

	public Vehicle() {
		this(0,"Uknown", "Unknown", "Unknown", 0);
	}

	public Vehicle(int id, String name, String type, String sound, int price) {
		super();
		this.id = id;
		this.type = type;
		this.sound = sound;
		this.price = price;
	}

	public void tyre() {
		System.out.println(this.getType() + " has tyres");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}


}
