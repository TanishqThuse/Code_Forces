import java.util.*;

public class min_flip{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='5'){
                if(ch[i]=='9' && i==0){
                    continue;
                }
                ch[i] = (char)('9'-ch[i]+'0');
            }
        }
        System.out.println(ch);
    }
}