
public class Car extends Vehicle {
	private int doors;
	private int passengers;
	
	public Car(String theMake, String theModel, String thePlate, int numDoors, int numPassengers) {
		super(theMake, theModel, thePlate);
		this.doors = numDoors;
		this.passengers = numPassengers;
	}
	
	public int getDoors() {
		return this.doors;
	}
	
	public int getPassengers() {
		return this.passengers;
	}
	
	@Override
	public String toString() {
		String result = String.format("%d-door %s %s with licence %s", this.doors, this.getMake(), this.getModel(), this.getPlate());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Car)) {
			return false;
		}
		Car other = (Car) obj;
		if (this.doors == other.getDoors()) {
			if (this.passengers == other.getPassengers()) {
				return super.equals(obj);
			}
		}
		return false;
	}
	
	public Car copy(){
		String theMake = this.getMake();
		String theModel = this.getModel();
		String thePlate = this.getPlate();
		int theDoors = this.doors;
		int thePassengers = this.passengers;
		Car theCopy = new Car(theMake, theModel, thePlate, theDoors, thePassengers);
		return theCopy;
	}

}
