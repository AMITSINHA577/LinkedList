package Recursoin;

public class FibonacciRecursion {

	public int fibonacci(int n) {

		if (n == 0 || n == 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciRecursion obj1 = new FibonacciRecursion();
		System.out.println(obj1.fibonacci(6));

	}

}
