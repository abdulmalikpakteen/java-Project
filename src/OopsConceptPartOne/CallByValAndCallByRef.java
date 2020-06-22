package OopsConceptPartOne;

public class CallByValAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValAndCallByRef obj=new CallByValAndCallByRef();
		
		int x=10;
		int y=20;
		obj.testSum(x, y);  // call by value or pass by val
		
		obj.p=50;
		obj.q=80;
		
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		

	}
	
	public int testSum(int a, int b) {
		a=30;
		b=40;
		int c=a+b;
		return c;
		
	}
	public void swap(CallByValAndCallByRef t) {
		int temp;
		temp=t.p;  // temp=50
		t.p=t.q;   // t.p=60
		t.q=temp;
		
		
	}
	

}
