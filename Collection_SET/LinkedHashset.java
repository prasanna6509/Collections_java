package Collection_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {

	public static void main(String[] args) {
		Set<Integer>q=new LinkedHashSet<Integer>();
		q.add(2);
		q.add(40);
		q.add(6);
		System.out.println(q);
	Set<Integer>q1=new HashSet<Integer>();
		q1.add(2);
		q1.add(40);
		q1.add(6);
		System.out.println(q1);
		//so difference between hash and linked hash is like maintaining 
		//the given order even though no duplications in both but order will present 
		//in linked hashset//
		

	}

}
