import java.util.*;

public class Main{

    public static boolean checkMaxOnePos(int arr[]){
        int n = arr.length;
        int flag = 0;
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                flag++;
            }
        }
        if(flag>1){
            return false;
        }
        else{
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        while(!checkMaxOnePos(arr)) {
            
            // Sort in ascending order
            Arrays.sort(arr);

            // Reverse the array to get descending order
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }

            // Subtract 1 from the first element
            arr[0]--;
            arr[1]--;
            count++;
        }
        System.out.println(count);//;(count);

        sc.close();
    }
}
