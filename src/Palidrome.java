
public class Palidrome {
	public static void main(String[]args) {
		
		int num = 123, reversedNumber=0,orignalNumber,remainder;
		orignalNumber = num;
		
		while(num!=0) {
			remainder = num%10;
			reversedNumber = reversedNumber *10 + remainder;
			num /=10;
		}
		
		if(reversedNumber==orignalNumber) {
			System.out.println("palidrome");
		}
		else {
			System.out.println("not palidrome");
			
		}
	}

}
