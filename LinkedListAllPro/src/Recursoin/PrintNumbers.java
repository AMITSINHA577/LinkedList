package Recursoin;

public class PrintNumbers  {

	public void printNum(int n) {

		if (n == 0) {
			return;
		}

		System.out.println(n);
		printNum(n - 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintNumbers  obj1 = new PrintNumbers ();
		obj1.printNum(10);

	}

}
