package garage.entity;

public class Vehicle {
	private int id;
	private String type;
	private String sound;
	private int price;
	
	public Vehicle() {
		this(0, "Unknown", "Unknown", 0);
	}

	public Vehicle(int id, String type, String sound, int price) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.type = type;
		this.sound = sound;
		this.price = price;
	}

}
