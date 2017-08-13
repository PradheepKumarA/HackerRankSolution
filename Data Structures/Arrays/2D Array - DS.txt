#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int arr[6][6];
    for(int arr_i = 0; arr_i < 6; arr_i++){
       for(int arr_j = 0; arr_j < 6; arr_j++){
          scanf("%d",&arr[arr_i][arr_j]);
       }
    }
    int max = -32768;
    for(int arr_i = 0; arr_i < 4; arr_i++){
       for(int arr_j = 0; arr_j < 4; arr_j++){
          int total = arr[arr_i][arr_j];
          total += arr[arr_i][arr_j+1];
          total += arr[arr_i][arr_j+2];
          total += arr[arr_i+1][arr_j+1];
          total += arr[arr_i+2][arr_j];
          total += arr[arr_i+2][arr_j+1];
          total += arr[arr_i+2][arr_j+2];
          max = max<total? total:max;
       }
    }
    printf("%d",max);
    return 0;
}
