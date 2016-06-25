#include<stdlib.h>
#include<stdio.h>

int isPrime(int);
//int limit;
int numberOfPrimes = 1;//2 is prime
int prime = 1;//true per default


int main(int argc, char *argv[]){
   //    if(sscanf(argv[1],"%i", &limit)!=1){
   //     printf("error");
   // }

    //løber igennem alle tal, der potentielt er primtal
    for(long i = 3; i > 0; i +=2){
        prime = 1;
        for(long a = 3; a * a <= i; a +=2){
            if(i%a==0){//if i can be divided equally by a, then i is not prime
                prime = 0;
                break;
            }
        }//if i is prime
        if(prime != 0){
            numberOfPrimes++;
            //	printf("is this prime?: %d\n", latestPrime);
            if(numberOfPrimes == 10001){
                printf("%dth number of prime: %lu", numberOfPrimes, i);
                break;
            }
        }
    }
    return 0;
}

