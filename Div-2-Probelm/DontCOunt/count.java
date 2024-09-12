import java.util.*;

public class count{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n,m;
            n = sc.nextInt();
            m = sc.nextInt();
            sc.nextLine();

            String x = sc.nextLine();
            // sc.nextLine();
            String s = sc.nextLine();
            int c= 0;

            //we want to append x into x until it's a substring of s
            while(!x.contains(s)){
                x += x;
                c++;
                if(x.length()>s.length()*1000){
                    c = -1;
                    break;
                }

            }

            // if(c>0)
                System.out.println(c);
            // else
                // System.out.println(-1);
        }
        sc.close();
    }
}