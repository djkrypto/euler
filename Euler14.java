/* ************************************************************************
   * Name: David Johnson
   * Date: 11/20/15
   * Version: 1.0
   * Purpose of program (quoted from projecteuler.net):
   * Longest Collatz sequence
   * Problem 14

The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

	13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
	It can be seen that this sequence (starting at 13 and finishing at 1)
	contains 10 terms. Although it has not been proved yet (Collatz Problem),
	it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
   * *********************************************************************** */

package projecteuler;

public class Euler14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long N = 0;
		N = getLongestChain();
		System.out.println("The number under one million that produces "
						   + "the longest chain is: " + N);
	}

	/* *********************************************************************
	 * @return 		the integer with the longest Collatz Sequence
	 * ********************************************************************* */
	public static long getLongestChain()
	{
		long current_length;
		
		//first number is the term that creates the longest chain
		//second number is the length of the first number's chain
		long[] longestChain = new long[] {0,0};
		
		/*
			Obviously 1 and 2 are not the longest chain so we start at 3.
			Since we are only checking the first 1,000,000 integers
		 	  we needn't start at a large number to get fast results
		*/
		for (long i = 3; i < 1000000; i++)
		{
			current_length = getChainLength(i);
			
			if (current_length > longestChain[1])
			{
				longestChain[0] = i;
				longestChain[1] = current_length;
			}
		}
		
		//return the number that results in the longest chain under 1 million
		return longestChain[0];
	}
	

	/* *********************************************************************
	 * @return 		the length of the Collatz Sequence starting at N
	 * ********************************************************************* */
	public static long getChainLength(long N)
	{
		//The starting length of Collatz sequence is 1
		long length = 1;
		
		while (N != 1)
		{
			N = N % 2 == 0 ? N/2 : 3*N + 1;
			/*
			if (N % 2 == 0)
				N /= 2;
			else
				N = 3*N + 1;
			*/
			length++;
		}
		
		return length;
	}
}
