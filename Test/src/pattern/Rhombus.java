package pattern;

import java.util.Scanner;

public class Rhombus {
	int star = 6;
	
	void dis() {
		for(int i=1; i<=star; i++) {
			for(int j=1; j<=star-i; j++) {
			System.out.print(" ");
			}
			for(int j=1; j<=star; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
			
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Rhombus stres = new Rhombus();
		//input.close();
		stres.dis();

	}

}
