#include<iostream>
#include<algorithm> 
using namespace std;

int main(){
    int  n, k, l, c, d, p, nl, np;
    cin>>n>>k>>l>>c>>d>>p>>nl>>np;

    //1 toast = MIn(   nl, 1 lime, np salt)

    int maxToastByDrink = l * k / nl;

    int maxToastByLime = c * d / 1; //since each lime is again cut in d pieces

    int maxToastBySalt = p / np;


    // int ans = min(nl , min(p , np)) / n;
    int ans = min(maxToastByDrink, min(maxToastByLime, maxToastBySalt)) ;
    cout<<ans / n; //since we didivide it among n friends

}