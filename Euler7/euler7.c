#include<stdlib.h>
#include<stdio.h>

int main(int argc, char *argv[]){
    int limit;
    int numberOfPrimes = 1;//2 is prime
    int prime = 1;//true per default
    int latestPrime = 0; //just the latest found prime

    if(sscanf(argv[1],"%i", &limit)!=1){
        printf("error");
    }


    //løber igennem alle tal, der potentielt er primtal
    for(long i = 3; i > 0; i +=2){
        prime = 1;
        for(long a = 3; a * a <= i; a +=2){
            if(i%a==0){//if i can be divided equally by a, then i is not prime
                prime = 0;
                break;
            }
        }
        if(prime == 0){//if i is not prime, we continue
            continue;
        } else{//if i is prime
            latestPrime = i;
            numberOfPrimes++;
            //	printf("is this prime?: %d\n", latestPrime);
            if(numberOfPrimes == limit){
                printf("%dth number of prime: %d", numberOfPrimes, latestPrime);
                break;
            }
        }
    }
    return 0;
}
