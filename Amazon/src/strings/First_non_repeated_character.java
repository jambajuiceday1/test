package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class First_non_repeated_character {

	public static void main(String[] args) {
		
		System.out.println("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		System.out.println(getNonRepeatedCharcter(input));
		

	}

	private static char getNonRepeatedCharcter(String input) {
		// TODO Auto-generated method stub
		
		Map<Character,Integer> charctaerMap = new HashMap<Character,Integer>();
		
		
		for (int i = 0; i < input.length(); i++) {
			
			char c = input.charAt(i);
			if(charctaerMap.containsKey(c)){
				charctaerMap.put(c, charctaerMap.get(c)+1);
			}else{
				charctaerMap.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> map:charctaerMap.entrySet())
		{
			System.out.println("key : "+map.getKey()+ " value :"+map.getValue());
		}
		for (int i = 0; i < input.length(); i++) {
			
			char t = input.charAt(i);
			if(charctaerMap.get(t) == 1)
				return t;
		}
		return 0;
	}

}
