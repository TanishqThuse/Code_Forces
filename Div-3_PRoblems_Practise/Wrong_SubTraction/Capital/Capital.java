import java.util.*;

public class Capital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int k = sc.nextInt();
        String str = sc.next();
        char ch = str.charAt(0);

        if(ch >= 'a' && ch <= 'z') {
            ch = (char)((int)ch - 32);    
        } 

        str = ch + str.substring(1);
        System.out.println(str);
    }
}