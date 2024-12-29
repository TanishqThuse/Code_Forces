import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        StringBuilder s = new StringBuilder(sc.next());
        int cnt = 0;
        int currLeng = 0;
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'O') {
                currLeng++;
                if (currLeng == k) {
                    cnt++;
                    for (int j = i - k + 1; j <= i; j++) {
                        s.setCharAt(j, 'X');
                    }
                    currLeng = 0;
                }
            } else {
                currLeng = 0;
            }
        }
        
        System.out.println(cnt);
    }
}


//for some reason doesnt work
// import java.util.*;

// public class Main
// {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int x = sc.nextInt();
//         String s = sc.next();
//         //basically find no. of sequences of x
//         int cnt = 0;
//         int currLeng = 0;
//         for(int i=0; i<n; i++){
//             if(currLeng == x){
//                 cnt++;
//                 currLeng = 0;
//             }
//             if(s.charAt(i) == 'O'){
//                 currLeng++;
//             }
//             else{
//                 currLeng = 0;
//             }
//         }
//         // return cnt;
//         System.out.println(cnt);
//     }
// }
