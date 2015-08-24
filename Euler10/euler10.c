/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/
/* Med standard optimeret for loop: 
real 0m0.654s
user 0m0.618s
sys 0m0.006s

med sieve of eratosthere:
real 0m0.154s
user 0m0.126s
sys 0m0.013s
*/
#include<stdlib.h>
#include<stdio.h>

int main(int argc, char *argv[]){
	int limit = 2000000;
	long result = 0;//2 is a prime

	int primes[limit];

	for(int i = 0; i < limit; i++){
		primes[i] = 1;//they are all primes from scratch
	}
	primes[0] = 0;
	primes[1] = 0;

	for(int i = 2; i*i <= limit; i++){
		if(primes[i]==1){
			for(int j = 2; i*j <= limit; j++){
				primes[j*i] = 0;//striking off all non-primes
			}
		}
	}

	for(int i = 0; i < limit; i++){
		if(primes[i]==1){
			result += i;
		}
	}
		printf("result: %lu", result);
	return 0;
	
}


