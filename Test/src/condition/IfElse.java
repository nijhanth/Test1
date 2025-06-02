package condition;

import java.util.Scanner;

public class IfElse {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pen = 20;
		int cost;
		
		input = new Scanner(System.in);
		
		System.out.println("Pen price = 20 Enter cost");
		
		cost = input.nextInt();
		
		if(cost>=pen) {
			System.out.println("you can buy pen");
		}
		else {
			System.out.println("You can't buy");
		}
	}
}
