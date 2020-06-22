package OopsConceptPartOne;

public class StaticAndNonStaticConcept {
	
	String name="Toem";		// non static global variable
	static int age=50;		// static global variable
	

	public static void main(String[] args) {
		
		// we can call static method and variable direct or by class name
		
		StaticAndNonStaticConcept.sum();
		sum();
		
		// for calling non static we have to create object of the class/
		
		StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
		obj.sendMail();
		obj.sum();
		System.out.println(obj.name);
		
	
	}
	public void sendMail() {						// non static method
		System.out.println("send mail method");
	}
	public static void sum() {						// static method
		System.out.println();
	}
	

}
