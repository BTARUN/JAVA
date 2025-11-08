//this program finds the ASCII value of the given character
package programs;
import java.util.Scanner;

public class asciivalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character : ");
		char ch = sc.next().charAt(0);
		int ascii = ch;
		System.out.println("ASCII value of the " + ch + " is : " +ascii);
		sc.close();

	}

}
