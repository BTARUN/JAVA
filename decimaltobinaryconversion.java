package basic_java;



public class decimaltobinaryconversion {
	static void decToBinary(int n) {
		int[] binaryNum = new int[1000];
		int i=0;
		while(n>0) {
			binaryNum[i]=n%2;
			n=n/2;
			i++;
		}
		for(int j=i-1;j>=0;j--)
			System.out.println(binaryNum[j]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 17;
		System.out.println("Decimal - " + n);
		System.out.println("Binary - ");
		decToBinary(n);

	}

}
