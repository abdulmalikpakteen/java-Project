package OopsConceptPartOne;

public class LocalVariableVsGlobaleVariable {
	
	// global variable or class variable are the same
	
		String name="Tom";
		int Age=60;

	public static void main(String[] args) {
		
		int i=10; // local variable
		System.out.println(i);
		
		// to access global variable create object
		
		LocalVariableVsGlobaleVariable obj=new LocalVariableVsGlobaleVariable();
		
		
		System.out.println(obj.name);
		System.out.println(obj.Age);
		
	}
	
	public void sum() {
		int i=10;
		int j=60;
		int Age=60;
		
	}

}
