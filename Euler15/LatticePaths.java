package euler15;

import java.math.BigInteger;
import java.util.ArrayList;

/*
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner.
 * 
 * How many such routes are there through a 20×20 grid?
 */
public class LatticePaths {
	
	
	
	public static void main(String[] args) {
		
System.out.println(
		factorial(BigInteger.valueOf(40))
		.divide( ( factorial ( BigInteger.valueOf(20) ) ). multiply(factorial( BigInteger.valueOf( 20 )))));

	}
	
	//finding the amount of moves in a route through n fields in a lattice square
	public static int moves(int fields){
		int p = (int)Math.sqrt(fields)*2;
		
		System.out.println(p);
		
		return p;
		}
	
	public static BigInteger factorial( BigInteger number )
	{
	if ( number.compareTo( BigInteger.ONE ) <= 0 ) // test base case
		return BigInteger.ONE; // base cases: 0! = 1 and 1! = 1
	else // recursion step
		return number.multiply(factorial( number.subtract( BigInteger.ONE ) ) );
	}
	
	
	//returns the number of intersections in a square latice with i as the number of fields
	public static double numberOfPoints(double fields){
		
		double result = (Math.sqrt(fields)+1)*((Math.sqrt(fields)+1));
		System.out.println(result);
		return result;
	}

	
	
	
	

}
