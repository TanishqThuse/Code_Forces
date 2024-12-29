// package ADateWhichIAmNotGetting;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //first take inputtttt
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Long[][] arr = new Long[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextLong();
            arr[i][1] = sc.nextLong();
        }

        int q = sc.nextInt();

        Long[][] queries = new Long[q][2];

        for(int i=0; i<q; i++){
            queries[i][0] = sc.nextLong();
            queries[i][1] = sc.nextLong();
        }

        Long[] firstDateOfEachGarbage = new Long[n];
        for(int i=0; i<n; i++){
            firstDateOfEachGarbage[i] = (long)1;
        }

        //I HAVE TO AANSWER QUERIES SO GO FROM 0 TO Q-1
        for(int i=0; i<q; i++){
            long queryNumber = queries[i][0];
            long date = queries[i][1];

            long q_i = arr[(int)queryNumber-1][0];
            long r_i = arr[(int)queryNumber-1][1];

            // Calculate the remainder
            long currentRemainder = date % q_i;

            if (currentRemainder == r_i) {
                // If the current date already meets the requirement
                System.out.println(date);
            } else {
                // Calculate the days needed to reach the next valid collection day
            long daysToAdd = (currentRemainder < r_i)
                    ? (r_i - currentRemainder)
                    : (q_i - currentRemainder + r_i);
            
            // Move to the next valid collection day
            date += daysToAdd;
            System.out.println(date);
            }
            
            //Old Approach
            // //i think yaha pe mistake hai..TLE to ayega hi
            // // Long firstDate = firstDateOfEachGarbage[queryNumber-1];
            // while(date % q_i != r_i){
            //     date += 1;
            // }
            // System.out.println(date);           


        }
    }
}
