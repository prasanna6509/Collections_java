package Generic_concept;

public class Generic_Class<c1,c2> {
	
	public  void Method1(c1 obj,c2 obj1){
		System.out.println("This is generic class concept");
		System.out.println("firstname="+obj+ " lastname= "+obj1);
		
	}

	public static void main(String[] args) {
		Generic_Class<String,String> p=new Generic_Class<String, String>();
	p.Method1("PRASANNA","KASARAM");
	Generic_Class<Integer,String> p1=new Generic_Class<Integer, String>();
		p1.Method1(27, "seleniums");
		
		//advantage of generic is no need to declare data types//
		//we can go for dynamic datatypes as per our requirement//

	}

}
