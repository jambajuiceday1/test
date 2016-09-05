package com.hackersrank;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class All_substring_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = palindromes("abba");
		
		Iterator<String> it = set.iterator();
	     while(it.hasNext()){
	        System.out.println(it.next());
	     }
		
	}
	
	public static Set<String> palindromes(final String input) {

	     final Set<String> result = new HashSet<>();

	     for (int i = 0; i < input.length(); i++) {
	         // expanding even length palindromes:
	         expandPalindromes(result,input,i,i+1);
	         // expanding odd length palindromes:
	         expandPalindromes(result,input,i,i);
	     } 
	     return result;
	  }

	  public static void expandPalindromes(final Set<String> result, final String s, int i, int j) {
	      while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
	            result.add(s.substring(i,j+1));
	            i--; j++;
	      }
	  }

}