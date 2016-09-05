package arraysandstrings;

import java.util.Arrays;

public class string_rotation {
	public static void main(String[] args){
		String first = "waterbottle";
		String second = "erbottlewat";
		char[] array = second.toCharArray();
		Arrays.sort(array);
		StringBuilder sb = new StringBuilder();
		sb.append(array);
		System.out.println(sb.toString());
		
		char[] array1 = first.toCharArray();
		Arrays.sort(array1);
		StringBuilder sb1 = new StringBuilder();
		sb1.append(array1);
		System.out.println(sb1.toString());
		
		//sb.substring(sb1.toString());
	}

}
