package Generic_concept;

public class Generic_Method {
	
	
	public static <c> void Method1(c [] inputvalue){
		for(c value: inputvalue){ //for loop for advanced conept//here c is datatype,value is object//
			System.out.println(value);
		}
	}
	public static void main(String[] args) {
		Integer[] intArray={1,2,3,4,5};
		Character [] charArray={'A','E','I','O','U'};
		String [] stringArray={"Prasanna","Kasaram"};
		System.out.println("Array contains");
		Method1(intArray);
		Method1(charArray);
		Method1(stringArray);
		//example for Generic method //
		
		
		
		

	}

}
