import java.util.*;

public class countDay{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] days = new int[7];
        for(int i=0; i<7; i++){
            days[i] = sc.nextInt();
        }
        int i=0;
        while(n>0){
            n -= days[i];
            i = (i+1)%7;
        }
        System.out.println(i==0?7:i);
    }
}