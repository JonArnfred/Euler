/*The following iterative sequence is defined for the set of positive integers:
 n  n/2 (n is even)
 n  3n + 1 (n is odd)

 Using the rule above and starting with 13, we generate the following sequence:
 13  40  20  10  5  16  8  4  2  1
 It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 Which starting number, under one million, produces the longest chain?
 NOTE: Once the chain starts the terms are allowed to go above one million.
 */

#include<stdlib.h>
#include<stdio.h>

int main(int argc, char *argv[]){
    long range = 0;
    long largest = 0;
    long limit = 1000000;
    long number = 0;
    long a;
    // long numbers[10000000];

//læg alle tal i en række.

    printf("yes %ld", range);
    //hvis den rammer et tal, så er resten af rækken identisk
    for(long i =0; i < limit; i++){

        number= i;
        a = i;
        while(a!=1){
            if(a%2==0){
                a = a/2;
                range++;
            } else{
                a = (3*a)+1;
            }
            if(range > largest){
                largest = number;
            }
       }
    }
    printf("%ld",number); 
}




