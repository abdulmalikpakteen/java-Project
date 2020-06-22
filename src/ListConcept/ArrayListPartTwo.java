package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPartTwo {

	public static <E> void main(String[] args) {
		
		int a[]=new int[3];  // static array siz is fixed
		
		// dynamic array --- arraylist
		//1. can contain duplicat value
		//2. maintain insertion order
		//3. synchronized
		//4. allow rondom access 
		
		ArrayList ar=new ArrayList();
		
		ar.add(40); //3
		ar.add(50); //4
		ar.add(50); //5
		
		System.out.println(ar.size()); // size of arraylist
		System.out.println(ar.get(4));
		
		// to print out all value use For loop
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		// non generic vs generic
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(100);
		
		ArrayList<String>ar2=new ArrayList<String>();
		ar2.add("test");
		ar2.add("selenium");
		
		ArrayList<E>ar3=new ArrayList<E>();
		
		// Employee class object
		
		Employee e1= new Employee("Naveen", 27, "QA");
		Employee e2= new Employee("Tom", 28, "Dev");
		Employee e3= new Employee("Peter", 29, "Admin");
		
		// creating arraylist
		
		ArrayList<Employee>ar4=new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		// iterater to travers the value
		
		Iterator<Employee>it=ar4.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		//***********************
		
		// add All
		
		ArrayList<String>ar5=new ArrayList<String>();
		ar5.add("test");
		ar5.add("selenium");
		ar5.add("QTP");
		
		
		ArrayList<String>ar6=new ArrayList<String>();
		ar6.add("dev");
		ar6.add("java");
		ar6.add("javaScripts");
		
		ar5.addAll(ar6);
		
		for(int i=0; i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
			
		}
		
		System.out.println("***********");
			
			// remove all
			ar5.removeAll(ar6);
			for(int i=0; i<ar5.size(); i++) {
				System.out.println(ar5.get(i));
			
		}
			
			// Retain all()
			
			ArrayList<String>ar7=new ArrayList<String>();
			ar7.add("test");
			ar7.add("selenium");
			ar7.add("QTP");
			
			ArrayList<String>ar8=new ArrayList<String>();
			ar8.add("test");
			ar8.add("java");
			
			ar7.retainAll(ar8);
			for(int i=0; i<ar7.size();i++) {
				System.out.println(ar7.get(i));
			}
		

	}

}
