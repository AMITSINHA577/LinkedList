package Recursoin;

public class SumOfNumbersRecursion {

	int sum(int n) {
		if (n == 1) {
			return 1;
		}

		return n + sum(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfNumbersRecursion obj1 = new SumOfNumbersRecursion();
		System.out.println("Sum of n Number is " + obj1.sum(4));

	}

}
