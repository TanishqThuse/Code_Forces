// import java.util.*;

// public class sumMinTerms {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         int t = sc.nextInt();  // Number of test cases
//         while (t-- > 0) {
//             int n = sc.nextInt();  // The number n
            
//             // List to store the round numbers
//             List<Integer> roundNumbers = new ArrayList<>();
//             int placeValue = 1;  // This starts with units place (10^0)
            
//             // Loop through each digit of n from the least significant digit
//             while (n > 0) {
//                 int digit = n % 10;  // Get the last digit
//                 if (digit != 0) {
//                     // If the digit is non-zero, compute the round number
//                     roundNumbers.add(digit * placeValue);
//                 }
//                 n /= 10;  // Remove the last digit
//                 placeValue *= 10;  // Increase the place value (units -> tens -> hundreds ...)
//             }
            
//             // Output the result
//             System.out.println(roundNumbers.size());  // Print number of round numbers
//             for (int roundNumber : roundNumbers) {
//                 System.out.print(roundNumber + " ");  // Print the round numbers
//             }
//             System.out.println();  // Move to the next test case
//         }
        
//         sc.close();  // Close the scanner when done
//     }
// }


// // import java.util.*;

// // public class sumMinTerms {

// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         int t = sc.nextInt();
// //         sc.nextLine();  // Consume the leftover newline after nextInt()

// //         while (t-- > 0) {
// //             String s = sc.nextLine();  // Properly read the input string
// //             int n = s.length();
            
// //             // Special case: if the string has only one character
// //             if (n == 1) {
// //                 System.out.println(1);
// //                 System.out.println(s);
// //                 continue;
// //             }

// //             // Convert string to char array
// //             char[] charArray = s.toCharArray();
            
// //             int m = 0; // Count the number of non-zero characters
// //             for (int i = 0; i < n; i++) {
// //                 if (charArray[i] != '0') {
// //                     m++;
// //                 }
// //             }

// //             System.out.println(m);

// //             // Print each non-zero character followed by the appropriate number of zeros
// //             for (int i = 0; i < n; i++) {
// //                 if (charArray[i] != '0') {
// //                     System.out.print(charArray[i]);
// //                     for (int j = i + 1; j < n; j++) {
// //                         System.out.print(0);
// //                     }
// //                     System.out.print(" ");
// //                 }
// //             }
// //             System.out.println();  // Print newline after each test case
// //         }

// //         sc.close();  // Close the scanner when done
// //     }
// // }


// // // import java.util.*;

// // // public class sumMinTerms {

// // //     public static void main(String[] args){
// // //         Scanner sc = new Scanner(System.in);

// // //         int t = sc.nextInt();
// // //         sc.nextLine();  // Consume the leftover newline after nextInt()

// // //         while (t-- > 0) {
// // //             String s = sc.nextLine();  // Now it properly reads the input string
// // //             int n = s.length();
            
// // //             // Special case: if the string has only one character
// // //             if (n == 1) {
// // //                 System.out.println(1);
// // //                 System.out.println(s);
// // //                 continue;
// // //             }

// // //             char[] charArray = s.toCharArray();
            
// // //             int m = 0; // Count the number of non-zero characters
// // //             for (int i = 0; i < n; i++) {
// // //                 if (charArray[i] != '0') {
// // //                     m++;
// // //                 }
// // //             }

// // //             System.out.println(m);

// // //             // Print each non-zero character followed by the appropriate number of zeros
// // //             for (int i = 0; i < n; i++) {
// // //                 if (charArray[i] != '0') {
// // //                     System.out.print(charArray[i]);
// // //                     for (int j = i + 1; j < n; j++) {
// // //                         System.out.print(0);
// // //                     }
// // //                     System.out.print(" ");
// // //                 }
// // //             }
// // //             System.out.println();  // Print newline after each test case
// // //             // if(t==n-1){
// // //             //     break;
// // //             // }
// // //         }

// // //         sc.close();  // Close the scanner when done
// // //     }
// // // }


import java.util.*;

public class sumMinTerms{

    /**Appraoch : //direcrlt for each test case: 
     * 1) Take string input and 
     * 2) Convert string to charArray
     * 3) For entire array --> count non - zero elements
     * 4) This non-zero ele is wht we print first -> it is basicalt the num of elements in next line we priunt
     * 5) iterate over charArray and print non - zero element 
     * 6) Now put j = j+1 and j goes till n-1` we print 0 only
     */


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        // sc.nextLine();
        System.out.println();
        while(t-->0){
            
            String s = sc.nextLine();
            int n = s.length();
            if(n==1){
                System.out.println(n);
                System.out.println(s);
                continue;
            }

            // char[] charArray = s.toCharArray();
            
            int m = 0 ;// to count the number of non-zeroes
            for(int i=0; i<n; i++){
                if(s.charAt(i) != '0'){
                    m++;
                }
            }

            System.out.println(m);

            for(int i=0; i<n; i++){
                if(s.charAt(i)!='0'){
                    System.out.print(s.charAt(i));
                    for(int j=i+1; j<n; j++ ){
                        System.out.print(0);
                    }
                    System.out.print(" ");
                }
            }
            System.out.println();


            // int n = sc.nextInt();
            
        }
    }
}