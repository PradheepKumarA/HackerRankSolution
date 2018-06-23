#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
	long int n , q , i;
	scanf("%ld%ld",&n,&q);
	long int *seqList[n];
	long int *point = (long int *)malloc(n * sizeof(long int));
	for(i = 0 ; i<n ; i++){
		point[i]=0;
		seqList[i] = (long int *)malloc(0);
	}
	long int lastAnswer = 0;
	for(i=0 ; i<q ; i++){
		long int x,y,type;
		scanf("%ld%ld%ld",&type,&x,&y);
		long int seq = (x^lastAnswer)%n;
		if(type ==1){
			seqList[seq]=(long int *)realloc(seqList[seq],(point[seq]+1) * sizeof(long int));
			seqList[seq][point[seq]++]=y;
		}else{
			long int temp = y%point[seq];
			long int result =seqList[seq][temp];
			lastAnswer=result;
			printf("%ld\n",lastAnswer);
		}
	}
    return 0;
}