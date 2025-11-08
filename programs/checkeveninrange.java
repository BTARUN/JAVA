//this program prints all the even numbers in the given range
package programs;
import java.util.Scanner;

public class checkeveninrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the start and end range : ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		System.out.println("even numbers in the range from " + start + " to " + end + "are :");
		for(int i=start; i<=end; i++)
			if(i % 2==0) {
				System.out.println(i + " ");
			}
		sc.close();

	}

}
