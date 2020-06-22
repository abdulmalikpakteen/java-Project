package ListConcept;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int i[]=new int[4];
		
		i[0]=1;
		i[1]=50;
		i[2]=44;
		i[3]=30;
		System.out.println(i[2]);
		System.out.println(i[1]);
		
		// to find out leght of array.
		System.out.println(i.length);
		
		// to print all value of array use for loop
		
		for(int j=0; j <i.length; j++) {
			System.out.println(i[j]);
		}
		
		// double array
		double d[]=new double[3];
		d[0]=8.6;
		d[1]=9.3;
		d[2]=3.3;
		System.out.println(d[2]);
		
		//3.. char array
		
		char c[]=new char[3];
		c[0]='G';
		c[1]='H';
		c[2]='R';
		System.out.println(c[1]);
		
		//4.. boolean array
		
		boolean b[]=new boolean[3];
		b[0]=true;
		b[1]=false;
		
		
		// 5. String array
		
		String s[]=new String[3];
		s[0]="Toem";
		s[1]="khan";
		s[2]="Hello";
		System.out.println(s[1]);
		
		// 6. object Array(object is class)
		
		Object ob[]=new Object[5];
		ob[0]="Toem";
		ob[1]=6;
		ob[2]='H';
		ob[3]=5.6;
		System.out.println(ob[3]);
		System.out.println(ob.length);

	}

}
