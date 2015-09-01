package euler14;

/*The following iterative sequence is defined for the set of positive integers:
 n  n/2 (n is even)
 n  3n + 1 (n is odd)

 Using the rule above and starting with 13, we generate the following sequence:
 13  40  20  10  5  16  8  4  2  1
 It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 Which starting number, under one million, produces the longest chain?
 NOTE: Once the chain starts the terms are allowed to go above one million.
 */

import java.util.*;

public abstract class Euler14 {

	private static int largest;
	private static int rounds;
	private static Set<Double> stableChain = new HashSet <Double>();

	public static void main(String[] args) {
		
			collatzSequence(1000000);
	}

	private static void collatzSequence(int b) {
		
		// runs through any number up to the parameter b
		for (double i = 1; i < b; i++) {

			if(stableChain.contains((Double) i)){
				continue;
			}
			else{
				
				//add the number i as the first element of the sequence
				int sequence = 1;
				
				// assign the number to another variable to keep numerical changes distinct
				// from i
				double a = i;
	
				// runs as long as a is different from 1
				while (a != 1){
					
					// if a is even, then do
					if (a % 2 == 0) {
						a = a / 2;
						
						// then add one to the sequence
						sequence++;
						
						//no need to add a to the hashSet if i never gets that high
						if(a<b){
							stableChain.add(a);
						}
						
						
					}
					// if a is odd then
					else{
						
						a = 3 * a + 1;
						
						// then add one to the sequence
						sequence++;
						
						//no need to add a to the hashSet if i never gets that high
						if(a<b){
							stableChain.add(a);
						}
					}
				}
				
				rounds++;
				if (sequence > largest) {
					largest = sequence;
					System.out.println("This is maybe the number: " + i);
					System.out.println("Now the largest sequence is "
							+ largest);
				}
			}
		}
		System.out.println("for the input "+b+", "+rounds+" rounds have been completed");
	}
		


}
