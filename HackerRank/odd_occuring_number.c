#include <stdio.h>

int findOddOccurringNumber(int arr[], int size) {
    int result = 0;
    for (int i = 0; i < size; i++) {
        result ^= arr[i];
    }
    return result;
}

int main() {
    int arr[] = {4, 2, 2, 1, 5, 6, 7, 5, 6, 7, 4};
    int size = sizeof(arr) / sizeof(arr[0]);

    int oddOccurringNumber = findOddOccurringNumber(arr, size);

    printf("The odd occurring number is: %d\n", oddOccurringNumber);
    

    return 0;
}
