#include<stdlib.h>
#include<stdio.h>

int main(int argc, char *argv[]){

	long result = 0;
	int limit = 0;
	if(sscanf(argv[1], "%i", &limit)!=1){
		printf("error");
	}

	for(int c = 334; c < 499; c++){
		for(int a = 167; a < c; a++){
			for(int b = 167; b < c; b++){
				if((a + b + c) == limit  && (a*a)+(b*b)==(c*c)){
					result = a * b * c;
					break;
				}
			}
		}
	}
	printf("result: %lu", result);
return 0;

}
