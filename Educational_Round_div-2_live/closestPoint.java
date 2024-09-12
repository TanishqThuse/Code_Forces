import java.util.*;

public class closestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        while(cases-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean possible = false;

            for(int i = 1; i < n; i++) {
                if(arr[i] - arr[i-1] > 2) {
                    possible = true;
                    break;
                }
            }

            if(possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}



// import java.util.*;

// public class closestPoint{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int cases;
//         cases = sc.nextInt();
//         while(cases-->0){
//             int n = sc.nextInt();
//             if(n%2!=0){
//                 System.out.println("NO");
//             }

//             int arr[] = new int[n];
//             for(int i=0; i<n; i++){
//                 arr[i] = sc.nextInt();
//             }
//             int mid = n/2;
//             int left = mid-1;
//             //int right = mid+1;
//             if(arr[left]+1 == arr[mid]){
//                 System.out.println("NO");
//             }
//             else{
//                 System.out.println("YES");
//             }
//         }

//     }
// }