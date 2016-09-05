package coursera;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun1("Coursera"));

	}
	
	public static String fun1(String s){
		
		List<Character> charList = new ArrayList<>();
		charList.add('a');
		charList.add('e');
		charList.add('i');
		charList.add('o');
		charList.add('u');
		
		char[] arr = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;
		while(i < j){
			if(!charList.contains(arr[i])){
				i++;
				continue;
			}
			
			if(!charList.contains(arr[j])){
				j--;
				continue;
			}
			
			char t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			
			i++;
			j--;
		}
		return new String(arr);
		
	}

}
