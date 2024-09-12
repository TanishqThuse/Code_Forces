import java.util.*;

public class x_axis{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int a,b,c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            int max = Math.max(Math.max(a,b),c);
            int min_sum = Integer.MAX_VALUE;
            for(int j=0; j<=max;  j++){
                int sum = 0;
                sum += Math.abs(a-j) + Math.abs(b-j) + Math.abs(c-j);
                min_sum = Math.min(min_sum, sum);
            }
            System.out.println(min_sum);
        }
        // System.out.println(x);
    }
}