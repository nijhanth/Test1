package inherit;

class Animal{
	
	public void makesound() {
		System.out.println("The animal makes a sound.");
	}
}

class Cat extends Animal{
	@Override
	public void makesound() {
		System.out.println("The cat quarrels.");
	}
}

public class Main {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.makesound();

	}

}
