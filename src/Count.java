
public class Count {
	public static void main(String[] args) {

        int count = 0, num = 345213;

        while(num != 0)
        {
            // num = num/10
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
    }
}
