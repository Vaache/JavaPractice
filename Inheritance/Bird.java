package Inheritance;

public class Bird extends Animal {
	Bird() {
		super.age = 0;
		super.name = null;
	}

	Bird(int age, String name) {
		super.age = age;
		super.name = name;
	}

	@Override
	void makeSound() {
		System.out.println("Sound Bird");
	}

	@Override
	void move() {
		System.out.println("Bird Movement");
	}

	@Override
	void eat() {
		System.out.println("Bird eat");
	}
	
	void fly() {
		System.out.println("Bird Fly");
	}
}
