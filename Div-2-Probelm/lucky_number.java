
import java.util.*;

class lucky_number {

    public static int diffOfDigits(int n) {
        int max = 0;
        int min = 9;
        while (n > 0) {
            int digit = n % 10;
            max = Math.max(digit, max);
            min = Math.min(min, digit);
            n = n / 10; // Update the value of n
        }
        return max - min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases;
        cases = sc.nextInt();
        while (cases-- > 0) {
            int l, r;
            l = sc.nextInt();
            r = sc.nextInt();
            int min = diffOfDigits(l);
            int minIndex = l; // Start with the first value in the range
            for (int i = l; i <= r; i++) {
                int currentDiff = diffOfDigits(i);
                if (currentDiff < min) {
                    min = currentDiff;
                    minIndex = i; // Update the index when a new minimum is found
                }
            }
            System.out.println(minIndex);
        }
    }
}



// import java.util.*;

// class lucky_number{

//     public static int diffOfDigits(int n){
//         int max = 0;
//         int min = 9;
//         while(n>0){
//             int digit = n%10;
//             max = Math.max(digit, max);
//             min = Math.min(min, digit);
//             n/=10;
//         }

//         return max-min;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int cases;
//         cases = sc.nextInt();
//         while(cases-->0){
//             int l,r;
//             l = sc.nextInt();
//             r = sc.nextInt();
//             int min = diffOfDigits(l);
//             int ans=0;;
//             for(int i=l; i<=r; i++){
//                 if(min > diffOfDigits(i)){
//                     ans = i;
//                     min = diffOfDigits(i);
//                 }
//             }
//             System.out.println(ans);
//         }
//     }
// }