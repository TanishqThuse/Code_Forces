#include <iostream>
using namespace std;

int main()
{
    int n,m;
    int temp;
    std::cin>>n;
    std::cin>>m;
    int i = 1;

    int chips_received = 0;

    while(true)
    {
        if(m-i < 0)
        {
            chips_received = chips_received + m;
            break;
        }
        else
        {
            chips_received = chips_received + i;
            m = m-i;
        }

        i = (i%n) + 1;
    }
    std::cout<<m<<endl;

        /*temp = n;
        for(int i = 1; true ; i++)
        {
            temp = temp-1;
            
            if(temp==0 && ((m-i) < 0))
            {
                temp = n;
                i = 1;
            }
            if(m-i < 0)
            {
                std::cout<<m<<std::endl;
                break;
            }
            m=m-i;
        }*/    
       return 0;
}