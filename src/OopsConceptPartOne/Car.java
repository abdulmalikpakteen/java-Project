package OopsConceptPartOne;

public class Car {
	
	// Class variable
	
	int mod;
	int wheel;

	public static void main(String[] args) {
		
	Car a=new Car();
	Car b=new Car();
	Car c=new Car();
	
	a.mod=2015;
	a.wheel=4;
	
	b.wheel=5;
	b.mod=2019;
	
	c.mod=2008;
	c.wheel=2000;
	
	System.out.println(a.mod);
	System.out.println(a.wheel);
	
	System.out.println(b.mod);
	System.out.println(b.wheel);
	
	System.out.println(c.mod);
	System.out.println(c.wheel);
	
	
		
		

	}

}
