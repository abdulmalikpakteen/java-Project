package JavaPractic;

public class TryAndCatch {

	public static void main(String[] args) {
		
		try {
			
			int i=10;
			int j;
			j=i/0; // it throw exception
		} catch(Throwable t) {
			
			// print the exception
			System.out.println(t);
		//	SOP("Unhandled Exception");
			
			
		}

	}

}
