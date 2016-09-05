package arrays;

import java.util.Arrays;
import java.util.List;

/*First question was you are given a array of string followed by two words. You have to find the minimum distance between the two words in the given array of string. For example:
("the”, "quick”, "brown”, "fox”, "quick”)
distance("fox”,”the”) == 3
distance("quick”, "fox”) == 1*/
public class difference_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array = { "the", "quick", "brown", "fox", "quick" };
		
		System.out.println(get_distance(array,"a","fox"));
	}

	private static int get_distance(String[] array, String first, String second) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList(array);
		int a = list.indexOf(first);
		int b = list.indexOf(second);
		System.out.println(Math.abs(a-b));
		return 0;
	}

}
