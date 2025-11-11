package basic_java;

public class factorial {
	static int fact(int n) {
		int res = 1, i;
		for(i=2;i<=n;i++)
			res *= i;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		System.out.println("Factorial of " + num + " is " + fact(5));

	}

}
