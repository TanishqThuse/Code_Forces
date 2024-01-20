import java.util.Scanner;

public class TaymyrCall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int z = scanner.nextInt();

        // Find the common multiples of n and m
        int lcm = (n * m) / gcd(n, m);

        // Calculate the number of artists to be killed
        int artistsToKill = z / lcm;

        System.out.println(artistsToKill);
    }

    // Function to calculate the greatest common divisor (GCD)
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
