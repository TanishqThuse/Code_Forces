import java.util.*;

public class Main{
    public static void main(String Agrs[]){
        Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int n = s.length();
            if(n!=3){
                System.out.println("No");
            }
            else{
                HashMap<Character, Integer> mp = new HashMap<>();
                mp.put('A',0);
                mp.put('B',0);
                mp.put('C',0);  
                boolean flag = true;
                for(int i=0; i<n; i++){
                    char ch = s.charAt(i);
                    if(ch =='A' || ch == 'B' || ch == 'C'){
                        mp.put(ch, mp.get(ch)+1);
                    }
                    else{
                        flag = false;
                    }
                }
                if(mp.get('A') == 1 && mp.get('B') == 1 && mp.get('C') == 1){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
        }
    }