
public class Vehicle {
	
	private String Model;
	private String fuelType;
	private int capacity;
	
	

	Vehicle () {
		this.Model = "2000";
		this.fuelType = "Diesel";
		this.capacity = 1000;
	}
	
	Vehicle (String model, String fuel, int cap) {
		this.Model = model;
		this.fuelType = fuel;
		this.capacity = cap;
		
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
}
