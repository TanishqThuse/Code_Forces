//Using hashSet see later currently going by array busy
import java.util.*;

    public class Shower{

        public static void addInSet(HashSet<Integer> set, int x, int y){
            for(int i=x; i<y; i++){
                set.add(i);
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
                HashSet<Integer> set= new HashSet<>();
                for(int j=0; j<n; j++){
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    addInSet(set, x, y);
                }
                int count = 0;
                int max_count = 0;
                // boolean flag = false;
                for(int j=0; j<m; j++){
                    if(!set.contains(j)){
                        count++;
                        max_count = Math.max(count, max_count);
                    }
                    else{
                        count = 0;
                        // flag = false;
                    }
                }
                if(max_count >= s){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            
            sc.close();
        }
    }