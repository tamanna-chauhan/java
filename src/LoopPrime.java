
public class LoopPrime {
	public static void main(String[]args) {
		int number = 34;
		boolean flag =  false;
		int i =2;
		
		
		while(i <= number/2) {
			if(number%2==0) {
				flag = true;
				break;
			}
			++i;
		}
		if(!flag) {
			System.out.println(number + " is a prime number");
		}
		else {
			System.out.println(number + " is not a prime number");
		}
	}

}
