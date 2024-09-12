import java.util.*;

public class Ans{
    public static void main(String args[]){
        HashMap<Integer, Integer> map = new HashMap<>();
    
        Scanner scanner = new Scanner(System.in);

        // Reading the input values
        int k2 = scanner.nextInt();
        int k3 = scanner.nextInt();
        int k5 = scanner.nextInt();
        int k6 = scanner.nextInt();

         // Using a HashMap to store the counts of the digits
         Map<Integer, Integer> digitCount = new HashMap<>();
         digitCount.put(2, k2);
         digitCount.put(3, k3);
         digitCount.put(5, k5);
         digitCount.put(6, k6);

         //Calculate how manny time can we  form the number 256
         int num256 = Math.min(Math.min(digitCount.get(2), digitCount.get(5)), digitCount.get(6));

         //Update the counts of the digits -2 
            digitCount.put(2, digitCount.get(2) - num256);

        //get the number of 32s
        int num32 = Math.min(digitCount.get(2), digitCount.get(3));
    
         // Calculate the total sum
         int totalSum = num256 * 256 + num32 * 32;

             // Print the result
        System.out.println(totalSum);
        
        scanner.close();
    }   

}