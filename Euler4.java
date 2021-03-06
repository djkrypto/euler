/* ************************************************************************
   * Name: David Johnson
   * Date: 11/15/15
   * Version: 1.0
   * Purpose of program (quoted from projecteuler.net):
   * A palindromic number reads the same both ways.
   * The largest palindrome made from the product of two 2-digit numbers
   *   is 9009 = 91 × 99.
   * Find the largest palindrome made from the product
   *   of two 3-digit numbers.
   *   
   * This program attempts a brute force solution described in shorthand
   *   below:
   *   
   *   999 * 999
   *   999 * 998
   *   999 * ...
   *   ...
   *   998 * 998
   *   998 * 997
   *   ...
   *   100 * 100
   *   return largest palindrome
   * *********************************************************************** */

package projecteuler;

public class Euler4 {
	
	static long largestPalindrome;

	public static void main(String[] args) {
		
		long i, j, palindrome;
		
		for (i = 999; i > 99; i--) {
			for (j = 999; j > 99; j--) {
				palindrome = i * j;
				if (isPalindrome(palindrome))
					isGreater(palindrome);
			}
		}
		
		System.out.printf("The largest palindrome generated by the " +
						  "multiplication of 2 3-digit numbers " +
						  "is: %d", largestPalindrome);
	}

	/* *********************************************************************
	 * Returns boolean value indicating whether the variable palindrome is a
	 * palindrome.
	 * 
	 * @param  palindrome	the long in question
	 * @return 				true if palindrome is a palindrome,
	 * 						false otherwise
	 * ********************************************************************* */
	public static boolean isPalindrome(long palindrome) {
		int length = (int) (Math.log10(palindrome) + 1);
		String temp = Long.toString(palindrome);
		long[] palindrome_array = new long[length];
		
		for (int i = 0; i < length; i++) {
		    palindrome_array[i] = temp.charAt(i) - '0';
		}
		
		int modifier = length;
		int x,y; //values created for simplicity
		x = length - modifier;
		y = length - 1;
		
		while (modifier > (x + 1)) {
			if (palindrome_array[x] != palindrome_array[y])
				return false;
			
			modifier--;
			x = length - modifier;
			y = length - (x + 1);
		}
		
		return true;
	}

	/* *********************************************************************
	 * Checks if palindrome is larger than the current largestPalindrome.
	 * If it is, the global largestPalindrome is changed to the value of
	 * palindrome.
	 * 
	 * @param	palindrome	the palindrome in question
	 * ********************************************************************* */
	public static void isGreater(long palindrome) {
		if (palindrome > largestPalindrome)
			largestPalindrome = palindrome;
	}
}
