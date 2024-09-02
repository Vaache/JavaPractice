package Inheritance;

public class Eagle extends Bird{
	Eagle() {
		super(0, "No name");
	}

	Eagle(int age, String name) {
		super(age, name);
	}

	@Override
	void makeSound() {
		System.out.println("Sound Eagle");
	}

	@Override
	void move() {
		System.out.println("Eagle Movement");
	}

	@Override
	void eat() {
		System.out.println("Eagle eat");
	}
	
	@Override
	void fly() {
		System.out.println("Eagle fly");
	}
}
