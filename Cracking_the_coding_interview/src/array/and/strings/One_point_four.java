package array.and.strings;

import javax.swing.text.StyledEditorKit.ForegroundAction;

//Write a method to replace all spaces in a string with'%20'. You may assume that
//the string has sufficient space at the end of the string to hold the additional
//characters, and that you are given the "true" length of the string. (Note: if implementing
//in Java, please use a character array so that you can perform this operation
//in place.)
//EXAMPLE
//Input: "Mr John Smith     "
//Output: "Mr%20Dohn%20Smith"
public class One_point_four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = "Mr John Smith     ";
		String sec = "Mr%20Dohn%20Smith";
		int i = 0;
		char[] array = first.toCharArray();
		for (i = first.length() - 1; i > 0; i--) {
			if ((int) first.charAt(i) == 32) {
				System.out.println("first" + (int) first.charAt(i));
				continue;

			} else
				System.out.println(" test " + i);
			break;
		}
		
		String str = "";
		for (int j = 0; j <= i; j++) {
			System.out.println(array[j]);
			char test = ' ';
			if((array[j]) == test)
			{
				
			str = str + '%' + '2' + '0';
			
			}
			else
			str = str + array[j];
		}
		
		System.out.println("Result : " + str);
	}

}
