//Write a program in C to find the vowels in a given string.

#include <stdio.h>
int main()
{
    char str[100];
    printf("Enter the string: ");
    scanf("%s", str);
    int i, count = 0;
    for (i = 0; str[i] != '\0'; i++)
    {
        if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u')
        {
            count++;
        }
    }
    printf("The number of vowels in the string is: %d", count);
    return 0;
}