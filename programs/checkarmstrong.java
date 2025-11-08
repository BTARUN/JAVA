//An armstrong number is a number that is equal to the sum of its own digits each raised to the power of number of digits..
package programs;
import java.util.Scanner;

public class checkarmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number : ");
		int num=sc.nextInt(), original = num, result = 0;
		int digits = String.valueOf(num).length();
		while (num != 0) {
			int digit = num % 10;
			result += Math.pow(digit, digits);
			num /= 10;
		}
		if(original == result)
			System.out.println(original + " is an armstrong number..");
		else
			System.out.println(original + " is not an armstrong number..");
		sc.close();

	}

}
