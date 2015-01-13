#include <stdio.h>
#include <stdlib.h>

void testMem(char *str){
  printf("addr of &str is %x\n", &str);
  printf("addr of str is %x\n", str);
  printf("addr of *str is %x\n", &(*str));
}

int main(int argc, char **argv){
  char arr[] = "I am a code";

  printf("addr of &arr is %x\n", &arr);
  printf("addr of arr is %x\n", arr);
  printf("add of arr[0] is %x\n", &arr[0]);

  testMem(arr);
}
