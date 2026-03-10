// FOR NEXT TIME: weak vs. strong, handout
// Must hold: array accesses in bounds
#include "stdio.h"

void access(int* arr, int index) {
  printf("%d\n", arr[index]);
}

int main() {
  int arr[3] = { 6, 2, 4 };
  printf("before\n");
  access(arr, 2000);
  printf("after\n");
  return 0;
}
