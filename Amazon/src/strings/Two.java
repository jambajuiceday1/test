package strings;
//
//2. Given a string of parentheses, find if the expression is balanced or not ?
public class Two {

	public static void main(String[] args) {
		
		String str = "(((())))";
		
		parentheses(str);
		
	}

	private static void parentheses(String str) {
		
		char[] array = new char[str.length()];
		int counter  =0 ;
		if(str.length()%2!=0){
			System.out.println("Invalid");
		}else{
			
			for (int i = 0; i < array.length/2; i++) {
				counter = array.length ;
				if(array[i] == '('){
					if(array[counter] == ')')
					{
						counter -- ;
					}
				}
				else{
					System.out.println("Not a valid string");
				}
			}
			
			
			
		}
	}

}
