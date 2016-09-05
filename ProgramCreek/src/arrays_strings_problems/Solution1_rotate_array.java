package arrays_strings_problems;

/*Problem

Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to 
[5,6,7,1,2,3,4]. 
How many different ways do you know to solve this problem?
*/
public class Solution1_rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 2, 3, 4, 5, 6, 7 };

		Rotate(array, 3);

	}

	private static void Rotate(int[] array, int start) {

		int[] newArray = new int[array.length];

		int remaning = array.length - start;
		// System.out.println(remaning);
		int count = 0;
		for (int i = newArray.length; i > start + 1; i--) {
			newArray[count] = i;
			count++;
		}

		for (int i = 0; i < remaning; i++) {

			newArray[count] = array[i];
			count++;
		}

		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}

	}

}
