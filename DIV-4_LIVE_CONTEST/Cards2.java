import java.util.*;

public class Cards2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        for(int i=0; i<n; i++){
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();
            
            int count = 0;

            int[][] suneetCards = {{a1, a2}, {a2, a1}};
            int[][] slavicCards = {{b1, b2}, {b2, b1}};

            for(int[] suneet : suneetCards){
                for(int[] slavic : slavicCards){
                    int suneetWins = 0;
                    int slavicWins = 0;

                    //Compare first
                    if(suneet[0] > slavic[0]){
                        suneetWins++;
                    }
                    else if(suneet[0] < slavic[0]){
                        slavicWins++;
                    }
                    
                    //Compare 2nd round
                    if(suneet[1] > slavic[1]){
                        suneetWins++;
                    }
                    else if(suneet[1] < slavic[1]){
                        slavicWins++;
                    }

                    //Check who wins
                    if(suneetWins > slavicWins){
                        count++;
                    }
                }
            }
            System.out.println(count);

        }
        sc.close();
    }

}
