/* ************************************************************************
   * Name: David Johnson
   * Date: 11/15/15
   * Version: 1.0
   * Purpose of program (quoted from projecteuler.net):
   * Each new term in the Fibonacci sequence is generated by adding
   * the previous two terms. By starting with 1 and 2, the first
   * 10 terms will be: 
   *      1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
   * By considering the terms in the Fibonacci sequence whose values
   * do not exceed four million, find the sum of the even-valued terms.
   * *********************************************************************** */

package projecteuler;

public class Euler2 {

	public static void main(String[] args) {
		long upperBound = 4000000;
		long sum = getEvenFibonacciSum(upperBound);
		
		System.out.printf("The sum of all even Fibonnaci Numbers less " + 
						   "than %d is: %d", upperBound, sum);
	}

	/* *********************************************************************
	 * Returns the sum of all of the even terms in the Fibonnaci sequence
	 * that are less than or equal to upperBound.
	 * 
	 * @param  upperBound	the largest integer considered for subsequent
	 * 						Fibonnaci numbers
	 * @return 				the sum of all even Fibonnaci numbers less than
	 * 						or equal to upperBound
	 * ********************************************************************* */
	public static long getEvenFibonacciSum(long upperBound) {
		long fibOne = 1;
		long fibTwo = 2;
		long fibTwoCopy;
		long sum = 0;
		
		while (fibTwo < upperBound) {
			//We only need to check fibTwo for even numbers since the old
			//  fibTwo will become fibOne
			if (fibTwo % 2 == 0)
				sum += fibTwo;
			
			//set the new fibOne and fibTwo
			fibTwoCopy = fibTwo;
			fibTwo = nextFib(fibOne, fibTwo);
			fibOne = fibTwoCopy;
		}
		
		return sum;
	}
	
	/* *********************************************************************
	 * Returns the Fibonnaci number following the greater of a and b.
	 * 
	 * @param  a	Fibbonaci number 1
	 * @param  b	Fibonnaci number 2
	 * @return 		the Fibonnaci number directly following the greater of
	 * 				a and b
	 * ********************************************************************* */
	public static long nextFib(long a, long b) {
		return a + b;
	}
}
