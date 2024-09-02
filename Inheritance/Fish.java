package Inheritance;

public class Fish extends Animal{
	Fish() {
		super.age = 0;
		super.name = null;
	}

	Fish(int age, String name) {
		super.age = age;
		super.name = name;
	}

	@Override
	void makeSound() {
		System.out.println("Sound Fish");
	}

	@Override
	void move() {
		System.out.println("Fish Movement");
	}

	@Override
	void eat() {
		System.out.println("Fish eat");
	}
}
