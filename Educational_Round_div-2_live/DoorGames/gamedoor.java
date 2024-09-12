import java.util.*;

class gamedoor{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while(cases-->0){
            int a,b,c,d;
            a = sc.nextInt();
            b = sc.nextInt();
            sc.nextLine();
            c = sc.nextInt();
            d = sc.nextInt();
            
            if(a==c && b==d){
                System.out.println(b-a);

            
            int start = Math.min(a,b);
            int end = Math.max(a,b);
            int count = 0;
            for(int i=start; i<end; i++){
                if(i>=a && i>=b && i<=c && i<=d){
                    count++;
                }
            }
            if(count==0){
                System.out.println(1);
            }
            else{
                System.out.println(count);
            }
        }
    }
}
}
