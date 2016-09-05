package com.hackersrank;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		System.out.println(is_palindrome(input));

	}

	private static String is_palindrome(String input) {

		StringBuilder sb = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {

			sb.append(input.charAt(i));

		}

		return (sb.toString().equals(input)) ? "Yes" : "No";

	}

}
