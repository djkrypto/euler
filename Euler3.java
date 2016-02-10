/* ************************************************************************
   * Name: David Johnson
   * Date: 11/15/15
   * Version: 1.0
   * Purpose of program (quoted from projecteuler.net):
   * The prime factors of 13195 are 5, 7, 13 and 29.
   * What is the largest prime factor of the number 600851475143?
   * 
   * Credit for the resulting program is:
   *     http://introcs.cs.princeton.edu/java/13flow/Factors.java.html
   * *********************************************************************** */

package projecteuler;

public class Euler3 {

	public static void main(String[] args) {

        // command-line argument version
        // long n = Long.parseLong(args[0]);

		double N = 600851475143.0;
		
        System.out.print("The prime factorization of " + N + " is: ");

        double i;
        // for each potential factor i
        for (i = 2; i*i <= N; i++) {

            // if i is a factor of N, repeatedly divide it out
            while (N % i == 0)
            {
            	String string = String.format("%.0f ", i);
            	System.out.print(string);
                N = N / i;
            }
        }

        // if biggest factor occurs only once, n > 1
        if (N > 1) System.out.println(N);
        else       System.out.println();	
		
	}

}
