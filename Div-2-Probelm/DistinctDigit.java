import java.util.*;

public class DistinctDigit{

    public static boolean isDistinct(int n){
        int[] freq = new int[10];
        
        while(n>0){
            int digit = n%10;
            freq[digit]++;
            if(freq[digit]>1){
                return false;
            }
            n=n/10;
        }
        
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int l, r;
        l = sc.nextInt();
        r = sc.nextInt();
        for(int i=l; i<=r; i++){
            if(isDistinct(i)){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}