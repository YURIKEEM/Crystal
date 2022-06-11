package Interface_study;

public class Main {
	
	public static void main(String[] args) {
	
		
		

		ZooKeeper zoo = new ZooKeeper();
		
		// Tiger tiger = new Tiger();
		Animal tiger = new Tiger();
		
		tiger.eat();
		
		// Rabbit rabbit = new Rabbit();
		Animal rabbit = new Rabbit();
		
		// Dog dog = new Dog();
		Animal dog = new Dog();
		
		
		
		
		zoo.feed(dog);
		zoo.feed(tiger);
		zoo.feed(rabbit);
		
		
	}
}
