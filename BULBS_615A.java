import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class BULBS_615A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of buttons and bulbs
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // Use a set to keep track of all the bulbs that are turned on
        Set<Integer> turnedOnBulbs = new HashSet<>();
        
       for(int i=0; i<n; i++){
            int xi;
            xi = scanner.nextInt();
            for(int i=1; i<xi; i++){
                turnedOnBulbs.add(i);
            }
       }

    // boolean ans = false;
       if(turnedOnBulbs.size() == m){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        
        scanner.close();
    }
}
