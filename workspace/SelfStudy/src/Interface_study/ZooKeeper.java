package Interface_study;

interface  Animal{
	
	void eat();
	
}

class Tiger implements Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
}

class Dog implements Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	
	
}

class Rabbit implements Animal{


	
	
	
}



public class ZooKeeper {
		
	void feed(Animal animal) {
		animal.eat();
	}
	
}
