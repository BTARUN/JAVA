//this program checks whether the character is vowel or consonant
package programs;
import java.util.Scanner;

public class checkvowelorconsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character : ");
		char ch=sc.next().toLowerCase().charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
			System.out.println(ch + " is a vowel");
		else if(ch >= 'a' && ch <= 'z')
			System.out.println(ch + " is a consonant");
		else
			System.out.println("Invalid input");
		sc.close();

	}

}
