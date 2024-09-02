package Inheritance;

public class Mammal extends Animal {
	Mammal() {
		super.age = 0;
		super.name = null;
	}

	Mammal(int age, String name) {
		super.age = age;
		super.name = name;
	}

	@Override
	void makeSound() {
		System.out.println("Sound Mammal");
	}

	@Override
	void move() {
		System.out.println("Mammal Movement");
	}

	@Override
	void eat() {
		System.out.println("Mammal eat");
	}
}
