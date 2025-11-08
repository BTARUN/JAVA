package programs;
import java.util.Scanner;
public class addtwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		int num1=sc.nextInt();
		System.out.println("enter second number:");
		int num2=sc.nextInt();
		int result = num1+num2;
		System.out.println("The sum of " + num1 + " & " + num2 + " is: " + result);
		sc.close();
	}

}
