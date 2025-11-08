package programs;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number : ");
		int num=sc.nextInt(), original = num, rev = 0;
		while (num != 0) {
			rev = rev * + num % 10;
			num /= 10;
		}
		if (original == rev)
			System.out.println(original + " is a palindrome ");
		else
			System.out.println(original + " is not a palindrome");
		sc.close();

	}

}
