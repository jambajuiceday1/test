package arraysandstrings;

public class urlify {

	public static void main(String[] args) {

		String url = "Mr John Smith    ";
		System.out.println(check_url(url));

	}

	private static String check_url(String url) {

		StringBuilder sb = new StringBuilder();
		char[] char_set = url.toCharArray();

		for (int i = 0; i < url.trim().length(); i++) {
			int x = url.charAt(i);

			if (x == 32) {
				sb.append("%20");
			} else
				sb.append(url.charAt(i));

		}
		return sb.toString();
	}

}
