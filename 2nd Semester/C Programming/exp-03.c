//Write a program in C to determine whether a number is prime or not?

#include <stdio.h>
#include<math.h>
void main()
{
    int i,n;
    printf("Enter a Number= ");
    scanf("%d",&n);
    for (i=2; i<=sqrt(n); i++)
        if(n%i==0)
        break;
    if(i>sqrt(n))
        printf("\n %d is Prime",n);
    else
        printf("\n %d is Composite",n);
}
