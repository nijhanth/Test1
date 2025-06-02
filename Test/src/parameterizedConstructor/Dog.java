package parameterizedConstructor;

public class Dog {

	private String name;
    private String color;

  	public Dog(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public static void main(String[] args) {
		
		Dog pet = new Dog("Jack", "brown");
		System.out.println("pet color: "+pet.color);
		System.out.println("pet name: "+pet.name);

	}

}

