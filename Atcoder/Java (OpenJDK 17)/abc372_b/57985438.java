import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long M = sc.nextLong();  // The given input M
        
        ArrayList<Long> A = new ArrayList<>();  // To store the exponents
        
        // Iterate to decompose M into sums of powers of 3
        while (M > 0) {
            long power = 0;
            long val = 1;
            
            // Find the highest power of 3 that fits into M
            while (val * 3 <= M) {
                val *= 3;
                power++;
            }
            
            // Subtract the largest power of 3 from M
            A.add(power);
            M -= val;
        }
        
        // Output the number of terms (N) and the sequence A
        System.out.println(A.size());
        for (long exp : A) {
            System.out.print(exp + " ");
        }
        System.out.println();
        sc.close();
    }

}



//This code crashes into an infinite loop
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         long m = sc.nextInt();

//         List<Long> list = new ArrayList<>();

//         long power = 0;

//         while(m != 0){

//             while(Math.pow(3,power) < m){
//                 power++;
//             }
//             //now we are sure that 3^power is greater than m or if power+1 is equal to m then
//             if(Math.pow(3,power+1) == m){
//                 list.add(power+1);
//                 break;
//             }

//             list.add(power);
//             m = m - (long)Math.pow(3,power);
//             power = 0;
//         }

//         System.out.println(list.size());
//         for(int i=0; i<list.size(); i++){
//             System.out.print(list.get(i) + " ");
//         }

//     }
// }