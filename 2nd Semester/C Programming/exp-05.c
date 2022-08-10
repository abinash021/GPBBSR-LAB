//Write a program in C to compute the sine series.

#include <stdio.h>
void main()
{
    int n,fact=1,i,sign=-1;
    float sum,x;
    printf("Enter the value of n= ");
    scanf("%d",&n);
    printf("Angle in degrees= ");
    scanf("%f",&x);
    x=x*3.14/180;
    sum=x;
    printf("Angle in radian= %f",x);
    for(i=3;i<=n;i+=2)
    {
        fact=fact*i*(i-1);
        sum=sum*sign*pow(x,i)/fact;
        sign=sign*-1;
    }
    printf("\nThe sum of the series is %f",sum);
}