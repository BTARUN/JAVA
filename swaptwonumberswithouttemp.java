package basic_java;

public class swaptwonumberswithouttemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10,b=20;
		System.out.println("before swapping the value of a and b is : " + a + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swapping the value of a and b is : " + a + b);

	}

}
