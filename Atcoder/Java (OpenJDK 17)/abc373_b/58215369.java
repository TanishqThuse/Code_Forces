import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'A'] = i;
        }

        int ans = 0;
        int idx = arr[0];

        for (char ch = 'B'; ch <= 'Z'; ch++) {
            int nextIdx = arr[ch - 'A'];
            ans += Math.abs(nextIdx - idx);
            idx = nextIdx;
        }

        System.out.println(ans);
    }
}
