#include<stdio.h>
#include<stdlib.h>

int main(void){

	int result = 0;
	for(int i = 0; i < 1000; i++){
		if(i % 3==0){
			result+=i;
		} else if(i % 5==0){
			result+=i;
		}
	}
	printf("result: %d", result);
	return 0;
}
