import java.util.*;

public class Main{
    public static void main(String args[]){
        int n = 8;
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[8][8];
        for(int i=0; i<8; i++){
            String s = sc.next();
            for(int j=0; j<8; j++){
                arr[i][j] = s.charAt(j);
            }
        }


        //here i have used $ to denote it is captured by USA (aka freedom & democrasy has been already restored there)
        //that means it is not possible to place rook there
        //so we just calculate . at last
        int ans = 0;
        boolean[][] flag = new boolean[8][8];
        HashSet<Integer> rowSet = new HashSet<>();
        HashSet<Integer> colSet = new HashSet<>();
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(arr[i][j] == '#'){
                    //time to spreak freedom
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }

        //now fill the rowSet and colSet with the values in flag
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(rowSet.contains(i) || colSet.contains(j)){
                    flag[i][j] = false;
                }
                else{
                    flag[i][j] = true;
                }
            }
        }

        int cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(flag[i][j] == true){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}