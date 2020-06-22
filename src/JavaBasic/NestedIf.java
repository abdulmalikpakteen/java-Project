package JavaBasic;

public class NestedIf {

	public static void main(String[] args) {
		
		int age=26;
		if(age<18) {
			System.out.println("your not allow to work in factory");
		}else {
			System.out.println("your older then 19");
		}if(age==30) {
			System.out.println("your allow to work in factory");
		}else {
			System.out.println("enjoy your life bb");
		}

	}

}
