//Write a Program in C to find the greatest number among three numbers.
#include<stdio.h>
int main()
{
    int a,b,c,max;
    printf("Enter the first number: ");
    scanf("%d",&a);
    printf("Enter the second number: ");
    scanf("%d",&b);
    printf("Enter the third number: ");
    scanf("%d",&c);
    if(a>b)
    {
        max=a;
    }
    else
    {
        max=b;
    }
    if(c>max)
    {
        max=c;
    }
    printf("The greatest number is: %d",max);
    return 0;
}