package programs;
import java.util.Scanner;

public class largestofthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number: ");
		int num1=sc.nextInt();
		System.out.println("enter the second number: ");
		int num2=sc.nextInt();
		System.out.println("enter the number: ");
		int num3=sc.nextInt();
		if(num1 > num2 && num1 > num3)
			System.out.println(" the " + num1 + " is the largest of three ");
		else if(num2 > num1 && num2 > num3)
			System.out.println(" the " + num2 + " is the largest of three ");
		else
			System.out.println(" the " + num3 + " is the largest of three ");
		sc.close();
	}

}
