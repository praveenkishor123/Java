
public class CarDecorator implements Car {

	// Has-A relationship with the Car interface, but why ??
	// We make this protected so as to get access by the child classes.
	protected Car car;

	public CarDecorator(Car c) {
		this.car = c;
	}

	@Override
	public void assemble() {
		this.car.assemble();

	}

}
