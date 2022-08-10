//Write a program in C to accept row wise and column wise element in a two dimensional array and print them.

#include <stdio.h>
int main()
{
    int row, col, i, j;
    printf("Enter the number of rows and columns: ");
    scanf("%d %d", &row, &col);
    int arr[row][col];
    printf("Enter the elements of the array: \n");
    for (i = 0; i < row; i++)
    {
        for (j = 0; j < col; j++)
        {
            scanf("%d", &arr[i][j]);
        }
    }
    printf("The elements of the array are: \n");
    for (i = 0; i < row; i++)
    {
        for (j = 0; j < col; j++)
        {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }
    return 0;
}