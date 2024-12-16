import java.util.*;

public class DeleteFromLeft{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
    
        //now we have to find longest common substring 
        int n = a.length();
        int m = b.length();

        int i = n-1;
        int j = m-1;

        int count = 0;

        while(i >= 0 && j >= 0){
            if(a.charAt(i) == b.charAt(j)){
                count++;
            }
            else{
                break;
            }
            i--;
            j--;
        }

        //now we have count as the common part
        //now we have to find the remaining part

        int ans = n+m-2*count;

        System.out.println(ans);
    }
}