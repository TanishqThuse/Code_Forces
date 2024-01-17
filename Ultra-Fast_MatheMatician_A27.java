import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Read two input strings
        String a = scanner.next();
        String b = scanner.next();

        // Initialize the final string
        StringBuilder finalString = new StringBuilder();

        // Iterate through each character of the input strings and perform XOR
        for (int i = 0; i < a.length(); i++) {
            finalString.append((a.charAt(i) == b.charAt(i)) ? '0' : '1');
        }

        // Output the final result
        System.out.println(finalString.toString());

        // Close the scanner
        scanner.close();
    }
}
