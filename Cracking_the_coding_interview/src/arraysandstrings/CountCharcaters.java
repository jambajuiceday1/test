package arraysandstrings;

import java.util.HashMap;
import java.util.Map;

//Implement a method to perform basic string compression using the counts
//of repeated characters. For example, the string aabcccccaaa would become
//a2blc5a3. If the "compressed" string would not become smaller than the original
//string, your method should return the original string.
public class CountCharcaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "aaabbbbcccccddaaa";
		System.out.println(getCharCount(input));

	}

	private static String getCharCount(String input) {
		int count = 0;
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < input.length(); i++) {
			count++;
			if(i + 1 >= input.length() || input.charAt(i) != input.charAt(i+1)){
				
				
				sb.append(input.charAt(i));
				sb.append(count);
				count = 0;
			}
		}
		return sb.toString();
		
	
	}

}
