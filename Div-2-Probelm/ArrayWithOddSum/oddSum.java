//if the array has at least one odd and atleast one even number we can change eelements such that 
//sum is always odd
//if the array has all odd numbers then we cannot change elements such that sum is always odd
//simioalr for even ones

import java.util.*;

public class oddSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean odd = false;
            boolean even = false;
            for(int i=0; i<n; i++){
                int temp = sc.nextInt();
                if(temp%2==0){
                    even = true;
                }else{
                    odd = true;
                }
                arr[i] = temp;
            }

            int sum = 0;
            for(int i=0; i<n; i++){
                sum+=arr[i];
            }

            if(odd && even || sum%2!=0){
                System.out.println("YES");
            
            }
            else{
                System.out.println("NO");
            }


        }
    }
}