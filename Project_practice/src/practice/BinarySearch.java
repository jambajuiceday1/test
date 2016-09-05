package practice;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 14, 67, 89, 90 };

		System.out.println(search(array, 89));
	}

	private static int search(int[] array, int key) {

		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			
			int middle =  low + (high - low)/2;
			
			System.out.println("high"+high);
			if (key == array[middle])
				return middle;
			else if (key > array[middle]) {
				low = middle + 1;

			} else if (key < array[middle]) {
				high = middle - 1;
			}
		}

		return -1;
	}

}
