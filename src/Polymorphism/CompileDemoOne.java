package Polymorphism;

public class CompileDemoOne {

		public static void main(String[] args) {
			
			
			// compile time Poly morphime= method overloading
			// same method name in same class with diffent parameter is method overloading or compileTime polymorhism
			
			
			CompileDemoOne one=new CompileDemoOne();
			one.add(30, 60);
			one.add(33, 55, 89);
		

	}
	
		public void add(int a, int b) {
		
		int c=a+b;
		System.out.println("sume two number is " + c);
		
	}
    	public void add(int a, int b, int d) {
		
		int c=a+b+d;
		System.out.println("sume two number is "  + c);
	
}	
	

}
