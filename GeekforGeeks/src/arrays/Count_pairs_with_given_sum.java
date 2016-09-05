package arrays;

/*Given an array of integers, and a number ‘sum’, find the number of pairs of integers in the array whose sum is equal to sum.

Examples:
Input  :  arr[] = {1, 5, 7, -1}, 
          sum = 6
Output :  2
Pairs with sum 6 are (1, 5) and (7, -1)*/
public class Count_pairs_with_given_sum {

	public static void main(String[] args) {

		int[] array = {10, 12, 10, 15, -1, 7, 6, 
                5, 4, 2, 1, 1, 1};
		System.out.println(count_pairs(array,11));
	}

	private static int count_pairs(int[] array, int sum) {

		int count = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == sum) {
					count++;
				}

			}
		}
		return count;
	}

}
