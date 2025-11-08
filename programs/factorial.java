package programs;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		long fact = 1;
		for(int i = 1; i <= n;i++) {
			fact *= i;
		}
		System.out.println(" factorial of " + n + " is : " + fact);
		sc.close();

	}

}
