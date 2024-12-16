import java.util.*;

public class beautifulProduct{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] arr = new long[(int)n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextLong();
            }
            
            //my logic : 
            //1) Get a = the max*(2nd max)
            //2) Get  b = the (lowest -ve)*(2nd lowest -ve)
            //3) Print Max(a,b)

            //no sorting since constraints are low, 
            //we can find max and 2nd max in O(n) time

            long MIN = Long.MIN_VALUE;
            long MAX = Long.MAX_VALUE;

            long max = MIN;
            long secondMax = MIN;
            int MaxIndex = -1;
            long min = MAX;
            long secondMin = MAX;
            int MinIndex = -1;

            for(int i = 0; i<n; i++){
                if(arr[i] > max){
                    secondMax = max;
                    max = arr[i];
                    MaxIndex = i;
                }
                else if(arr[i] > secondMax && (arr[i] != max || i != MaxIndex)){
                    secondMax = arr[i];
                }

                //how ever THE MIN VALUE MUST MUST BE NEGATIVE
                if(arr[i] < 0){
                    if(arr[i] < min){
                        secondMin = min;
                        min = arr[i];
                        MinIndex = i;
                    }
                    else if(arr[i] < secondMin && (arr[i] != min || i != MinIndex)){
                        secondMin = arr[i];
                    }
                }
            }

            long a = max*secondMax;

            //now first check if there are atleast 2 negative numbers
            if(min == MAX || secondMin == MAX){
                System.out.println(a);
            }
            else{
                long b = min*secondMin;
                System.out.println(Math.max(a,b));
            }

        }
    }
}