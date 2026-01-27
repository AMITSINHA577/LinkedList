package Recursoin;

public class FactorialRecursion {

	public int factorial(int n) {
		if (n == 0) {
			return 1;
		}

		return n * factorial(n - 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialRecursion obj1 = new FactorialRecursion();
		System.out.println("Factorial of 4 is " + obj1.factorial(4));

	}

}
