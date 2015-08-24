
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
*/


/* SOME RESEARCH
In number theory, the prime factors of a positive integer are the prime numbers that divide that integer exactly

the fundamental theorem of arithmetic: every positive integer has a single unique prime factorization

*/

int main(void){
	long number = 600851475143;
	long largest = 0;

	for(long i = 1; (i*i) <number; i+=2){
		if(number%i==0){

			//now we know that number is potentially a prime
			//lets check if it really is one
			for(long a = 3; (a*a) < i;a++){
				//if any one integer less than i which is not 1 can divide
				//without a remainder, then we know that i is not a prime
				if(i%a==0){
					break;
				}
			}
			if(i>largest){
				printf("a prime: %lu\n", i);
				largest = i;
			}
		}
	}

	printf("largest prime: %lu\n", largest);
	return 0;
}





