package arrays;

/*Subarray/Substring vs Subsequence and Programs to Generate them
Subarray/Substring

A subbarray is a contiguous part of array. An array that is inside another array. 
For example, consider the array [1, 2, 3, 4], There are 10 non-empty sub-arrays. 
The sub arrays are (1), (2), (3), (4), (1,2), (2,3), (3,4), (1,2,3), (2,3,4) and (1,2,3,4).
 In general, for an array/string of size n, there are n*(n+1)/2 non-empty subarrays/subsrings.
*/
public class printing_subarrays {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4 };
		print_subarray(array);

	}

	private static void print_subarray(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			System.out.println(array[i] + "\n");
			System.out.print(array[i]);
			for (int j = i + 1; j < array.length; j++) {
				System.out.print("," + array[j]);

			}

		}

	}

}
