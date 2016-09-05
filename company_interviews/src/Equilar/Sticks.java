package Equilar;

import java.util.ArrayList;
import java.util.List;

public class Sticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {5,4,4,2,2,8};
		Integer[] array1 = cutTheRod(array);
	}

	private static Integer[] cutTheRod(int[] lengths) {
		

		int[] totalSticks = new int[1001];
		int numSticks = lengths.length;
		
		for(int i = 0; i < numSticks; i ++)
		{
			totalSticks[(lengths[i])]++;
		}
		
		List<Integer> list  =new ArrayList<>();
		for(int j = 1; j <= 1000; j ++)
		{
			if(totalSticks[j] != 0)
			{
				System.out.println(numSticks);
				list.add(numSticks);
				numSticks -= totalSticks[j];
			}
		}
		
		Integer[] myArray = list.toArray(new Integer[0]);
		return myArray;
		
	}

}
