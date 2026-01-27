package Recursoin;

public class BinarySearchRecursion {

	public int binarySearch(int[] arr, int target, int start, int end) {

		if (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				return mid;
			}

			if (arr[mid] <= target) {
				return binarySearch(arr, target, mid + 1, end);
			}

			if (arr[mid] >= target) {
				return binarySearch(arr, target, start, mid - 1);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchRecursion obj1 = new BinarySearchRecursion();
		int[] arr = { 12, 23, 43, 53, 60, 67, 88, 99, 100 };

		System.out.println(obj1.binarySearch(arr, 100, 0, 8));

	}

}
