#include <iostream>
#include <string>
#include <cctype>
using namespace std;

int main()
{
    std::string str1;
    std::string str2;

    //std::cout<<"Enter the username"<<std::endl;
    std::cin>>str1;
    std::cin>>str2;

    int n1 = str1.length();
    //int n2 = str2.lenght();


    for (char &c : str1) {
        c = std::tolower(c);
    }

    for (char &c : str2) {
        c = std::tolower(c);
    }

    if(str1<str2)
    {
        std::cout<<"-1"<<std::endl;
    }
    else if(str1>str2)
    {
        std::cout<<"1"<<std::endl;
    }
    else if(str1==str2)
    {
        std::cout<<"0"<<std::endl;
    }    
    //std::cout<<str1;
    return 0;
}