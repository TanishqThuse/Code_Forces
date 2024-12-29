import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        int n1 = s1.length();
        int n2 = s2.length();
        int minLength = Math.min(n1, n2);

        for(int i = 0; i < minLength; i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                System.out.println(i + 1);
                return;
            }
        }

        if(n1 != n2) {
            System.out.println(minLength + 1);
        } else {
            System.out.println(0);
        }
    }
}



// import java.util.*;

// public class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String s1 = sc.next();
//         String s2 = sc.next();

//         int n1 = s1.length();
//         int n2 = s2.length();

//         if(n1 != n2){
//             System.out.println(Math.min(n1, n2)+1);
//             return;
//         }

//         for(int i=0; i<n1; i++){
//             if(s1.charAt(i) != s2.charAt(i)){
//                 System.out.println(i+1);
//                 return;
//             }
//         }
//         System.out.println(0);


//     }
// }