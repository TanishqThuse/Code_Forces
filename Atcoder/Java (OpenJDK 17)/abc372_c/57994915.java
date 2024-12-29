import java.util.*;

public class Main {

    // Function to count the initial occurrences of "ABC" in the string
    public static int countABC(String s) {
        int count = 0;
        for (int i = 0; i <= s.length() - 3; i++) {
            if (s.substring(i, i + 3).equals("ABC")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        
        sc.nextLine(); // Consume newline
        StringBuilder s = new StringBuilder(sc.nextLine()); // Read the string
        
        // Count initial occurrences of "ABC"
        int abcCount = countABC(s.toString());

        for (int i = 0; i < q; i++) {
            int idx = sc.nextInt() - 1; // Convert to 0-based index
            char ch = sc.next().charAt(0);
            
            // Only update if the character is different
            if (s.charAt(idx) != ch) {
                // Check around the changed position
                for (int j = Math.max(0, idx - 2); j <= Math.min(s.length() - 3, idx); j++) {
                    if (s.substring(j, j + 3).equals("ABC")) {
                        abcCount--;
                    }
                }

                // Update the character
                s.setCharAt(idx, ch);

                // Re-check around the changed position
                for (int j = Math.max(0, idx - 2); j <= Math.min(s.length() - 3, idx); j++) {
                    if (s.substring(j, j + 3).equals("ABC")) {
                        abcCount++;
                    }
                }
            }
            
            // Output the current count of "ABC"
            System.out.println(abcCount);
        }
        
        sc.close();
    }
}
