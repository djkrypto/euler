/* ************************************************************************
   * Name: David Johnson
   * Date: 11/15/15
   * Version: 1.0
   * Purpose of program (quoted from projecteuler.net):
   * The sum of the squares of the first ten natural numbers is,
   * 1^2 + 2^2 + ... + 10^2 = 385
   * The square of the sum of the first ten natural numbers is,
   * (1 + 2 + ... + 10)^2 = 55^2 = 3025
   * Hence the difference between the sum of the squares of the first ten
   *   natural numbers and the square of the sum is 3025 − 385 = 2640.
   * Find the difference between the sum of the squares of the first one
   *   hundred natural numbers and the square of the sum.
   *   
   * This one was really easy so I went with the obvious brute_force answer
   * *********************************************************************** */

package projecteuler;

public class Euler6 {

	public static void main(String[] args) {
		long sum_of_squares = 0;
		long square_of_sums = 0;
		long answer = 0;
		int i,n;
		
		for (i = 1; i < 101; i++) {
			n = i*i;
			sum_of_squares += n;
			square_of_sums += i;
		}
		square_of_sums *= square_of_sums;
		
		answer = square_of_sums - sum_of_squares;
		System.out.println("The difference between the sum of the squares " +
						   "of the first one hundred natural numbers and " +
						   "the square of the sum is: " + answer);
	}

}
