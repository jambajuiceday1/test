package sorting_and_searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//there are two array A and B,A has much buffer to add B,
//merge B to A in sorted order
public class Merge_two_arrays_in_sorted_order {

	public static void main(String[] args) {

		Integer[] A = new Integer[20];
		A[0] = 1;
		A[1] = 2;
		A[2] = 9;
		A[3] = 10;
		A[4] = 11;

		int[] B = { 3, 4, 7, 8, 12 };
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] != null) {
				count++;
			}

		}
		Merge(A, B, count, B.length);
		for (Integer i = 0; i < A.length; i++) {
			//if(A[i] != null){
				System.out.println("Array: "+A[i]);
			//}
		}
		System.out.println();
	}

	private static void Merge(Integer[] a, int[] b, int Alength, int Blength) {

		int indexA = Alength - 1;
		int indexB = b.length - 1;
		System.out.println("A len "+Alength+"B len "+b.length);
		System.out.println("indexA "+indexA+"indexB "+indexB);
		int mergeIndex = Alength + Blength - 1;
		System.out.println("mergeindex"+mergeIndex);
		while (indexB >= 0) {

			if (indexA >= 0 && a[indexA] > b[indexB]) {
				a[mergeIndex] = a[indexA];
				System.out.println("a index"+a[indexA]);
				indexA--;
			} else {
				a[mergeIndex] = b[indexB];
				System.out.println("b index"+b[indexB]);
				
				indexB--;
			}
			mergeIndex--;
		}
		//System.out.println(indexA + " " + indexB);
	}

}
