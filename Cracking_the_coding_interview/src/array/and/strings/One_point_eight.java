package array.and.strings;

//Assume you have a method isSubstring which checks if one word is a substring
//of another. Given two strings, si and s2, write code to check Ifs2 is a rotation of si
//using only onecalltoisSubstring (e.g., "waterbottLe" is a rotation of "erbottLewat").

public class One_point_eight {

	public static void main(String[] args) {

		String str1 = "waterbottLe";
		String str2 = "erbottLewat";
		rotation(str1, str2);
	}

	private static void rotation(String str1, String str2) {

		String str3 = str1 + str1;
		System.out.println(str3);
		substring(str2, str3);

	}

	private static void substring(String str2, String str3) {
		System.out.println("Result " + str3.toLowerCase().contains(str2.toLowerCase()));
	}

}
