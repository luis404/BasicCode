#include <stdio.h>
#include <stdlib.h>

int *twoSum(int numbers[], int n, int target){
  int i,j;
  int sub;
  int catch = 0;

  for(i=0;i<n;i++){
    sub = target - numbers[i];
    for(j=i+1;j<n;j++){
      if(sub == numbers[j]){
	catch  = 1;
	break;
      }
    }
    if(catch) break;
  }

  printf("%d,%d\n", i, j );
  int result[2];
  result[0] = i+1;
  result[1] = j+1;

  return result;
}

int main(int argc, char **argv){
  int *x;
  int a[4] = {2,7,11,15};
  int target = 9;

  x = twoSum(a, 4, 9);

  printf("%d,%d\n", x[0], x[1]);
}
