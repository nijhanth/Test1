package pattern;

import java.util.Scanner;

public class NumberIncreasingReversePyramid {

	public static void main(String[] args) {
		int num;
		
		System.out.println("Enter");
		Scanner input = new Scanner(System.in);
		num =input.nextInt();
		
		for(int i=num; i>0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
