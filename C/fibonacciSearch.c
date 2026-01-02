#include <stdio.h>

int fibonacciSearch(int arr[], int n, int key) {
    int fib2 = 0;
    int fib1 = 1;
    int fib  = fib1 + fib2;
    while (fib < n) {
        fib2 = fib1;
        fib1 = fib;
        fib  = fib1 + fib2;
    }
    int offset = -1;
    while (fib > 1) {
        int i = (offset + fib2 < n) ? offset + fib2 : n - 1;

        if (arr[i] < key) {
            fib    = fib1;
            fib1   = fib2;
            fib2   = fib - fib1;
            offset = i;
        } else if (arr[i] > key) {
            fib  = fib2;
            fib1 = fib1 - fib2;
            fib2 = fib - fib1;
        } else {
            return i;
        }
    }
    if (fib1 && offset + 1 < n && arr[offset + 1] == key)
        return offset + 1;
    return -1;
}

int main() {
    int arr[] = { 1, 3, 5, 7, 9, 11, 13 };
    int n     = sizeof(arr) / sizeof(arr[0]);
    int key   = 7;
    int index = fibonacciSearch(arr, n, key);

    if (index >= 0)
        printf("Found at index: %d\n", index);
    else
        printf("Not Found\n");

    return 0;
}