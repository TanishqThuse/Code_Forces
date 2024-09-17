import java.util.*;

public class minVowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        String vowels = "aeiou";
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            StringBuilder result = new StringBuilder();
            
            for (int j = 0; j < n; j++) {
                result.append(vowels.charAt(j % 5));
            }
            
            System.out.println(result.toString());
        }
        
        sc.close();
    }
}
