package arrays;

import java.util.Arrays;

/*Given a sorted array of positive integers, rearrange the array alternately i.e first element should be maximum value, second minimum value, third second max, fourth second min and so on.

Examples:

Input  : arr[] = {1, 2, 3, 4, 5, 6, 7} 
Output : arr[] = {7, 1, 6, 2, 5, 3, 4}
*/
public class Maximum_minimum_form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		formatArray(array);

	}

	private static void formatArray(int[] array) {
		
		Arrays.sort(array);
		
		for (int i = 0; i < array.length; i++) {
			
		}
	}

}
