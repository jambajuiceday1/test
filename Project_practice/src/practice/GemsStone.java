package practice;

public class GemsStone {
	public static void main(String[] args) {

		String[] array = { "abcdde", "baccd", "eeabgc","cab","cab" };
		System.out.println(is_gemsstone(array,5));
	}

	private static int is_gemsstone(String[] array,int len) {

		String string = array[0];
		int count = 0;
		int final_count = 0;
		for (int j = 0; j < string.length(); j++) {

			String character = Character.toString(string.charAt(j));

			for (int i = 0; i < array.length; i++) {
				if (array[i].contains(character)) {
					// System.out.println(array[i]);
					count = count + 1;
				}
			}

			if (count == array.length) {
				// System.out.println("final: " + count);

				final_count = final_count + 1;
			}
			count = 0;
		}
		return final_count;
	}

}
