/*
 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 21000
 */
package euler16;

import java.math.BigInteger;

public class PowerDigitSum {
	
	private static BigInteger base = new BigInteger("2");
	private static int power = 1000;
	
	public static void main(String [] args){
		
		long startTime = System.nanoTime();
		
		BigInteger result = base.pow(power);
		String resultArray = result.toString();
		
		int resultInt = 0;
		for(int i = 0; i<resultArray.length();i++){
			resultInt+=Character.getNumericValue(resultArray.charAt(i));
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime; System.out.println("Metoden tog "+(double)duration / 1000000000.0+" sekunder ");

		System.out.println(resultInt);
		
	}

}
