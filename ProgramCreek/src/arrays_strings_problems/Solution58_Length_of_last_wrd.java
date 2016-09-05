package arrays_strings_problems;

public class Solution58_Length_of_last_wrd {

	public static void main(String[] args) {
		String str = " ";
		System.out.println(strlength(str));
		
		
	}

	private static int strlength(String str) {
		
		
		String[] array = str.trim().split(" ");
		return array[array.length-1].length();
		
	}

}
