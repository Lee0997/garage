package garage.entity;

public class Motorbike extends Vehicle {
	
	public Motorbike(int id, String type, String sound, int price) {
		super();
	}
	public void tyre() {
		System.out.println(this.getType() + " has very special tyres");
	}
}
