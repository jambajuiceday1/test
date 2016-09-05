package practice;

//Write a method to replace all spaces in a string with'%20'. You may assume that
//the string has sufficient space at the end of the string to hold the additional
//characters, and that you are given the "true" length of the string. (Note: if implementing
//in Java, please use a character array so that you can perform this operation
//in place.)
//EXAMPLE
//Input: "Mr John Smith     "
//Output: "Mr%20Dohn%20Smith"
public class Replace_space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Mr John Smith     ";
		System.out.println(format(str));

	}

	private static String format(String str) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < str.trim().length(); i++) {
			char x = str.charAt(i);
		
			if(x!=32)
				sb.append(x);
			else
				sb.append("%20");
				
		}
		return sb.toString();
	}

}
