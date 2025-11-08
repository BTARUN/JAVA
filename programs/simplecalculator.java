package programs;
import java.util.Scanner;

public class simplecalculator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the first number ");
		double num1 =sc.nextDouble();
		System.out.println(" enter the second number ");
		double num2 =sc.nextDouble();
		System.out.println(" enter the operator ( + , - , * , / ) ");
		char op=sc.next().charAt(0);
		double result;
		switch(op) {
		case '+' : result = num1 + num2; break;
		case '-' : result = num1 - num2; break;
		case '*' : result = num1 * num2; break;
		case '/' : result = num2 != 0 ? num1 / num2 : 0; break;
		default: System.out.println("invalid operator");
		return;
		}
		System.out.println("Result : " + result);
		sc.close();

	}

}
