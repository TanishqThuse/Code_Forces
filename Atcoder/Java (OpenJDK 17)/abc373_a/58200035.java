import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int c = 0;
        for(int i=1; i<=12; i++){
            String s = sc.nextLine();
            if(s.length() == i){
                c++;
            }
        }
        System.out.println(c);
    }
}