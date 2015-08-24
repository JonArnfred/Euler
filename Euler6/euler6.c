#include<stdlib.h>
#include<stdio.h>

/*
The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 −
385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

int main(int argc, char *argv[]){

	int limit = 0;
	int result1 = 0;
	int result2 = 0;

	if(sscanf(argv[1],"%i", &limit)!=1){
		printf("error");
	}
		 
	for(int i = 0; i <= limit; i++){
		result1 += (i*i);
	}

	for(int a = 0; a <= limit; a++){
		result2+=a;
	}
	result2 *= result2;
	printf("result: %d",result2-result1);

	return 0;
}
