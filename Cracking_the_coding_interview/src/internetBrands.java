import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class internetBrands {

	public static void main(String[] args) {
		int[] arr = {4,13,2,3,8,9};

		System.out.println(max_tickets(arr));
	}

	private static int max_tickets(int[] arr) {

		Arrays.sort(arr);
		Set<Integer> allCounterSet = new HashSet<Integer>();

		int counter = 1;
		for (int i = 0; i < arr.length; i++) {
			if( i+1 >= arr.length  || arr[i+1]-arr[i] > 1){
				allCounterSet.add(counter);
				counter = 1;
			}else{
				counter++;
			}
		}
		return Collections.max(allCounterSet);
		
	}
}
