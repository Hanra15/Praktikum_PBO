package inheritance;

public abstract class Hewan {
	protected static String name;
	protected abstract void eat();
}
class Cat extends Hewan{
	public Cat(String namahewan) {
		Cat.name = namahewan;
	}
	public void eat() {
		System.out.println("Cat can eat meat, drink milk");
	}
}
