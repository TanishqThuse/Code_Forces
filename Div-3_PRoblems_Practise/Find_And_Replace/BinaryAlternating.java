import java.util.*;

public class BinaryAlternating{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s =  sc.next();
            HashSet<Character> set = new HashSet<>();

            int i = 0;
            char bin = '1';
            boolean flag = true;
            while(i<n){
                char ch = s.charAt(i);
                if((i!=0 && s.charAt(i-1)==ch) || (i+1<n && s.charAt(i)==s.charAt(i+1))){
                    System.out.println("NO");
                    flag = false;
                    break;
                }

                for(int j=i; j<n; j++){
                    if(j!=i && s.charAt(j) == ch){
                        s = s.substring(0,j) + (char)(bin+'0') + ((j+1<n)?s.substring(j+1):"");
                    }
                }
            }
        }
    }
}