package coursera;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
	}
	
	 static String electionWinner(String[] votes) {
	        
	        Map<String,Integer> hmap = new HashMap<String,Integer>();
	        int max = 0;
	        
	        for(String s: votes){
	            
	            if(hmap.containsKey(s)){
	                hmap.put(s,hmap.get(s)+1);
	            }else{
	                hmap.put(s,1);
	            }
	            
	        }
	        String m;
	        for(Map.Entry<String,Integer> i:hmap.entrySet()){
	            
	            if(max < i.getValue())
	            	max = i.getValue();
	            
	            m=i.getKey()
	        }
	        
	        
	        


	    }

}
