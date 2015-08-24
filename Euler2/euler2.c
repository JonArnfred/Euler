#include<stdlib.h>
#include<stdio.h>

int main(void){

	int limit = 4000000;

	int fib1 = 1;
	int fib2 = 2;
	int nextFib = 0;
	double evenFibs = 0;

	while(fib1 < limit && fib2 <limit){
		nextFib = fib1 + fib2;
		if(nextFib % 2 == 0){
			evenFibs += nextFib;
		}
		fib1 = fib2;
		fib2 = nextFib;
	}
	printf("result: %f", evenFibs);

	return 0;

}
