import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[2*n];
            for(int i=0; i<2*n; i++){
                arr[i] = sc.nextInt();
            }
            boolean minimum = false;

            int N = 2*n;

            boolean[] finalMinState = new boolean[n];

            for(int i=0; i<n ; i++){
                finalMinState[i] = false;
            }

            int count = 0;

            int idx  = 0;

            for(int i=0; i<2*n; i++){
                // if(count==2){
                //     finalMinState[idx++] = false;
                //     count = 0;
                // }

                if(arr[i]==1){
                    count++;
                    finalMinState[idx%n] = true;
                }

                if(count==2){
                    finalMinState[idx%n] = false;
                    idx++;
                    count = 0;
                }
                
            }
            
            int mini = 0;
            for(int i=0; i<n; i++){
                if(finalMinState[i]){
                    mini++;
                }
            }
            System.out.print(mini + " ");

            //now to count maximum we sum 1s and finally do sum%2*n
            
            int sum = 0;

            boolean[] finalMaxState = new boolean[n];

            for(int i=0; i<n ; i++){
                finalMaxState[i] = false;
            }

            idx = 0;

            for(int i=0; i<N; i++){
                if(arr[i]==1){
                    finalMaxState[idx%n] = !(finalMaxState[idx%n]);
                    idx++;
                }
                // idx++;
            }


            for(int i=0; i<n; i++){
                if(finalMaxState[i]){
                    sum++;
                }
                // sum += arr[i];
            }

            System.out.print(sum);
            System.out.println();
        }
    }
}