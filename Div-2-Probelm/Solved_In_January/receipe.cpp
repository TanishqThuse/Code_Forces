#include <iostream>
using namespace std;


// int sum(int a)
// {
//     return (a + 2a + 4a) ;
// }

int main()
{
    int a,b,c;

    std::cin>>a;
    std::cin>>b;
    std::cin>>c;

    // int sum;
    int no_of_ingredients;

    //sum = a + b + c
    //our reference is a

    while(a!=0)
    {
        if(2*a <= b && 4*a <=c)
        {
            no_of_ingredients = a + 2*a + 4*a ;
            std::cout<<no_of_ingredients<<std::endl;
            break; 
        }
        else
        {
            a--;
            if(a==0)
            {
                std::cout<<"0"<<std::endl;
            }
        }
    }
    return 0;
}