package Collection_SET;

import java.util.HashSet;
import java.util.Set;



public class Hashset {

	public static void main(String[] args) {
		Set<Integer> p=new HashSet<Integer>();
		p.add(4);
		p.add(6);
		p.add(4);//no duplications in set and order not preserved//
		System.out.println(p);
		System.out.println(p.size());
		System.out.println(p.contains(6));
		

	}

}
