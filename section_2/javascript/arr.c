#include "stdio.h"

void access(int* arr, int index) {
  printf("%d\n", arr[index]);
}

int main() {
  int arr[3] = { 6, 2, 4 };
  printf("before\n");
  access(arr, 20);
  printf("after\n");
  return 0;
}
