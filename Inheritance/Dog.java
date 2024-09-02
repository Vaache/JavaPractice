package Inheritance;

public class Dog extends Mammal{
	Dog() {
		super(0, "No name");
	}

	Dog(int age, String name) {
		super(age, name);
	}

	@Override
	void makeSound() {
		System.out.println("Sound Dog");
	}

	@Override
	void move() {
		System.out.println("Dog Movement");
	}

	@Override
	void eat() {
		System.out.println("Dog eat");
	}
}
