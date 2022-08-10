//Write a program in C to accept a number from keyboard and print it in reverse order of entry, by using function.

#include<stdio.h>
void main()
{
    int i,num,rev=0;
    printf("Enter the Number:-");
    scanf("%d",&num);
    while(num!=0)
    {
        rev=rev*10;
        rev=rev+num%10;
        num=num/10;
    }
    printf("Reverse of the given number is =%d",rev);
}