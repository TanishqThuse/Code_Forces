import java.util.*;

public class luckyDivide{

    public static boolean isLucky(int s){
        
        while(s>0){
            int d = s%10;
            if(d!=4 && d!=7){
                return false;
            }
            s /= 10;    
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s;
        s = sc.nextInt();

        if(isLucky(s)){
            System.out.println("YES");
            return;
        }

        for(int i=1; i<s; i++){
            if(s%i==0 && isLucky(i)){
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
        sc.close();
    }
}