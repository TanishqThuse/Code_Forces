import java.util.*;

public class Card_Game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n ; i++){
            int a,b,c,d;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();

            //comapre a,c with c,d and
            int count = 0;
            if(a>c && b>d){
                count = count+2;
            }
            if(a>d && b>c){
                count = count+2;
            }
            // if(){
            //     count++;
            // }
            // if (b>d) {
            //     count++;
            // }
            System.out.println(count);
        }
        sc.close();
    }
}