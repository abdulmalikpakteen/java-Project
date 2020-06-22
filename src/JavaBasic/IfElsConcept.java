package JavaBasic;

public class IfElsConcept {

	public static void main(String[] args) {
		
		
		int a=50;
		int b=30;
		
		if(a>b) {
			System.out.println("a is the greater then b ");
		}
		else
			System.out.println("b is greater then a");
		
		// Comparsion Opertators 
		
		//<> , <= , >= , == , !=
		
		int c=90;
		int d=90;
		if(c==d) {
			System.out.println("c and d are equal");
		}else 
			System.out.println("not equals ");
		
		// finding the highest number
		
		int a1=900;
		int a2=800;
		int a3=400;
		if(a1>12&a1>a3) {
			System.out.println("a1 is the highet ");
		}
		else if(a2>a1&a2>a3) {
			System.out.println("a2 is the highest one");
		}
		
		else {
			System.out.println("a3 is the largest one");
		}

	}

}
