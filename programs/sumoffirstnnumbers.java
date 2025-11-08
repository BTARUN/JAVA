//this program calculates the sum of first n natural numbers
package programs;
import java.util.Scanner;

public class sumoffirstnnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number : ");
		int n=sc.nextInt();
		int sum = n * (n + 1)/2;
		System.out.println("sum of first " + n + " natural numbers is : " + sum);
		sc.close();

	}

}
