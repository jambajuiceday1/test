package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solution(223336226));
	}

	public static int solution(int x){
		List<ArrayList<String>> l  = new ArrayList<ArrayList<String>>();
		for(int i = 0 ; i < 5; i++){
			ArrayList<String> s = new ArrayList<>();
			s.add("a"+i);
			l.add(s);
		}
		
		for(List<String> s : l){
			System.out.println(s);
		}
		Set<Integer> resultSet = new HashSet<>();
		StringBuffer tempBuffer = new StringBuffer();
		int returnValue = 0;
		String strNumber = String.valueOf(x);
		if(strNumber.length() > 0){
			for(int i = 0; i < strNumber.length()-1 ; i++){
				if(strNumber.charAt(i) == strNumber.charAt(i+1)){
					tempBuffer.append(strNumber.substring(0,i));
					tempBuffer.append(strNumber.substring(i+1));
					resultSet.add(Integer.parseInt(tempBuffer.toString()));
					if(tempBuffer.length() > 0){
						tempBuffer.delete(0, tempBuffer.length());
					}
				}
			}
			returnValue = Collections.max(resultSet);
		}
		return returnValue;
	}
	
}
