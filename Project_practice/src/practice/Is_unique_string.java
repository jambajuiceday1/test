package practice;

//Implement an algorithm to determine if a string has all unique characters. What
//if you cannot use additional data structures?
public class Is_unique_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "abcdeyy";
		System.out.println(is_unique(string));

	}

	private static boolean is_unique(String string) {

		boolean[] array = new boolean[256];
		
		for (int i = 0; i < string.length(); i++) {
			
			int x = string.charAt(i);
			if(array[x] == false)
				array[x] = true;
			else
				return false;
		}
		return true;
	}

}
