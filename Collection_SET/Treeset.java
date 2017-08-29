package Collection_SET;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		Set<Integer>p=new TreeSet<Integer>();
		p.add(5);
		p.add(40);
		p.add(40);
		p.add(100);
		System.out.println(p);
		Set<Integer>p1=new HashSet<Integer>();
		p1.add(5);
		p1.add(40);
		p1.add(100);
		System.out.println(p1);
		//difference between Hash/LinkedHash/Tree set are
		//Hash-no duplication, no order
		//LinkedHash-no duplication, order(given)
		//Tree-no duplication,ascending order(given)
		
		
		

	}

}
