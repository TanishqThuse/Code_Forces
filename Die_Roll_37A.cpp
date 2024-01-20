#include <iostream>
using namespace std;

int main()
{
    int a,b,n;

    std::cin>>a;
    std::cin>>b;

    int numerator;
    int denominator = 6;
    int c=0;

    for(int i=1; i<=6; i++)
    {
        if(i>=a && i>=b)
        {
            c++;
        }
    }

    numerator = c ;

    //Now we need to find gcd of Numerator and denominator
    for(int j=1 ; j<6 ; j++)
    {
        if(numerator%j == 0 && denominator%j == 0)
        {
            numerator = numerator/j;
            denominator =denominator/j;
        }
    }

    std::cout<<numerator<<"/"<<denominator<<std::endl;

    return 0;
}