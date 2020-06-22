package OopsConceptPartTwo;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USbank.min_bal);
		
		
		HSBCbank hs=new HSBCbank();
		hs.credit();
		hs.debit();
		hs.educationalloan();
		hs.carloan();
		hs.transfermoney();
		
		// dynamic polymorphism
	
		USbank b=new HSBCbank();
		b.credit();
		b.debit();
		

	}

}
