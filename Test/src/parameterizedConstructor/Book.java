package parameterizedConstructor;

public class Book {

	private String title;
	private String author;
	private double price;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author; 
	}
	
	public Book (String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public static void main(String[] args) {
	// 1st book
		Book book1 = new Book("XUV700", "Mahindra");
		System.out.println("Mah book name: "+book1.title);
		System.out.println("Mah book Author: "+book1.author);
	
		System.out.println("**********************");
		
	//2nd book
		Book book2 = new Book("Safari", "TATA", 45.55);
		System.out.println("Tata book name: "+book2.title);
		System.out.println("Tata book Author: "+book2.author);
		System.out.println("Tata book Price: "+book2.price);
		
	}

}
