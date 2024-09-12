import java.util.*;

public class ShortSubstring{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int cases;
        cases = sc.nextInt();
        while(cases-->=0){
            String s = sc.nextLine();
            int n = s.length();
            if(n<=2){
                System.out.println(s);
                continue;
            }
            String ans = "";
            for(int i=0; i<n; i=i+2){
                ans += s.charAt(i);
            }
            ans += s.charAt(n-1);
            System.out.println(ans);
            
        }
    }
}