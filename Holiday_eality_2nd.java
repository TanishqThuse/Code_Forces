import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int c = 0; // counter to store how many currency is spent

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int j = 0; j < n; j++) {
            if (arr[j] < max) {
                while (arr[j] != max) {
                    arr[j]++;
                    c++;
                }
            }
        }

        System.out.println(c);
    }
}
