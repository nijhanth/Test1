package advance;

class Word{

	int num;
	
	public Word(int num) {
		//if using num without adding this keyword, the num will take from the method name.
		//num = num;
		this.num = num;		
	}
}


public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Word res = new Word(8);
		System.out.println(res.num);
		
	}

}
