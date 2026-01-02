#include <stdio.h>

int binarySearch(int arr[], int key, int n) {
    int high = n - 1, low = 0, mid;
    while (low <= high) {
        mid = (high + low) / 2;
        if (arr[mid] == key)
            return mid;
        else if (arr[mid] < key)
            low = mid + 1;
        else
            high = mid - 1;
    }
    return -1;
}

int main() {
    int arr[20], key, size, isFound;
    printf("Enter the size of array (<20) : ");
    scanf("%d", &size);
    printf("Enter the Elements: ");
    for (int i = 0; i < size; i++)
        scanf("%d", &arr[i]);
    printf("Now tell me what Element should i Search : ");
    scanf("%d", &key);
    isFound = binarySearch(arr, key, size);
    (isFound >= 0) ? printf("Found at index : %d!!", isFound) : printf("Not Found!!");
    return 0;
}