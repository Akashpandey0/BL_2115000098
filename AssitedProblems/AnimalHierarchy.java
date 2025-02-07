class Animal {
	String name;
	int age;
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void makeSound() {
		System.out.println("Animals are making sounds.");
	}

	public String getName(){
		return name;
	}
	
	public int getAge() {
		return age;
	}
}

class Dog extends Animal {
	public Dog(String name, int age) {
		super(name, age);
	}

	@ Override
	void makeSound() {
		System.out.println("Woof");
	}
}


class Cat extends Animal {
        public Cat(String name, int age) {
                super(name, age);
        }

        @ Override
        void makeSound() {
                System.out.println("Meow");
        }
}

class Bird extends Animal {
        public Bird(String name, int age) {
                super(name, age);
        }

        @ Override
        void makeSound() {
                System.out.println("chirp");
        }
}

public class AnimalHierarchy {

	public static void main(String[] args) {
		
		Animal animal = new Animal("Generic Animal", 5);
		System.out.print("Name "+ animal.getName() + " Age: " + animal.getAge() + " \nSound: " );
		animal.makeSound();

		
        Dog dog = new Dog("Tommy", 3);
        System.out.print("Name "+ dog.getName() + " Age: " + dog.getAge() + " \nSound: " );
		dog.makeSound();

		Cat  cat = new Cat("Billa", 5);
        System.out.print("Name "+ cat.getName() + " Age: " + cat.getAge() + " \nSound: " );
		cat.makeSound();

		Bird bird = new Bird("Peko", 1 );
		System.out.print("Name "+ bird.getName() + " Age: " + bird.getAge() + " \nSound: " );
		bird.makeSound();
	}
}