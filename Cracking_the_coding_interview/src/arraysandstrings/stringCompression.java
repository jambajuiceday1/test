package arraysandstrings;

//aaabbbccc = a2b2c2
public class stringCompression {

	public static void main(String[] args) {

		System.out.println(compressString("aaabbbbcccccddaaa"));

	}

	private static String compressString(String string) {
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			count++;
			// System.out.println("before"+i);
			if (i + 1 >= string.length() || string.charAt(i) != string.charAt(i + 1)) {
				// System.out.println("after"+i);
				sb.append(string.charAt(i));
				sb.append(count);
				count = 0;
			}

		}

		return sb.toString().length() < string.length() ? sb.toString() : string;

	}

}
