package programs;
import java.util.Scanner;
public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int num=sc.nextInt(), sum=0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("Sum of digits : " + sum);
		sc.close();

	}

}
