//this program checks whether the entered number is positive, negative or zero
package programs;
import java.util.Scanner;

public class checkpositivenegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number : ");
		int num=sc.nextInt();
		if(num > 0)
			System.out.println("the entered number is positive ");
		else if(num < 0)
			System.out.println("the entered number is negative ");
		else
			System.out.println("the entered number is zero ");
		sc.close();

	}

}
