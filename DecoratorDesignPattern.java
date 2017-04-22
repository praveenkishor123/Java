interface Cake {
	void flavour();
	int getAmount();
}

class BasicCake implements Cake {
	
	@Override
	public void flavour() {
		System.out.println("Basic Cake");
	}

	@Override
	public int getAmount() {
		return 50;
	}
}

abstract class CakeDecorator implements Cake {
	private Cake cake;

	public CakeDecorator(Cake cake) {
		this.cake = cake;
	}

	@Override
	public void flavour() {
		cake.flavour();
	}

	@Override
	public int getAmount() {
		return cake.getAmount();
	}
}

class VanillaCake extends CakeDecorator {

	public VanillaCake(Cake cake) {
		super(cake);
	}

	@Override
	public void flavour() {
		super.flavour();
		System.out.println("Adding Vanilla falvour");
	}

	@Override
	public int getAmount() {
		return super.getAmount() + 10;
	}
}

class StrawberyCake extends CakeDecorator {

	public StrawberyCake(Cake cake) {
		super(cake);
	}

	@Override
	public void flavour() {
		super.flavour();
		System.out.println("Adding Strawberry falvour");
	}

	@Override
	public int getAmount() {
		return super.getAmount() + 10;
	}
}

public class DecoratorDesignPattern {

	public static void main(String[] args) {
		
		VanillaCake vanillaStrawberryCake = new VanillaCake(new StrawberyCake(new BasicCake()));
		
		vanillaStrawberryCake.flavour();
		System.out.println(vanillaStrawberryCake.getAmount());
	}
}
