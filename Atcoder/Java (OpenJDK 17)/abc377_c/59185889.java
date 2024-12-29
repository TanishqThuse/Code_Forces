//Solution - 3 : 
/**Insteadf of using a booleran of nxn size it gets heavy and memoty ineffienct
 * //so i create a hashmap to store the unsafe positions
 * worked
 */

import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        HashSet<String> unsafePositions = new HashSet<>();

        for(int i = 0; i < m; i++) {
            long x = sc.nextLong() - 1;
            long y = sc.nextLong() - 1;

            markUnsafePositions(x, y, n, unsafePositions);
        }

        long totalCells = n * n;
        long safeCells = totalCells - unsafePositions.size();
        System.out.println(safeCells);
    }

    public static void markUnsafePositions(long x, long y, long n, HashSet<String> unsafePositions) {
        int[][] knightMoves = {
            {2, 1}, {1, 2}, {-1, 2}, {-2, 1},
            {-2, -1}, {-1, -2}, {1, -2}, {2, -1}
        };

        unsafePositions.add(x + "," + y);

        for (int[] move : knightMoves) {
            long newX = x + move[0];
            long newY = y + move[1];
            if (newX >= 0 && newX < n && newY >= 0 && newY < n) {
                unsafePositions.add(newX + "," + newY);
            }
        }
    }
}


//Error - 2
//even chaning to long doesnt work

//this is because stroring a nxn boolean is not efficeint
// import java.util.*;

// public class Main {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         long n = sc.nextLong();
//         long m = sc.nextLong();

//         boolean[][] flag = new boolean[(int)n][(int)n];

//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 flag[i][j] = true;
//             }
//         }

//         for(int i=0; i<m; i++){
//             int x = sc.nextInt();
//             int y = sc.nextInt();

//             x--;
//             y--;

//             flag[x][y] = false;

//             if(x+2 < n && y+1 < n){
//                 flag[x+2][y+1] = false;
//             }
//             if(x+1 < n && y+2 < n){
//                 flag[x+1][y+2] = false;
//             }
//             if(x-1 >= 0 && y+2 < n){
//                 flag[x-1][y+2] = false;
//             }
//             if(x-2 >= 0 && y+1 < n){
//                 flag[x-2][y+1] = false;
//             }
//             if(x-2 >=0 && y-1 < n){
//                 flag[x-2][y-1] = false;
//             }
//             if(x-1 >= 0 && y-2 >= 0){
//                 flag[x-1][y-2] = false;
//             }
//             if(x+1 < n && y-2 >= 0){
//                 flag[x+1][y-2] = false;
//             }
//             if(x+2 < n && y-1 >= 0){
//                 flag[x+2][y-1] = false;
//             }
//         }

//         long cnt = 0;
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 if(flag[i][j] == true){
//                     cnt++;
//                 }
//             }
//         }

//         System.out.println(cnt);
//     }
// }

//Error -1 : imma try int to long conversion
// //heap out of memory
// // import java.util.*;

// // public class Main{
// //     public static void main(String args[]){
// //         // int n = 8;
// //         Scanner sc = new Scanner(System.in);
        
// //         int n = sc.nextInt();
// //         int m = sc.nextInt();

// //         int[][] arr = new int[n][n];

// //         boolean[][] flag = new boolean[n][n];
// //         //first fill all the places with true
// //         for(int i=0; i<n; i++){
// //             for(int j=0; j<n; j++){
// //                 flag[i][j] = true;
// //             }
// //         }

// //         for(int i=0; i<m; i++){
// //             int x = sc.nextInt();
// //             int y = sc.nextInt();

// //             //now (x,y) is our place where knight is placed
// //             //now we have to mark all the places where knight can attack
// //             //ie true denotes safe and false unsafe

// //             x--;
// //             y--;

// //             flag[x][y] = false;

// //             if(x+2 < n && y+1 < n){
// //                 flag[x+2][y+1] = false;
// //             }
// //             if(x+1 < n && y+2 < n){
// //                 flag[x+1][y+2] = false;
// //             }
// //             if(x-1 >= 0 && y+2 < n){
// //                 flag[x-1][y+2] = false;
// //             }
// //             if(x-2 >= 0 && y+1 < n){
// //                 flag[x-2][y+1] = false;
// //             }
// //             if(x-2 >=0 && y-1 < n){
// //                 flag[x-2][y-1] = false;
// //             }
// //             if(x-1 >= 0 && y-2 >= 0){
// //                 flag[x-1][y-2] = false;
// //             }
// //             if(x+1 < n && y-2 >= 0){
// //                 flag[x+1][y-2] = false;
// //             }
// //             if(x+2 < n && y-1 >= 0){
// //                 flag[x+2][y-1] = false;
// //             }
// //         }

// //         //now same as last Qsn see cnt
// //         int cnt = 0;
// //         for(int i=0; i<n; i++){
// //             for(int j=0; j<n; j++){
// //                 if(flag[i][j] == true){
// //                     cnt++;
// //                 }
// //             }
// //         }

// //         System.out.println(cnt);



        
        
// //         // char[][] arr = new char[8][8];
// //         // for(int i=0; i<8; i++){
// //         //     String s = sc.next();
// //         //     for(int j=0; j<8; j++){
// //         //         arr[i][j] = s.charAt(j);
// //         //     }
// //         // }


// //         // //here i have used $ to denote it is captured by USA (aka freedom & democrasy has been already restored there)
// //         // //that means it is not possible to place rook there
// //         // //so we just calculate . at last
// //         // int ans = 0;
// //         // boolean[][] flag = new boolean[8][8];
// //         // HashSet<Integer> rowSet = new HashSet<>();
// //         // HashSet<Integer> colSet = new HashSet<>();
// //         // for(int i=0; i<8; i++){
// //         //     for(int j=0; j<8; j++){
// //         //         if(arr[i][j] == '#'){
// //         //             //time to spreak freedom
// //         //             rowSet.add(i);
// //         //             colSet.add(j);
// //         //         }
// //         //     }
// //         // }

// //         // //now fill the rowSet and colSet with the values in flag
// //         // for(int i=0; i<n; i++){
// //         //     for(int j=0; j<n; j++){
// //         //         if(rowSet.contains(i) || colSet.contains(j)){
// //         //             flag[i][j] = false;
// //         //         }
// //         //         else{
// //         //             flag[i][j] = true;
// //         //         }
// //         //     }
// //         // }

// //         // int cnt = 0;
// //         // for(int i=0; i<n; i++){
// //         //     for(int j=0; j<n; j++){
// //         //         if(flag[i][j] == true){
// //         //             cnt++;
// //         //         }
// //         //     }
// //         // }

// //         // System.out.println(cnt);
// //     }
// // }