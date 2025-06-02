package advance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Vehicle {

	public static void main(String[] args) {
		//add the values
		List<String> list = new ArrayList<String>();
		list.add("BMW");
		list.add("Audi");
		list.add("Porsche");
		list.add("Benz");
		list.add("volvo");
		list.add("BMW");
		//list.remove(2);
		
		for (String cars : list) {
			System.out.println(cars);
		}
		
//		System.out.println(list.get(0));
//		System.out.println(list.contains("BMW"));
//		System.out.println(list.size());
	    System.out.println("*********************");
		
		Set<String> set = new HashSet<String>();
		set.add("BMW");
		set.add("Audi");
		set.add("Porsche");
		set.add("Benz");
		set.add("volvo");
		set.add("BMW");
		
		for (String string : set) {
			System.out.println(string);
		}

	}

}
