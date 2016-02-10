/* ************************************************************************
   * Name: David Johnson
   * Date: 11/15/15
   * Version: 1.0
   * Purpose of program (quoted from projecteuler.net):
   * A Pythagorean triplet is a set of three natural numbers, a < b < c,
   * for which,
   *	a^2 + b^2 = c^2
   *
   *For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
   *There exists exactly one Pythagorean triplet for which
   *    a + b + c = 1000.
   *    
   *    Find the product abc.
   *    
   *    
   * Solution: I didn't need a program for this one. I learned and used a
   *   		   principle for pythagorean triples. To demonstrate, consider
   *   		   this:
   *   
   *     3^2 + 4^2 = 5^2
   *     6^2 + 8^2 = 10^2
   *     9^2 + 12^2 = 15^2
   *     ...
   *     
   *     In order for a + b + c = 1000; there exists x,y,z,n /in Z such that
   *     a/n = x; b/n = y; c/n = z and x^2 + y^2 = z^2.  Hence, we only need
   *     to find the x, y, and z such that n(x + y + z) = 1000.
   *     So I checked pythagorean triples looking for an x,y,z such that
   *     1000 mod (x + y + z) = 0.  Once I found it, finding n such that
   *     n(x + y + z) = 1000. Was easy.  Thus, nx = a, ny = b, nz = c where
   *     a + b + c = 1000 and a^2 + b^2 = c^2.
   *     
   *     In this case, I found a pythagorean triple 8, 15, 17 and 8 + 15 + 17
   *     = 40 and 1000 mod 40 = 0. Since 1000/40 = 25, n = 25.  Hence,
   *     8*25 + 15*25 + 17*25 = 1000 and 200^2 + 375^2 = 425^2.  
   *     
   * *********************************************************************** */

package projecteuler;

public class Euler9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
