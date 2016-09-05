package arrays;



/*Find minimum difference between any two elements
Given an unsorted array, find the minimum difference between any pair in given array.

Examples :

Input  : {1, 5, 3, 19, 18, 25};
Output : 1
Minimum difference is between 18 and 19

Input  : {30, 5, 20, 9};
Output : 4
Minimum difference is between 5 and 9

Input  : {1, 19, -4, 31, 38, 25, 100};
Output : 5
Minimum difference is between 1 and -4*/
public class Minimum_diff_between_two_elements {

	public static void main(String[] args) {

		int[] array = {1, 19, -4, 31, 38, 25, 100};
		System.out.println(minimum_difference(array));
	}

	private static int minimum_difference(int[] array) {

		int minimum = Integer.MAX_VALUE;
		;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (Math.abs(array[i] - array[j]) < minimum) {

					minimum = Math.abs(array[i] - array[j]);
				}
			}
		}
		return minimum;
	}

}
