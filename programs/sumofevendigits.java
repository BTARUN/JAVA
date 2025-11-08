//this program finds the sum of even digits in a number
package programs;
import java.util.Scanner;

public class sumofevendigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int num=sc.nextInt();
		System.out.println("the entered number is : " + num);
		int sum = 0;
		while (num != 0) {
			int digit = num % 10;
			if(digit % 2 == 0) sum += digit;
			num /= 10;
		}
		System.out.println("the sum of even digits is : " + sum);
		sc.close();

	}

}
