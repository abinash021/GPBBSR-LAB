//Write a program in C to check whether a given number is palindrome or not?

#include <stdio.h>
#include<math.h>
void main()
{
    int i,n,temp,rev=0;
    printf("Enter a Number= ");
    scanf("%d",&n);
    temp=n;
    while(temp!=0)
    {
        rev=rev*10+temp%10;
        temp=temp/10;
    }
    if(n==rev)
        printf("\n %d is Palindrome",n);
    else
        printf("\n %d is Not Palindrome",n);
}