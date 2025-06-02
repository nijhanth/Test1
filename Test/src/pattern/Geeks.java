package pattern;

public class Geeks {
	
	int inp=6;
	private int i2;
	
	void test() {
		for(int i=1; i<=inp; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for(int i=inp-1; i>=0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		for(int i=1; i<=5; i++) {
			for (int j=1; j<=5-i; j++) {
				System.out.print(" ");
				}
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		/*for (int i2=1; i2<=inp; i2++) {
			for(int j=1; j<=i2; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}	
		for(int i2=inp-1; i2>=0; i2--) {
			for(int j=1; j<=i2; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
			}*/
		/*for (int i3=i2; i3<=inp; i3++) {
			for(int j=1; j<=i3; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}	*/
	}

	public static void main(String[] args) {
		
		Geeks res = new Geeks();
		res.test();
	}

}
