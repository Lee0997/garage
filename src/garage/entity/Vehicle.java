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
	
	
}