package programs;
import java.util.Scanner;
public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int num = sc.nextInt();
		System.out.println("Original number " + num);
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		System.out.println("Reversed number " + rev);
		sc.close();
	}

}
