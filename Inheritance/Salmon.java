package Inheritance;

public class Salmon extends Fish {
	Salmon() {
		super(0, "No name");
	}

	Salmon(int age, String name) {
		super(age, name);
	}

	@Override
	void makeSound() {
		System.out.println("Sound Salmon");
	}

	@Override
	void move() {
		System.out.println("Salmon Movement");
	}

	@Override
	void eat() {
		System.out.println("Salmon eat");
	}
}
