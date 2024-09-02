package Inheritance;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Zoo {
	List<Animal> zoo = new ArrayList<>();

	void feedAllAnimals() {
		for (Animal animal : this.zoo) {
			animal.eat();
		}
	}

	void displayAllAnimalsInfo() {
		for (Animal animal : this.zoo) {
			System.out.println(animal.getClass().getSimpleName() + ": Age: " + animal.age + " Name: " + animal.name);
		}
	}

	void removeAnimal(String name) {
		int i = 0;
		for (Animal animal : this.zoo) {
			if (animal.name.equals(name))
				break;
			i++;
		}
		this.zoo.remove(i);
	}

	List<Animal> findAnimalsByAge(int age) {
		List<Animal> res = new ArrayList<>();

		for (Animal animal : this.zoo) {
			if (animal.age == age)
				res.add(animal);
		}
		return res;
	}

	void sortAnimalsByName() {
		for (int i = 0; i < zoo.size(); ++ i) {
			for (int j = 0; j < zoo.size() - 1 - i; ++ j) {
				if (zoo.get(j).name.charAt(0) > zoo.get(j + 1).name.charAt(0)) {
					Animal tmp = zoo.get(j);
					zoo.set(j, zoo.get(j + 1));
					zoo.set(j + 1, tmp);
				}
			}
		}
	}

	void makeAllAnimalsSound() {
		for (Animal animal : zoo) {
			animal.makeSound();
		}
	}

	List<Animal> findOldestAnimal() {
		int max = Integer.MIN_VALUE;
		List<Animal> list = new ArrayList<>();

		for (Animal o : zoo) {
			if (o.age > max) {
				max = o.age;
			}
		}

		for (Animal o : zoo) {
			if (o.age == max)
				list.add(o);
		}
			
		return list;
	}
}
