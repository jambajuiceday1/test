package Equilar;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 19, 20, 21 };
		System.out.println(binarySearch(array, 2));
	}

	private static int binarySearch(int[] array, int key) {
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int middle = low + (high - low) / 2;
			if (key < array[middle]) {
				high = middle - 1;
			} else if (key > array[middle]) {
				low = middle + 1;
			} else {
				return middle;
			}
		}
		return -1;

	}

}
