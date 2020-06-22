package JavaPractic;

public class StringS {

	public static void main(java.lang.String[] args) {
		
		// String... widely use class in jav
		// we can create by 2 ways.. string literal and new key word
		
		
		String str="Tome";					//1 
		
		
		String s=new String("hi tome");		//2
		System.out.println(s);
		
		
		System.out.println(s.length());
		System.out.println(str.length());
		
		
		
		String S1="HI JON HOW ARE YOU";
		System.out.println(S1.toLowerCase());
		
		String S2="hello world";
		System.out.println(S2.toUpperCase());
		
		
		System.out.println(S1.compareTo(S2));
		System.out.println(S2.compareTo(S1));
		
		
		System.out.println(S1.compareToIgnoreCase(S2));
		System.out.println(S2.compareToIgnoreCase(S1));		// Compare....String 
		
		System.out.println(S1.concat(S2));
		System.out.println(S2.concat(S1));	// String concatination... connect the string 
		
		
		System.out.println(S1.trim());		// String trim... copy of string
		
		
		
		String a=new String("Mom");
		System.out.println("Return value");
		System.out.println(a.startsWith("heeeeeeeeeeeee"));
		System.out.println("Return value ");
		System.out.println(a.startsWith("jjjjjjjjj"));
		
		
		
		String M="My name is k";
		System.out.println(M.charAt(3));
		System.out.println(M.indexOf(9));
		
		
		String z=new String("Afghanistan");
		System.out.println("Return value:");
		System.out.println(z.substring(10));
		System.out.println("Return value:");
		System.out.println(z.substring(4, 9));
		
		
		
		
		String str5=new String("Wellcome to the happy world");
		System.out.println("Return value:");
		System.out.println(str5.substring(10));
		System.out.println("Return value:");
		System.out.println(str5.substring(10, 15));
		
		
		
		String mix="3213HELLO89WORLD354545*&****^&***^";
		System.out.println(mix.replaceAll("[0-9]",""));
		System.out.println(mix.replaceAll("[a-z]",""));
		
		
		StringBuffer strB=new StringBuffer("study");	// StringBuffer
		strB.append("tonight");
		System.out.println(strB);
		
		
		

	}

}
