package programs;

public class swapwithouttemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		int b = 2;
		System.out.println("before swapping the value of a is : " + a);
		System.out.println("before swapping the value of b is : " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swapping the value of a is : " + a);
		System.out.println("after swapping the value of b is : " + b);

	}

}
