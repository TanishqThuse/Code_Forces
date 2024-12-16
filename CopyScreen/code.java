import java.util.*;

public class code{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        sc.nextLine();   
        while(t1-->0){
            String s = sc.nextLine();
            String t = sc.nextLine();

            int n = s.length();
            int m = t.length();

            //first i have to find the longest common subsequence from 0
            int cnt = 0;
            for(int i=0; i<Math.min(n,m); i++){
                if(s.charAt(i) != t.charAt(i)){
                    break;
                }
                cnt++;
            }
            int time = 0;
            time += (n-cnt) + (m-cnt) + ((cnt>0)?1:0) + cnt;
            System.out.println(time);
        }
    }
}