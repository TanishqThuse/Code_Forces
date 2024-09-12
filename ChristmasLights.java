import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class ChristmasLights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of buttons and bulbs
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // Use a set to keep track of all the bulbs that are turned on
        Set<Integer> turnedOnBulbs = new HashSet<>();
        
        // Process each button
        for (int i = 0; i < n; ++i) {
            int xi = scanner.nextInt(); // Number of bulbs this button can turn on
            for (int j = 0; j < xi; ++j) {
                int bulb = scanner.nextInt();
                turnedOnBulbs.add(bulb); // Add the bulb to the set of turned-on bulbs
            }
        }
        
        // Check if all bulbs from 1 to m are turned on
        boolean allOn = true;
        for (int i = 1; i <= m; ++i) {
            if (!turnedOnBulbs.contains(i)) {
                allOn = false;
                break;
            }
        }
        
        // Output the result
        if (allOn) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}


// import java.util.Scanner;
// import java.util.HashSet;
// import java.util.Set;

// public class ChristmasLights {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         // Read the number of buttons and bulbs
//         int n = scanner.nextInt();
//         int m = scanner.nextInt();
        
//         // Use a set to keep track of all the bulbs that are turned on
//         Set<Integer> turnedOnBulbs = new HashSet<>();
        
//        for(int i=0; i<n; i++){
//             int xi;
//             xi = scanner.nextInt();
//             for(int i=1; i<xi; i++){
//                 turnedOnBulbs.add(i);
//             }
//        }
        
//         scanner.close();
//     }
// }
