package com.hackersrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regax_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
		
		String longString = "Derek Banas CA 12345 PA (432)555-1212 johnsmith";
		String strangeString = "1Z aaa **** *** {{{ {{ { ";
		//regexChecker("\\s[A-Za-z]{2,20}\\s",longString);

		//find zipcode
		//regexChecker("\\s\\d{5}\\s",longString);
		
		//find states with letter C and A
		//regexChecker("\\sC[A]|P[A]\\s",longString);
		
		//find brackets
		//regexChecker("(\\{{1,})",strangeString);
		
		//find
		regexChecker("[A-Za-z0-9._%-]+@[A-Za-z0-9._-]+\\.[A-Za-z]{2,4}",longString);
		
		
	}

	private static void regexChecker(String theRegex,String longString) {
		// TODO Auto-generated method stub

		Pattern pattern = Pattern.compile(theRegex);
		Matcher regexMatcher  = pattern.matcher(longString);
		
		while(regexMatcher.find()){
			if(regexMatcher.group().length()!=0){
				System.out.println(""+regexMatcher.group().trim());
			}
		}
	}

}
