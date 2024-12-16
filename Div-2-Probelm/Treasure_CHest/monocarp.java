import java.util.*;

public class monocarp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x,y,z;
            x = sc.nextInt(); //chest position
            y = sc.nextInt(); //key
            z = sc.nextInt(); //max monocary stamina

            int chest_new_location ;
            if(x < y){
                chest_new_location = x + z;
                if(chest_new_location >= y){
                    System.out.println(y);
                }
                else{
                    int sum = y;
                    sum += Math.abs(y - chest_new_location);
                    System.out.println(sum);
                }
            }
            else{
                //we directly pick key on the way and then go to chest
                System.out.println(x);
            }
        }
    }
}