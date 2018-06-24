#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

void leftRotation(int n, int* a, int d) {
    // Complete this function
    int temp = a[(n+d)%n];
    printf("%d ", temp);
    for(int j=1 ; j<n ; j++ ){
		printf("%d ", a[(n+j+d)%n]);
	}
    return a;
}

int main() {
    int n; 
    int d; 
    scanf("%i %i", &n, &d);
    int *a = malloc(sizeof(int) * n);
    for (int a_i = 0; a_i < n; a_i++) {
       scanf("%i",&a[a_i]);
    }
    leftRotation(n, a, d);
    return 0;
}
