import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int[] b = new int[n];
        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }

        int[] arr1 = a.clone();
        int[] arr2 = b.clone();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int ans = 0;

        ans = arr1[n-1] + arr2[n-1];

        System.out.println(ans);




    }
}