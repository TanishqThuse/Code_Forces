import java.util.*;

public class SumOfRoundNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();  // The number n
            
            // List to store the round numbers
            List<Integer> roundNumbers = new ArrayList<>();
            int placeValue = 1;  // This starts with units place (10^0)
            
            // Loop through each digit of n from the least significant digit
            while (n > 0) {
                int digit = n % 10;  // Get the last digit
                if (digit != 0) {
                    // If the digit is non-zero, compute the round number
                    roundNumbers.add(digit * placeValue);
                }
                n /= 10;  // Remove the last digit
                placeValue *= 10;  // Increase the place value (units -> tens -> hundreds ...)
            }
            
            // Output the result
            System.out.println(roundNumbers.size());  // Print number of round numbers
            for (int roundNumber : roundNumbers) {
                System.out.print(roundNumber + " ");  // Print the round numbers
            }
            System.out.println();  // Move to the next test case
        }
        
        sc.close();  // Close the scanner when done
    }
}
