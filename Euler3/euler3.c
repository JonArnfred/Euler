
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
    long number =;
    for(long i = 1; (i*i) <number; i+=2){
        if(number%i==0){
            number /= i;
        }
    }
    printf("largest prime: %lu\n",number);
    return 0;
}






