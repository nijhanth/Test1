package pattern;

import java.util.Scanner;

public class NumberIncreasingPyramid {
	
	public static void printPattern(int n)
	    {
	        int i, j;
	        
	        // outer loop to handle number of rows
	        for (i = 1; i <= n; i++) {
	            
	            // inner loop to handle number of columns
	            for (j = 1; j <= i; j++) {
	                
	                // printing column values 
	                // upto the row value
	                System.out.print(j + " ");
	            }

	            // print new line for each row
	            System.out.println();
	        }
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n;
			
			Scanner input = new Scanner(System.in);
			n=input.nextInt();
			
			for(int i=1; i<=n; i++) {
				
				System.out.println(i);
				
			}
			System.out.println("**************");
			
			for(int i=1; i<=n; i++) {
				
			for(int j=1; j<i; j++) {
				System.out.print(j+" ");
			}
				
				System.out.println(i);
				
			}
			
	}

}
