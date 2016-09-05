package strings;

//1. Write program to escape URL string, say you are given a URL string, you have to replace
//(space) -> %22
//(double quotes -> %d
//
//say http://www.google.com/hello world" -> http://www.google.com/hello%22world%d
//
//what is the space and time complexity, can we accomplish the solution with only one traversal of the string ?
public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "http://www.google.com/hello world\"";
		
		StringBuilder sb = new StringBuilder();
		
		char[] array = str1.toCharArray();

		for (int i = 0; i < array.length; i++) {
			if(array[i] == '"')
			{
				sb.append('%');
				sb.append('d');
			}
			else if(array[i] == ' '){
				sb.append('%');
				sb.append('2');
				sb.append('2');
				
			}
			else
			sb.append(array[i]);
		}
		
		System.out.println("result"+sb.toString());
	}

}
