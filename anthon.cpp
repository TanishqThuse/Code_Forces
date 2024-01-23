#include <iostream>
#include <string>

using namespace std;

int main()
{
    int n;

    // Get the value of n from the user
    std::cin >> n;

    string arr;

    int c1 = 0;
    int c2 = 0;

    // Read the values into the array
    std::cin >> arr;

    // Count occurrences of 'A' and 'D'
    for (int j = 0; j < n; j++)
    {
        if (arr[j] == 'A')
        {
            c1++;
        }
        else if (arr[j] == 'D')
        {
            c2++;
        }
    }

    // Output the result
    if (c1 > c2)
    {
        std::cout << "Anton" << std::endl;
    }
    else if (c1 < c2)
    {
        std::cout << "Danik" << std::endl;
    }
    else
    {
        std::cout << "Friendship" << std::endl;
    }

    return 0;
}
