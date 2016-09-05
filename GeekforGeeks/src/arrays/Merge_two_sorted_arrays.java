package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/*We are given two sorted array. We need to merge these two arrays such that the initial numbers (after complete sorting) are in the first array and the remaining numbers are in the second array. Extra space allowed in O(1).

Example:

Input: ar1[] = {1, 5, 9, 10, 15, 20};
       ar2[] = {2, 3, 8, 13};
Output: ar1[] = {1, 2, 3, 5, 8, 9}
        ar2[] = {10, 13, 15, 20}*/
public class Merge_two_sorted_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar1[] = { 1, 5, 9, 10, 15, 20 };
		int ar2[] = { 2, 3, 8, 13 };

		mergeArrays(ar1, ar2);
		System.out.println("Array 1");
		for (int i = 0; i < ar1.length; i++) {
			System.out.println(ar1[i]);
		}
		System.out.println("Array 2");
		for (int i = 0; i < ar2.length; i++) {
			System.out.println(ar2[i]);
		}
		

	}

	private static void mergeArrays(int[] ar1, int[] ar2) {
		// TODO Auto-generated method stub
		int[] mergeArray = new int[ar1.length + ar2.length];
		for (int i = 0; i < ar1.length; i++) {
			System.out.println("arr1 " + ar1[i]);
			mergeArray[i] = ar1[i];

		}
		for (int i = ar1.length; i < mergeArray.length; i++) {
			// System.out.println(i - ar1.length);
			mergeArray[i] = ar2[i - ar1.length];
		}
		Arrays.sort(mergeArray);
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = mergeArray[i];
		}

		for (int i = ar1.length; i < mergeArray.length; i++) {
			ar2[i - ar1.length] = mergeArray[i];
		}

	}

}
