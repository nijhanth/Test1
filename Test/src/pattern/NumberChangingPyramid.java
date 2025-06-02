package pattern;

import java.util.Scanner;

public class NumberChangingPyramid {

	public static void main(String[] args) {
			int num;
			int num1 =1;
		
		System.out.println("Enter");
		Scanner input = new Scanner(System.in);
		num =input.nextInt();
		
		for(int i=1; i<num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(num1+ " ");
				num1++;
			}
			System.out.println(" ");
		}
	}

}
