package advance;
class Cat{
	
	String name = "unkonw";
    int age = 0;
  
 public void nameofcat() {
	System.out.println(name);
	  }
 public void ageofcat() {
	System.out.println(age);
	  }
}

public class Construct {

	public static void main(String[] args) {
		
		Cat myCat = new Cat();
		
		myCat.ageofcat();
		myCat.nameofcat();

	}

}
