#include "stdio.h"

void issue(int* arr, int index) {
  printf("%d\n", arr[index]);
}

int main() {
  int arr[3] = {3, 2, 6};
  issue(arr, 500000);
  return 0;
}
