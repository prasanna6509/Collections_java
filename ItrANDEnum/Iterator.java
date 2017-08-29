package ItrANDEnum;

import java.util.ArrayList;
import java.util.List;

public class Iterator {

	public static void main(String[] args) {
		List<Object>p= new ArrayList<Object>();
		p.add(112);
		p.add("prasanna");
		p.add(4.6);
		p.add(540);
		System.out.println(p);
		
	java.util.Iterator<Object> itr = p.iterator();
	while(itr.hasNext()){//will check whether data is present or not//
		System.out.println(itr.next());//will print as per array list//
		itr.remove();
	}
		

	}

}
