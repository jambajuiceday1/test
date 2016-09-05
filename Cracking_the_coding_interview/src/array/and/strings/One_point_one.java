package array.and.strings;

//Implement an algorithm to determine if a string has all unique characters. What
//if you cannot use additional data structures?

public class One_point_one {

	public static void main(String[] args) {

		String string = "qwertyuiopasdfghjkl";
		boolean[] array = new boolean[256];
		boolean flag = true;
		int x;
		for (int i = 0; i < string.length(); i++) {
			x = string.charAt(i);

			if (array[x] == false)
				array[x] = true;
			else
				flag = false;
		}

		if (flag == false) {
			System.out.println("Not unique character string");
		} else {
			System.out.println("Unique character string");
		}
	}

}
