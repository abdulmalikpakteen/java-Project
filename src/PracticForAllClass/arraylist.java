package PracticForAllClass;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		ar.add("tome");
		ar.add("bamo");
		ar.add("Ato");
		ar.add("Jamo");
		Collections.sort(ar);
		
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println();
		}
	}

}
