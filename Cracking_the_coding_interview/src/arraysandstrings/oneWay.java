package arraysandstrings;

public class oneWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		
//		System.out.println("Replacement "+OneEditAway("pale","ple"));
//		System.out.println("Insert "+OneEditAway("pale","pales"));
//		System.out.println("remove "+OneEditAway("pale","bale"));
		System.out.println("remove "+OneEditAway("pale","bae"));


	}

	private static boolean OneEditAway(String string1, String string2) {
		
		if(string1.length() == string2.length()){
			return editReplace(string1,string2);
		}
		else if((string1.length()+1) == string2.length()){
			return editInsert(string1,string2);
		}
		else if((string1.length()-1) == string2.length()){
			return editInsert(string2,string1);
		}
		return false;
	}

	private static boolean editInsert(String string1, String string2) {
		
		
		int index1 = 0;
		int index2 = 0;
		while(index1 < string1.length() && index2 < string2.length()){
		
			
			if(string1.charAt(index1) != string2.charAt(index2)){
				System.out.println("\n1: "+index1 + "\n2: " + index2);
				if(index1!=index2){
					return false;
				}
				index2++;
				
			}else{
				index1++;
				index2++;
			}
		}
		return true;
	}

	private static boolean editReplace(String string1, String string2) {
		
		boolean foundReplacement = false;
		for (int i = 0; i < string1.length(); i++) {
			if(string1.charAt(i) != string2.charAt(i)){
				//System.out.println("foundReplacement"+foundReplacement);
				if(foundReplacement){
					System.out.println("in false");
					return false;
				}
				foundReplacement = true;
				
				
			}
			
		}
		
		return true;
	}

}
