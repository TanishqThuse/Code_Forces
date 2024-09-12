import java.util.*;

public class Shower2{

    public static void addInSet(HashMap<Integer, Boolean> set, int x, int y){
        for(int i=x; i<=y; i++){
            if(i==x || i==y){
                set.put(i, true);
            }
            else{
                set.put(i, false);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for(int i=0; i<cases; i++){
            int n, s, m;
            n = sc.nextInt();
            s = sc.nextInt();
            m = sc.nextInt();
            HashMap<Integer, Boolean> set= new HashMap<>();
            //true => edge , flase= not edge
            for(int j=0; j<n; j++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                addInSet(set, x, y);
            }
            int count = 0;
            int max_count = 0;
            // boolean flag = false;
            for(int j=0; j<m; j++){
                if(!set.containsKey(j) && set.containsValue(false)){
                    count++;
                    max_count = Math.max(count, max_count);
                }
                else{
                    count = 0;
                    // flag = false;
                }
            }
            if(max_count-1 >= s){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}