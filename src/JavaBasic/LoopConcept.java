package JavaBasic;

public class LoopConcept {

	public static void main(String[] args) {
	
		
		// while loop:
		
		int i=1; // initialization
		while(i<=10) {
			System.out.println(i);
			i=i+i; // increment or decrement
			
		}
		System.out.println("***********");
		
		// for loop
		
		for(int a=1; a<=10; a++) {   // initialization, condition , increment or decrement.
			System.out.println(a);
		}
		System.out.println("************");
		
		
		for(int p=10; p>=1; p--) {
			System.out.println(p);
		}
		

	}

}
