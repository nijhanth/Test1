package pattern;

public class ZeroOneTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
			if((i+j)%2 == 0) {
				System.out.print(1+" ");
			}
			else {
				System.out.print(0+" ");
			}
				//System.out.print(j);
			}
			System.out.println(" ");
		}

	}

}
