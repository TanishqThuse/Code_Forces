#include <iostream>
using namespace std;

int main()
{
    int temp;
    int input;

    std::cin>>input;

    for(int n=0; n<=500;n++)
    {
        temp = (n*(n+1))/2;

        if(temp==input)
        {
            std::cout<<"YES"<<std::endl;
            break;
        }      
    }

    if(temp!=input)
    {
        std::cout<<"NO"<<std::endl;
    }
    return 0;
}
