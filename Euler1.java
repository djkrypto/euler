/* *************************************************************************
   * Name: David Johnson
   * Date: 11/15/15
   * Version: 1.0
   * Purpose of program (quoted from projecteuler.net): 
   * If we list all the natural numbers below 10 that are multiples of
   * 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
   * Find the sum of all the multiples of 3 or 5 below 1000.
   * *********************************************************************** */

package projecteuler;

public class Euler1 {

	public static void main(String[] args) {
		int sum = sumOfMultiples(3, 5, 1000);
		
		System.out.println("The sum of all of the multiples of 3 or 5 " +
						   "below 1000 is: " + sum);
	}
	
	/* *********************************************************************
	 * Returns the sum of all the multiples of m1 or m2 that are below
	 * upperBound.
	 * 
	 * @param  m1		first multiple
	 * @param  m2		second multiple		
	 * @return 			sum of all multiples of m1 or m2 below upperBound
	 * ********************************************************************* */
	public static int sumOfMultiples(int m1, int m2, int upperBound) {
		int sum = 0;
		
		//Natural numbers start at 1
		for (int i = 1; i < upperBound; i++) { 
			if (i % m1 == 0 || i % m2 == 0) {
				sum += i;
			}
		}
		
		return sum;
	}
}
