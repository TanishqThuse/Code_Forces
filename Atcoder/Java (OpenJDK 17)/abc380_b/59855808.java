import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String n = sc.nextLine();
        
        int c = -1;
        String s = sc.nextLine();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != '|' || i==0){
                c++;
            }
            else{
                System.out.print(c + " ");
                c=0;    
            }
        }
        
    }
}