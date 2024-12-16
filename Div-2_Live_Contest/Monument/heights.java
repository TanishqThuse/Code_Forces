import java.util.*;

public class heights{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int c = 0;
            int left = 0;
            int right = 0;

            int[] arr = new int[n];
            for(int i = 0 ; i<n; i++){
                arr[i] = sc.nextInt();
            }
             
            //first we will go from left to right
            for(int i=0; i<n-1; i++){
                if(arr[i] > arr[i+1]){
                    arr[i] = arr[i+1];
                    left++;
                }
            }

            //now we will go from right to left
            for(int i=n-1; i>0; i--){
                if(arr[i] > arr[i-1]){
                    arr[i] = arr[i-1];
                    right++;
                }
            }

            System.out.println(Math.min(left, right));

        }
    }
}