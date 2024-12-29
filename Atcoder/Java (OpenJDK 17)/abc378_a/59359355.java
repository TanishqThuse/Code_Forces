import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<4; i++){
            arr[i] = sc.nextInt();
        }
        int n  =4;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        int sum = 0;

        for(int i: map.keySet()){
            sum += (map.get(i) / 2);
        }

        //mistake i should iterate the map instead of the array
        // for(int i=0; i<4; i++)
        // {
        //     sum += (map.get(arr[i]) / 2);
        // }

        System.out.println(sum);
    }
}
