#include <stdio.h>
#include <stdlib.h>

int findMin(int num[], int n) {
  int i,j,mid;

  i = 0;
  j = n-1;
  while(i<j){
    if(num[i]<num[j]){
        printf("%d\n", num[mid]);
      return num[i];
    }else{
      if(j == i+1){
	return num[j];
      }
      mid = (i+j)/2;
      if(num[i] > num[mid]){
	j = mid;
      }else{
	i = mid;
      }
    }
    printf("%d,%d:%d,%d\n", i, j , num[i], num[j]);
  }

  printf("%d\n", num[mid]);
  return num[mid];
}

int main(int numrgc, char **argv){
  int num[] = {5,6,7,0,1,2};
  printf("%d\n", findMin(num, 6));

  return 0;
}
