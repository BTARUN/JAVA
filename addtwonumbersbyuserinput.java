package basic_java;
import java.util.Scanner;
public class addtwonumbersbyuserinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number : ");
		int a =sc.nextInt();
		System.out.println("enter second number : ");
		int b=sc.nextInt();
		int sum = a+b;
		System.out.println(sum);
		sc.close();

	}

}
