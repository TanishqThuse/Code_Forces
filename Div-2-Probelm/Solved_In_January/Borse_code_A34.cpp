#include <iostream>
#include <string>

using namespace std;

int main()
{
    std::string n;
    
    char temp;
    char temp2 = ' ';
    std::string result;

    std::cin >> n;

    for (int i = 0; i < n.length(); i++)
    {
        temp = n[i];

        if (temp == '.' && temp2 == ' ')
        {
            result += '0';
        }
        
        if (temp == '-')
        {   
            if(temp2=='-')
            {
                result += '2';
            }
            else
            {
                temp2 = temp;
                continue;
            }
        }

        if (temp2 == '-')
        {
            if (temp == '.')
            {
                result += '1';
            }
            /*
            else if (temp == '-')
            {
                result += '2';
            }
            */
            temp2 = ' ';
        }
    }

    std::cout << result << std::endl;

    return 0;
}
