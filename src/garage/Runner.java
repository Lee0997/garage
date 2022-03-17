package garage;

import garage.entity.Vehicle;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle motorbike = new Vehicle();
		motorbike.setId(14);
		motorbike.setPrice(5000);
		motorbike.setSound("Brum");
		motorbike.setType("Bike");
		System.out.println(motorbike.getType());
		
	}

}
