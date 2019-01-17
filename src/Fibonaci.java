
public class Fibonaci {
	public static void main(String[]args) {
		int num = 10,t1=0,t2=1,sum;
		System.out.print("First " + num + " terms: ");
		for( int i=0;i<=10;i++) {
			
			System.out.print(t1+ " +");
			sum=t1+t2;
			t1=t2;
			t2=sum;
		}
		
		
	}

}
