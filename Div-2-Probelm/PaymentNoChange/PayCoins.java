import java.util.*;

public class PayCoins {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        
        while(t-- > 0) {
            int a = sc.nextInt(); // Number of coins of value n
            int b = sc.nextInt(); // Number of coins of value 1
            int n = sc.nextInt(); // Value of coin n
            int S = sc.nextInt(); // Total value required
            
            // Calculate the maximum value that can be paid using n-value coins
            int maxNValue = Math.min(S / n, a) * n;
            
            // Remaining amount to be paid using 1-value coins
            int remainingAmount = S - maxNValue;
            
            // Check if the remaining amount can be paid using the available 1-value coins
            if (remainingAmount <= b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}



//My first appaorch was to ise up app a based coins then use b for remaing coins
// import java.util.*;

// public class payConins{
//     public static void main(String agrs[]){
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while(t-->0){
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             int n = sc.nextInt();
//             int S = sc.nextInt();

//             //a coins of value n
//             //b coins of value 1

//             //30

//             int valOfA = a*n;

//             int remPayByB = S - (valOfA);
//             //27-30 = -3

//             //remB = -3

//             if(remPayByB >= 0){
//                 if(remPayByB - b <=0){
//                     //YESs
//                     System.out.println("YES");
//                 }
//                 else{
//                     //No
//                     System.out.println("NO");
//                 }
//             } //-3
//             else{
//                 while(!(remPayByB >= 0)){
//                     valOfA -= n;
//                     //valA = 60-6
//                     remPayByB = S - (valOfA);
//                 }
//                 //25
//                 //remB = 
//                 if(remPayByB - b <=0){
//                     //YESs
//                     System.out.println("YES");
//                 }
//                 //25
//                 else{
//                     //No
//                     System.out.println("NO");
//                 }
//             }
//         }
//     }
// }