package practice;

import java.util.Arrays;

public class MergSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 10, 9, 8, 7, 6, 5, 4, 2, 3, 1 };
		Merge_sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	private static void Merge_sort(int[] array) {

		int n = array.length;
		int mid = 0;
		if (n < 2)
			return;
		else {
			mid = n / 2;
			int[] left = new int[mid];
			int[] right = new int[n - mid];
			for (int i = 0; i < left.length; i++) {
				left[i] = array[i];
				//System.out.println(array[i]);
			}
			for (int i = mid; i < array.length; i++) {
				right[i - mid] = array[i];

				//System.out.println(+array[i]);
			}

			Merge_sort(left);
			Merge_sort(right);
			Merge(left, right, array);
		}

	}

	private static void Merge(int[] left, int[] right, int[] array) {

		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				array[k] = left[i];
				i = i + 1;

			}
			else{
				array[k] = right[j];
				j = j + 1;
			}

			k = k + 1;
		}

		while (i < left.length) {
			array[k] = left[i];
			i = i + 1;
			k = k + 1;
		}

		while (j < right.length) {
			array[k] = right[i];
			j = j + 1;
			k = k + 1;
		}

	}

}
