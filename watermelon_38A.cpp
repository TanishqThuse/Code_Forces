#include <iostream>

int main()
{
    int w; //input of weight
    std::cin>>w; // to take input of wright
    int flag = 0 ; //to check if the case is true or not

    for(int i=0; i<w  ; i++ ) // nested loop logic/algorithm
    {
        for(int j = 0 ; j<w ; j++)
        {
            if(i%2 == 0 && j%2 == 0 && i+j == w && flag == 0)
            {
                std::cout<<"YES"<<std::endl;
                flag++;
            }
        }
    }

    if(flag == 0)
    {
    std::cout<<"NO"<<std::endl;
    }

    return 0;
}