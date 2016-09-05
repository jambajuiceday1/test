package com.hackersrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class lexical_analysis_of_string_compare {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		System.out.println("first input");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		System.out.println("second input");
		Scanner sc1 = new Scanner(System.in);
		int input2 = sc1.nextInt();

		lexicographic_analysis(input, input2);
	}

	public static void lexicographic_analysis(String input, int length) {

		StringBuilder sb = new StringBuilder();
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < input.length(); i++) {

			if (i <= input.length() - 3) {
				String temp = input.substring(i, i + 3);
				list.add(temp);
				System.out.println("list\t" + temp);

			}

		}

		Collections.sort(list);

		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));

	}

}
