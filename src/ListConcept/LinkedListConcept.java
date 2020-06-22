package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListConcept {

	public static void main(String[] args) {
		
		
		LinkedList<String> ll=new LinkedList<String>();
		
		// add:
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("RTA");
		
		// print:
		System.out.println("content of LinkedList:"+ ll);
		//addFirst
		ll.addFirst("Naveen");
		// add last
		ll.addLast("Automation");
		System.out.println("Content of linkedList:"+ll);
		
		// get
		System.out.println(ll.get(0));
		// set
		ll.set(0, "Tom");
		System.out.println(ll.get(0));
		
		// remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linkedList:"+ll);
		
		ll.remove(2);
		System.out.println("content of linkedList:"+ll);
		
		// to print out all value of linkedlsit 
		
		System.out.println("using for loop");
		for(int n=0; n<ll.size();n++) {
			System.out.println(ll.get(n));
		}
		
		// advance for loop
		
		System.out.println("****** using advance for loop");
		for(String str : ll) {
			System.out.println(str);
		}
		
		// Iterator
		
		System.out.println("****** using iterator");
		Iterator<String> it=ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		// while loop
		System.out.println("**** using iterator");
		
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
	
		
		
		

	}

}
