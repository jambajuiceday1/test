package com.internet.brands;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x = 1;
//		int y = 1;
//		int z ;
//		
//		while(x<25){
//			z = x;
//			x = x+y;
//			y = z;
//			System.out.println(x);
//		}

		
	System.out.println(volleyball(3, 25));
	}
	static int mod = 1000000007, rec[];
	static int volleyball(int A, int B){
		int leads = 0;
		if(Math.max(A, B) < 25){
			leads =  0;
		}else if(A == 25){
			if(B >= 24){
				leads = 0;
			}else{
				return calcLeads(A -1 + B, B);
			}
		}else{
			if(B != A-2){
				leads = 0;
			}else{
				int result = calcLeads(48, 24);
				result = result * calcPow(2, A - 24 - 2) % mod;
				leads = result;			}
		}
		return leads;
	}

	static int calcLeads(int A, int B){
		return rec[A] * calcInterval(rec[B]) % mod * calcInterval(rec[A-B]) % mod;
	}
	
	static int calcPow(int A, int B){
		int result = 1;
		while(B > 0){
			if(B%2 == 1){
				result = result * A % mod;
				A = A*A % mod;
				B = B/2;
			}
		}
		return result;
	}
	static int calcInterval(int A){
		return calcPow(A, mod -2);
		
	}
}
