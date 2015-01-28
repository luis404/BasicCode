#include <stdio.h>

unsigned get_zero(){

  return ~0;

}

int main(int argc, char **argv){
  printf("%u\n", get_zero());

  return 0;
}
