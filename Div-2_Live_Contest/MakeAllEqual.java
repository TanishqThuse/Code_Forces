import java.util.*;

public class MakeAllEqual {

    // Function to find the minimum number of operations needed
    public static int minOperationsToMakeEqual(int n, ArrayList<Integer> list) {
        if (n == 1) {
            return 0;
        }

        // Finding the longest contiguous segment of equal elements
        int longestSegment = 1;
        int currentLength = 1;

        for (int i = 1; i < n; i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                currentLength++;
            } else {
                longestSegment = Math.max(longestSegment, currentLength);
                currentLength = 1;
            }
        }

        // Last segment check
        longestSegment = Math.max(longestSegment, currentLength);

        // Total operations needed is length of array minus the longest contiguous segment
        return n - longestSegment;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }

            System.out.println(minOperationsToMakeEqual(n, list));
        }
        sc.close();
    }
}
