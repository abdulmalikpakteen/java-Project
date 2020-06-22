package JavaBasic;

public class SwitchStatement {

	public static void main(String[] args) {
		
		int month=4;
		switch(month) {
		case 1 :
			System.out.println("jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Apr");
			break;
		case 5:
			System.out.println("May");
			break;
			default:
				System.out.println("incorrect month");
		}

	}

}
