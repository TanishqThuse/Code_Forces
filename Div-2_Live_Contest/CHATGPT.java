import java.util.*;

public class CHATGPT {

    // Function to find the minimum number of operations needed
    public static int minOperationsToMakeEqual(int n, ArrayList<Integer> list) {
        if (n == 1) {
            return 0; // No operations needed if there is only one element
        }

        // Concatenate the list with itself to handle the cyclic nature
        ArrayList<Integer> extendedList = new ArrayList<>(list);
        extendedList.addAll(list);

        // Finding the longest contiguous segment of equal elements in the extended list
        int longestSegment = 1;
        int currentLength = 1;

        for (int i = 1; i < extendedList.size(); i++) {
            if (extendedList.get(i).equals(extendedList.get(i - 1))) {
                currentLength++;
            } else {
                longestSegment = Math.max(longestSegment, currentLength);
                currentLength = 1;
            }

            // Stop considering segments longer than the original array length
            if (i >= n + longestSegment) {
                break;
            }
        }

        // Last segment check
        longestSegment = Math.max(longestSegment, currentLength);

        // Total operations needed is length of original array minus the longest contiguous segment
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
