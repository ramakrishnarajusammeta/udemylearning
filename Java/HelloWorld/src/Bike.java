
public class Bike extends Vehicle {

		private String handle;

		Bike() {
			super();
			this.handle = "Long";
		}
		
		Bike(String handle) {
			super();
			this.handle = handle;
		}
		
		Bike (String handle, String model, String fuelType, int capacity) {
			super (model,fuelType,capacity);
			this.handle = handle;
		}
			
		
		public String getHandle() {
			return handle;
		}

		public void setHandle(String handle) {
			this.handle = handle;
		}

		@Override
		public String toString() {
			return "Bike \n\t[handle=" + handle + "]\n\t[Model = " + getModel() + "]\n\t[FuelType=" +
					getFuelType() +"]\n\t[Capacity=" + getCapacity() +"]";
		}
		
}
