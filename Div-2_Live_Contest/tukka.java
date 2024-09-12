import java.util.*;

public class tukka{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }  
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i=0; i<n; i++){
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            }

            int max = 0;
            for(int i: map.values()){
                max = Math.max(max, i);
            }
            System.out.println(n-max);
        }
    }
}