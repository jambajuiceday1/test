package arrays;

import java.util.Arrays;

/*Input:  arr1[] = {1, 4, 5, 7, 9}
arr2[] = {4, 5, 7, 9}
Output: 1
1 is missing from second array.

Input: arr1[] = {2, 3, 4, 5}
arr2[] = {2, 3, 4, 5, 6}
Output: 6
6 is missing from first array.*/
public class find_missing_elemt_in_array {

	public static void main(String[] args) {

		int[] array_one = { 1, 4, 5, 7, 9 };
		int[] array_two = { 4, 5, 7, 1 };

		System.out.println(find_missing_element(array_one, array_two));

	}

	private static int find_missing_element(int[] array_one, int[] array_two) {
		// TODO Auto-generated method stub
		Arrays.sort(array_one);
		Arrays.sort(array_two);
		int len = array_one.length > array_two.length ? array_one.length : array_two.length;
		for (int i = 0; i < len; i++) {

			if (i + 1 >= len || array_one[i] != array_two[i]) {
				if (len == array_one.length)
					return array_one[i];
				else
					return array_two[i];
			}
		}
		return 0;
	}

}
