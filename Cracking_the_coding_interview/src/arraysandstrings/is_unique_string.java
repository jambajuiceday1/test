package arraysandstrings;

//Implement an algorithm to determine if a string has all unique characters. What
//if you cannot use additional data structures?

public class is_unique_string {

	public static void main(String[] args) {

		String string = "abc";
		is_unique(string);

	}

	private static void is_unique(String string) {

		boolean[] array = new boolean[256];

		boolean flag = true;
	
			if (string.length() > 0) {
				for (int i = 0; i < string.length(); i++) {

					int c = string.charAt(i);

					if (array[c] == false) {
						array[c] = true;
					} else
						flag = false;

				}
			}

		if (string.length() > 128) {
			System.out.println("Not A Valid String");
		} else {
			String result = flag ? "String is unique" : "String is not unique";
			System.out.println(result);
		}

	}

}
