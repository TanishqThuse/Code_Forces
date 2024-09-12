import java.util.*;

public class sum_digits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n ; i++){
            int num;
            num = sc.nextInt();
            int sum=0;
            while(num>0){
                sum += num%10;
                num = num/10;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}