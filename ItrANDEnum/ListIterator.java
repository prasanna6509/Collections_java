package ItrANDEnum;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {
		List<Object>p= new ArrayList<Object>();
		p.add(112);
		p.add("prasanna");
		p.add(4.6);
		p.add(540);
		System.out.println(p);
	java.util.ListIterator<Object> itr = p.listIterator();
		while(itr.hasNext()){
		System.out.println(itr.next());//will check whether data is present or not//
		}
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
	}
	
	}
}
		

	

