/* ************************************************************************
   * Name: David Johnson
   * Date: 11/15/15
   * Version: 1.0
   * Purpose of program (quoted from projecteuler.net):
   * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
   *   we can see that the 6th prime is 13.
   *   
   * What is the 10,001st prime number?
   * 
   * The program below is the attempt at Sieve of Eratosthenes method
   * 
   * For sake of time, I googled the 10,000th prime number just to have
   * a preset array size of appropriate size.
   * 
   * For assistance, the list of prime numbers is printed where 1 is in the
   *   0th row so that the list correctly labels the 1st prime as 2. 
   *   Thus, if you want the 323rd prime number, you go to 323 in the list.
   * *********************************************************************** */

package projecteuler;

import java.util.Arrays;

public class Euler7 {

	public static void main(String[] args) {
		//The largest number validated for prime characteristic
		//This number must be vetted, Otherwise your list of primes may not
		//contain all the way to the Mth prime
		int N = 110000;
		
		//The number of primes you want to list
		int M = 10010;
		boolean[] prime_candidates = new boolean[N];
		int[] primes = new int[M];
		Arrays.fill(prime_candidates, Boolean.TRUE);
		int upper_bound = (int) Math.ceil((Math.sqrt(N)));
		
		for (int i = 2; i < upper_bound; i++){
			//remove all candidates that are multiples of a prior prime
			if (prime_candidates[i]){
				for (int j = i*i; j < N; j += i){
					prime_candidates[j] = false;
				}
			}
		}
		
		int z = 0;
		for (int k = 1; k < N; k++){
			if (prime_candidates[k]){
				// avoid out of bounds exceptions
				if (z < M){
					primes[z] = k;
					z++;
				}
				else
					break;
			}
		}
		
		//Print up to M primes
		//Ignore primes[0] = 1
		for (int b = 1; b < M; b++){
			System.out.println(b + ": " + primes[b]);
		}
		
		System.out.println("The 10,001st prime number is: " + primes[10001]);
	}

}
