package pattern;

import java.util.Scanner;

public class PalindromeTriangle {
	int row;
		
	void dis() {
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=row-i; j++) {
			System.out.print(" ");
			}
			for (int j = 1; j <=row - i; j++) {
                System.out.print(" ");
                }
			for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
			for (int j=2; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PalindromeTriangle res = new PalindromeTriangle();
		System.out.print("Enter number of rows: ");
        res.row = input.nextInt();
        res.dis();
        input.close();
	}

}
