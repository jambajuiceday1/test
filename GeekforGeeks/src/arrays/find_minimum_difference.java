package arrays;

public class find_minimum_difference {

	public static void main(String[] args) {

		int[] array = {1, 19, -4, 31, 38, 25, 100};
		System.out.println(find_minimun(array));
	}

	private static int find_minimun(int[] array) {
		int min = Integer.MAX_VALUE;
		int temp = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i+1; j < array.length; j++) {
				temp = Math.abs(array[i] - array[j]);

				//System.out.println(array[i]+" - "+array[j]+" = "+temp);
				if (temp < min ) {
					min = temp;
				}

			}
		}
		return min;
	}

}
