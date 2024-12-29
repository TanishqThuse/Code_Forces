import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int families = sc.nextInt();
        int t = sc.nextInt();
        boolean[] arr = new boolean[families];
        while(t-->0){
            int a = sc.nextInt();
            char b = sc.next().charAt(0);
            if(b=='F'){
                System.out.println("No");
                continue;
            }
            if(arr[a-1]==false){
                arr[a-1] = true;
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            
        }

    }
}