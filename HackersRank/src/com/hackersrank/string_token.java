package com.hackersrank;

import java.io.*;
import java.util.*;

public class string_token {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Complete the code

		string_token(s);

	}

	private static void string_token(String string) {

		List<String> list = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for (int i = 0; i < string.length(); i++) {

			int x = string.charAt(i);
			if ((x >= 65 && x <= 90) || (x >= 97 && x <= 122)) {
				sb.append((char) x);
			} else {
				sb.append(" ");
			}

		}
		String[] output = sb.toString().trim().split("\\s+");
		if(output.length == 1){
			System.out.println(0);
		}
		else{
			System.out.println(output.length);
		}
		
		for (int j = 0; j < output.length; j++) {
			System.out.println(output[j]);
		}

	}
}
