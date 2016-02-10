/* *************************************************************************
   * Name: David Johnson
   * Date: 11/15/15
   * Version: 1.0
   * Purpose of program (quoted from projecteuler.net):
   * 2520 is the smallest number that can be divided by each of the numbers
   * from 1 to 10 without any remainder.
   * What is the smallest positive number that is evenly divisible
   * by all of the numbers from 1 to 20?
   * 
   * This program is a solution based on knowledge of number theory.
   * Below is a chart demonstrating the concept.  The number on the right
   * is the smallest number that is divisible by the numbers on the left.
   *   1 : 1
   *   1,2 : 2
   *   1,2,3 : 6
   *   1,2,3,4 : 12
   *   1,2,3,4,5 : 60
   *   1,2,3,4,5,6 : 120
   *   1,2,3,4,5,6,7 : 840
   *   ...
   *   1,2,3,4,5,6,7,8,9,10 : 2520
   *   
   *   Notice that if a number, N, is divisible by all numbers from 1 to x,
   *   then the number, M, which is divisible by all numbers from 1 to x+1
   *   is also divisible by N
   *   
   *   For example:  If 6 is divisible by 1,2,3, then the number 12, which is
   *  				 divisible by 1,2,3,4, is also divisible by 6.
   * *********************************************************************** */

package projecteuler;

public class Euler5 {

	public static void main(String[] args) {
		long N = 2520;
		long N_addition = 2520;
		int x = 11;
		while ( x != 21) {
			while (N % x != 0) {
				N = N + N_addition; 
			}
			//Set the old N_addition to the new N in conjunction with
			//the number theory demonstrated above
			x++;
			N_addition = N;
		}
		
		System.out.println("The smallest number that can be divided by each " 
							+ "of the numbers from 1 to 20 is: " + N);
	}

}
