import java.util.*;

class makeAllEqual{

    public static boolean isEqual(ArrayList<Integer> list, int m){
        if(m==1){
            return true;
        }

        int flag = list.get(0);
        for(int i=1; i<m; i++){
            if(list.get(i)!=flag){
                return false;
            }
        }


        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while(cases-->0){
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<n; i++){
                int temp = sc.nextInt();
                list.add(temp);
            }

            int count = 0;
            // int min = Integer.MAX_VALUE;
            //m is current size of array
            int m = list.size();
            int i = 0;
            while(isEqual(list, m) == false){
                m = list.size();
                if(list.get(i)<=list.get((i%m)+1)){
                    for(int j=0; i<m; j++){
                        if(list.get(i)==list.get(j)){
                            list.remove(i%m+1);
                        }
                    }
                    list.remove(i);
                }
            }
        }
    }
}