#include <stdio.h>

int linearSearch(int arr[], int key, int n) {
    int i = 0;
    for (i = 0; i < n; i++)
        if (arr[i] == key)
            break;
    return (i == n) ? -1 : i;
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
    isFound = linearSearch(arr, key, size);
    (isFound >= 0) ? printf("Found at index : %d!!", isFound) : printf("Not Found!!");
    return 0;
}