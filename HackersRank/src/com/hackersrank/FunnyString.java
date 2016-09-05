package com.hackersrank;

import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);
	        int count = sc.nextInt();
	       
	        Scanner sc1 = new Scanner(System.in);
	       
	        for(int i = 0 ; i < count ; i++){
	            
	        String test = sc1.nextLine();
	        
	        System.out.println(isFunny(test));
	        }
	}

	private static String isFunny(String first) {

		StringBuffer sb = new StringBuffer();

		for (int i = first.length() - 1; i >= 0; i--) {
				sb.append(first.charAt(i));
		}
		String second = sb.toString();
		
		for (int i = 1; i < first.length(); i++) {
			System.out.println(first.charAt(i) + "-" + first.charAt(i-1));
			System.out.println(second.charAt(i) + "-" + second.charAt(i-1));
			System.out.println(first.charAt(i) - first.charAt(i-1) + "=" + (second.charAt(i) - second.charAt(i-1))+"\n\n");
			
			
			if(Math.abs(first.charAt(i) - first.charAt(i-1)) != Math.abs(second.charAt(i) - second.charAt(i-1))){
				return "Not funny";
			}
		}
		return "Funny";
	}

}
