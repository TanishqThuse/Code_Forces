import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.endsWith("san")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}