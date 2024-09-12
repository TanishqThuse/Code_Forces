#include <iostream>

int maxDominoes(int M, int N) {
    // Ensure the total number of squares is even
    /*if ((M * N) % 2 != 0) {
        std::cout << "Invalid board size\n";
        return -1;  // Invalid board size
    }*/

    // Calculate the maximum number of dominoes
    int maxDominoes = (M * N) / 2;

    return maxDominoes;
}

int main() {
    int M, N;
    //std::cout << "Enter board size (M N): ";
    std::cin >> M >> N;

    int result = maxDominoes(M, N);

    if (true /*result != -1*/) {
        std::cout /*<< "Maximum number of dominoes: ">*/ << result << std::endl;
    }

    return 0;
}