package br.edu.ifpr.numbers;

public class NumUtils {
	
	public static int invert(int num) {
		  int ninv;
	      for(ninv = 0; num > 0; ninv += num%10,ninv *= 10, num/=10)
	    	  ;
	      return ninv / 10;
	   }
	
	public static boolean pairOrOdd(int num) {
		if(num%2!=0)return false;
			return true;
	   }
	
	public static int numLenght(int num) {
		String integer = Integer.toString(num);
		return integer.length();
	}
	
	public static double roundNum(double num) {
		num = Math.round(num * 100);
 		return num /= 100;
	}
}