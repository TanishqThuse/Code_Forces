import java.util.*;

public class Main
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        int n = 3;
        String ans1 = arr[1] + "" + arr[2] + "" + arr[0];
        String ans2 = arr[2] + "" + arr[0] + "" + arr[1];
        System.out.print(ans1 + " ");
        System.out.print(ans2);
        System.out.println();
    }
}