#include "stdio.h"

int main() {
  printf("foo\n");
  
  // undefined behavior: you aren't supposed to do this
  int x;
  int y;
  printf("%d\n", x);
  printf("%d\n", y);
  return 0;
}
