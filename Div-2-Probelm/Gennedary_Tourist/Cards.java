import java.util.*;

public class Cards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        
        String str  = sc.nextLine();

        String[] arr = new String[5];

        for(int i=0; i<5; i++) {
            arr[i] = sc.next();
        }

        for(int i=0; i<5; i++) {
            if(arr[i].charAt(0) == str.charAt(0) || arr[i].charAt(1) == str.charAt(1)) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
        sc.close();
    }
}
