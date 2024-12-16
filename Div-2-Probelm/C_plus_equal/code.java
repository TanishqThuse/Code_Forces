import java.util.*;

public class code{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int c = 0;

            if(a > b){
                while(a <= n && b <= n){
                    if(c%2 == 0){
                        a += b;
                    }
                    else{
                        b += a;
                    }
                    c++;
                }
            }
            else{
                while(a <= n && b <= n){
                    if(c%2 == 0){
                        b += a;
                    }
                    else{
                        a += b;
                    }
                    c++;
                }
            }

            System.out.println(c);

        }
    }
}