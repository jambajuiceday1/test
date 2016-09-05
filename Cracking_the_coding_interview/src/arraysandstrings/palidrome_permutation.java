package arraysandstrings;
//1.4
public class palidrome_permutation {

	public static void main(String[] args) {

		String string = "Tact Coa";
		System.out.println("Result: "+palindrome(string));
	}

	private static boolean palindrome(String string) {
		
		int[] table = buildCharArrayFrequency(string);
		System.out.println("palindrom:"+CheckMaxOneOdd(table));
		for(int count:table){
			System.out.println("count"+count);
		}
		return CheckMaxOneOdd(table);
		
	}

	private static boolean CheckMaxOneOdd(int[] table) {
		
		boolean foundodd = false;
		for(int i : table){
			if(i%2 == 1){
				if(foundodd){
					return false;
				}
				foundodd = true;
		
			}
			
			
		}
		return true;
	}

	private static int[] buildCharArrayFrequency(String string) {
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		for(char c:string.toCharArray()){
			 int x = getCharNumber(c);
			 
			 if(x!=-1){
				 table[x]++;
			 }
		}
		return table;
	}

	private static int getCharNumber(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int A = Character.getNumericValue('A');
		int Z = Character.getNumericValue('Z');
		
		
		int value = Character.getNumericValue(c);
		
		if(a<=value && value <= z ){
			return (value - a);
		}
		else if(A<=value && value <= Z){
			System.out.println("A"+(value - A));
			return value - A;
		}
		return -1;
	}

}
