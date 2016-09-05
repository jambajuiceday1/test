package arrays_strings_problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution55_reverse_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "leetcode";
		System.out.println(reverse(s));
	}

	private static String reverse(String s) {

		List<Character> set = new ArrayList<Character>();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		
		List<Character> set2 = new ArrayList<Character>();
		
		for(int i = s.length()-1 ; i >= 0 ; i--){
			System.out.println(i);
            if(set.contains(s.charAt(i))){
            	set2.add(s.charAt(i));
            }
        }
		
		StringBuilder sb =  new StringBuilder();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(set.contains(s.charAt(i))){
            	sb.append(set2.get(count));
            	count++;
            }else{
            	sb.append(s.charAt(i));
            }
		}
		
		
		return sb.toString();
		
	}

}
