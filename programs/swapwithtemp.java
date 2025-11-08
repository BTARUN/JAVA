package programs;

public class swapwithtemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int temp;
		System.out.println("before swapping the value of a is : " + a);
		System.out.println("before swapping the value of b is : " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("after swapping the value of a is : " + a);
		System.out.println("after swapping the value of b is : " + b);
	}

}
