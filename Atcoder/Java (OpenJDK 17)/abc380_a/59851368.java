import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // If the input number is 0, handle that explicitly
        if (n == 0) {
            System.out.println("Yes");
            return;
        }
        
        Map<Integer, Integer> m = new HashMap<>();
        
        while (n > 0) {
            int digit = n % 10;
            if(digit>3){
                System.out.println("No");
                return;
            }
            m.put(digit, m.getOrDefault(digit, 0) + 1);
            n = n / 10;
        }
        
        for (Map.Entry<Integer, Integer> it : m.entrySet()) {
            if (it.getKey() != it.getValue()) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
