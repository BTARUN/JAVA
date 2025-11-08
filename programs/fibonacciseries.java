package programs;
import java.util.Scanner;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the number of terms ");
		int n = sc.nextInt();
		int a = 0, b= 1;
		System.out.println(" fibonacciseries: " + a + " " + b);
		for (int i = 2; i< n; i++) {
			int next = a +b;
			System.out.println(" " + next);
			a = b;
			b = next;
		}
		sc.close();

	}

}
