#include "stdio.h"

void issue(int* arr, int index) {
  printf("%d\n", arr[index]);
}

// FOR NEXT TIME: undefined behavior recap,
//                "undefined" in JS vs. undefined behavior (
//                accessing arrays in JS)
int main() {
  int arr[3] = {3, 2, 6};
  issue(arr, 500000);
  return 0;
}
