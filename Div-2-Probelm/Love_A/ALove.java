import java.util.*;

public class ALove{

    public static int countA(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        // for(int i=0; i<n; i++){
        int i=0;
        while(i!=s.length()-1){
            if(countA(s)>(n/2)){
                System.out.println(n);
                break;
            }
            else if(s.charAt(i)!='a' ){
                if(i!=n-1)
                    s = s.substring(0, i) + s.substring(i+1);
                else
                    s = s.substring(0, i);    
            }
            i++;
        }
        System.out.println(s.length());
    }
}