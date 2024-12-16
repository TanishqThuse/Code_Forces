//My aporach but throught thorugh proper code
import java.util.Scanner;

public class DreamoonAndStairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading input
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // Calculate minimum moves
        int minMoves = (n + 1) / 2;
        
        // Find the first multiple of m greater than or equal to minMoves
        int result = -1;
        for (int moves = minMoves; moves <= n; moves++) {
            if (moves % m == 0) {
                result = moves;
                break;
            }
        }
        
        // Output the result
        System.out.println(result);
        
        scanner.close();
    }
}



// import java.util.*;

// public class Doeamon{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int t = sc.nextInt();

//         while(t-->0){
//             int n = sc.nextInt();
//             int m = sc.nextInt();

//             int c = 0;

//             if(n%2==0){
//                 c = n/2;
//             }
//             else{
//                 c = n/2 + 1;
//             }

//             int ans = 0;

//             while(c>m){
//                 c--;
//                 if(c%m == 0){
//                     ans = c;
//                 }
//             }
//             while(c<m){
//                 c++;

//             }

//         }
//     }
// }