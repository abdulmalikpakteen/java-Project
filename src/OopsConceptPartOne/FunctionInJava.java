package OopsConceptPartOne;

public class FunctionInJava {

	public static void main(String[] args) {
		
		FunctionInJava obj=new FunctionInJava();
		obj.test();
		int i=obj.pqr();
		System.out.println(i);
		obj.pqr();
		
		String s1=obj.qa();
		System.out.println(s1);
		
		obj.divsion(30, 2);
		System.out.println("div");
		
		
		// void does not return any value
		// return type =void
		
	}
	public void test() {
		System.out.println("test method");
	}
	
	// return type= int
	
	public int pqr() {
		System.out.println("pqr method");
		int a=5;
		int b=66;
		int c=a+b;
		return c;
	}
	
	// return type string
	
	public String qa() {
		System.out.println("qa method");
		String S="Selenium";
		
		return S;
	}
	
	// return type --- int
	
	public int divsion(int x, int y ) {
		int d=x/y;
		return d;
	}
	

}
