package PracticForAllClass;



public class L {

	public static void main(String[] args) {
		
		int a[]=new int[6];
		a[0]=1;
		a[1]=5;
		a[2]=44;
		a[3]=55;
		a[4]=99;
		a[5]=89;
		System.out.println(a[4]);
		System.out.println(a.length);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
