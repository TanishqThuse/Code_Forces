import java.util.*;

public class BoringRooms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            int n = sc.nextInt();
            if(n<10){
                System.out.println(n);
                continue;
            }
            //1,11,111
            //from 1 to 10 we have 9
            //from 11 to 100 we have 9
            //from 101 to 1000 we have 9
            //from 1001 to 10000 we have 9
            //from 10001 to 100000 we have 9
            //and so on...!
            
            
            


        }
        
    }
}