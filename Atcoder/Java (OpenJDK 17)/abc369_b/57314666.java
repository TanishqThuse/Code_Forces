import java.util.*;

class Main{

    public static int sumFatigues(List<Integer> list){
        int sum = 0;
        for(int i=1; i<list.size(); i++){
            sum += Math.abs(list.get(i)-list.get(i-1));
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int n;
        n = sc.nextInt();
        boolean flagLeft = false;
        boolean flagRight = false;
        while(n-->0){
            int move = sc.nextInt();
            char hand = sc.next().charAt(0);
            if(hand == 'L'){
                if(!flagLeft){
                //     flagLeft = true;
                // }
                // else{
                //     // int temp = sc.nextInt(); //Mistake
                    left.add(move);
                }
            }
            else if(hand == 'R'){
                if(!flagRight){
                //     flagRight = true;
                // }
                // else{
                    // int temp = sc.nextInt(); 
                    right.add(move);
                }
            }
        }

        int sum = 0;
        sum += sumFatigues(left);
        sum += sumFatigues(right);

        System.out.println(sum);
    }
} 