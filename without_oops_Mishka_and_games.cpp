#include <iostream>
using namespace std;

int main() {
    int rounds;
    cin >> rounds;

    int mishka = 0;
    int chris = 0;

    for (int i = 0; i < rounds; i++) {
        int mi, ci;
        cin >> mi >> ci;

        if (mi > ci) {
            mishka++;
        } else if (mi < ci) {
            chris++;
        }
    }

    if (mishka > chris) {
        cout << "Mishka" << endl;
    } else if (mishka < chris) {
        cout << "Chris" << endl;
    } else {
        cout << "Friendship is magic!^^" << endl;
    }

    return 0;
}

