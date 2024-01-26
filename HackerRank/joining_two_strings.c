#include <stdio.h>
#include <string.h>
int main()
{
    int i;
    char str1[2] = "My";
    char str2[100];
    char arr[100];
    int j;
    printf("Enter the string:\n");
    fflush(stdin);
    fgets(str2, 30, stdin);
    int l1 = strlen(str1);
    int l2 = strlen(str2);
    for (i = 0; i < l1; i++)
    {
        arr[i] = str1[i];
    }
    for (i = l1, j = 0; i <= l1 + l2; i++, j++)
    {
        arr[i] = str2[j];
    }
    for (i = 0; i < l1 + l2; i++)
    {
        printf("%c", arr[i]);
    }
    printf("\n");
    return 0;
}