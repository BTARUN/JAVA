//this program finds the length of the given string without using buil-in methods
package programs;
import java.util.Scanner;

public class stringlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string : ");
		String str=sc.nextLine();
		int length = 0;
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			length++;
		}
		System.out.println("Length of string is : " + length);
		sc.close();

	}

}
