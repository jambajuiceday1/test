package arrays;

/*Rearrange an array in maximum minimum form
Given a sorted array of positive integers, rearrange the array alternately i.e first element should be maximum value, second minimum value, third second max, fourth second min and so on.

Examples:

Input  : arr[] = {1, 2, 3, 4, 5, 6, 7} 
Output : arr[] = {7, 1, 6, 2, 5, 3, 4}

Input  : arr[] = {1, 2, 3, 4, 5, 6} 
Output : arr[] = {6, 1, 5, 2, 4, 3}
Expected time complexity is O(n).*/
public class Rearrange_array_in_max_min_form {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };

		int x = 0;
		int y = array.length - 1;
		int temp = 0;

		for (int i = 0; i < array.length / 2; i++) {

			temp = array[x];
			array[x] = array[y];
			array[y] = temp;
			x++;
			y--;

		}

		System.out.println("array" + array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
