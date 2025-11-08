//this program calculates the power of a number using a loop
package programs;
import java.util.Scanner;

public class calculatepower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the base : ");
		int base = sc.nextInt();
		System.out.println("enter the exponent : ");
		int exponent = sc.nextInt();
		long result = 1;
		for (int i=1; i<=exponent; i++) {
			result *= base;
		}
		System.out.println(base + " raised to the power " + exponent + " is : " + result);
		sc.close();

	}

}
