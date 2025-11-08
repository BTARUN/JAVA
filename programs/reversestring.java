//this program reverses the given string
package programs;
import java.util.Scanner;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string : ");
		String str=sc.nextLine();
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println("Original string is : " + str);
		System.out.println("Reversed string is : " + reversed);
		sc.close();

	}

}
