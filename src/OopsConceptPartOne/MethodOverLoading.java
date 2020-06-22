package OopsConceptPartOne;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		
		// same method name differ arguement or parameter in same calss is method overloading
		
		MethodOverLoading obj=new MethodOverLoading();
		obj.sum();
		obj.sum(2);
		obj.sum(60, 80);
		
		

	}
	
	public void sum() {
		System.out.println("zero parameter");
	}
	public void sum(int a) {
		System.out.println("one parameter");
	}
	public void sum(int a, int b) {
		System.out.println("two parameter");
	}

}
