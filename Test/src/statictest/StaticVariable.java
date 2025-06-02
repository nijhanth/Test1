package statictest;

public class StaticVariable {

	private static int num;
	
	public StaticVariable(){
		num++;
	}
	
	public static int getnum() {
		return num;
	}
	
	public static void main(String[] args) {
		StaticVariable s1 = new StaticVariable();
		StaticVariable s2 = new StaticVariable();
		StaticVariable s3 = new StaticVariable();
		
		System.out.print(StaticVariable.getnum());
		
	}

}
