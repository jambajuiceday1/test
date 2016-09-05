package arrays;

import java.util.Random;

public class Shuffle_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		shuffle(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}
		
	}

	private static void shuffle(int[] array) {

	
		Random rand = new Random();
		
		for (int i = array.length - 1; i > 0 ; i--) {
			int index = rand.nextInt(i+1);
			//System.out.println(index);
			int temp = array[i];
			array[i] = array[index];
			array[index] = temp;
			
			
		}
		
	}

}
