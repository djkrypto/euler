/* ************************************************************************
   * Name: David Johnson
   * Date: 11/20/15
   * Version: 1.0
   * Purpose of program (quoted from projecteuler.net):
   * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
   * 
   * Find the sum of all the primes below two million.
   * *********************************************************************** */

package projecteuler;

import java.util.Arrays;

public class Euler10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//The largest number validated for prime characteristic
		//  If the nth prime number is greater than N, this
		//  number will not be in the list
		int N = 2000000;
		
		//The number of primes you want to list minus 1
		int M = 148934;
		boolean[] prime_candidates = new boolean[N];
		int[] primes = new int[M];
		Arrays.fill(prime_candidates, Boolean.TRUE);
		int upper_bound = (int)Math.ceil((Math.sqrt(N)));
		
		long sum_of_primes = 0;
		
		for (int i = 2; i < upper_bound; i++)
		{
			//remove all candidates that are multiples of a prior prime
			if (prime_candidates[i])
			{
				for (int j = i*i; j < N; j += i)
				{
					prime_candidates[j] = false;
				}
			}
		}
		
		int z = 0;
		for (int k = 1; k < N; k++)
		{
			if (prime_candidates[k])
			{
				// avoid out of bounds exceptions
				if (z < M)
				{
					primes[z] = k;
					z++;
				}
				else
					break;
			}
		}
		
		//Add up the primes from 2 til the largest prime less than P
		int P = 2000000;
		int b = 1;
		int primes_length = primes.length;
		while (b < primes_length && primes[b] < P)
		{	
			sum_of_primes += primes[b];
			//System.out.println("The Sum: " + sum_of_primes);
			b++;
		}
		
		System.out.println("The sum of the all of the primes up to 2,000,000 " +
						   "is: " + sum_of_primes);
	}

}
