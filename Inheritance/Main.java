package Inheritance;

public class Main {
	public static void main(String[] args) {
		Zoo zoo = new Zoo();

		zoo.zoo.add(new Dog(131, "Buldog"));
		zoo.zoo.add(new Bird(10, "Titernak"));
		zoo.zoo.add(new Eagle(12, "Artciv"));
		zoo.zoo.add(new Animal());
		zoo.zoo.add(new Fish(11, "Karas"));
		zoo.zoo.add(new Mammal(32, "Mammal"));
		zoo.zoo.add(new Salmon(31, "Salmon"));

		zoo.displayAllAnimalsInfo();
		System.out.println();
		zoo.sortAnimalsByName();
		zoo.displayAllAnimalsInfo();
//		zoo.feedAllAnimals();
//		System.out.println();
		zoo.findOldestAnimal().forEach(animal -> System.out.println("Name: " + animal.name  + ", Age: " + animal.age));
//		System.out.println();
	}
}
