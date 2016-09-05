package arrays;

/*Count Strictly Increasing Subarrays
Given an array of integers, count number of subarrays (of size more than one) that are strictly increasing.
Expected Time Complexity : O(n)
Expected Extra Space: O(1)

Examples:

Input: arr[] = {1, 4, 3}
Output: 1
There is only one subarray {1, 4}

Input: arr[] = {1, 2, 3, 4}
Output: 6
There are 6 subarrays {1, 2}, {1, 2, 3}, {1, 2, 3, 4}
                      {2, 3}, {2, 3, 4} and {3, 4}

Input: arr[] = {1, 2, 2, 4}
Output: 2
There are 2 subarrays {1, 2} and {2, 4}
*/
public class increasing_subarray {

	public static void main(String[] args) {

		int[] array = { 1, 2, 2, 4 };
		System.out.println(subarray_counts(array));

	}

	private static int subarray_counts(int[] array) {

		int count = 0;

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				System.out.println(array[i]+" "+array[j]);
				if (array[j] > array[j-1]) {
					count++;
				} else {
					break;
				}
			}
		}
		return count;
	}

}
