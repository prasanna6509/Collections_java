package ItrANDEnum;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerator {

	public static void main(String[] args) {
	
		Vector<Object>p=new Vector<Object>();
		p.add(124);
		p.add("Firstname");
		p.add("Lastname");
		p.add(9.9);
		System.out.println(p);
		Enumeration<Object> enu = p.elements();
		while(enu.hasMoreElements()){
			System.out.println(enu.nextElement());
		}

	}

}
