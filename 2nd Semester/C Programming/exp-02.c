//Write a Program in C to find the average of n numbers by using for loop

#include<stdio.h>
int main()
{
    int i,n,sum=0;
    printf("Enter the number of elements: ");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        printf("Enter the %d element: ",i);
        scanf("%d",&sum);
    }
    printf("The average is: %d",sum/n);
    return 0;
}