import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] bro = new char[3];
        for(int i=0; i<3; i++){
            bro[i] = sc.next().charAt(0);
        }
        
        char largest=' ', smallest=' ', middle=' ';
        if(bro[0] == '<' && bro[1] == '<'){
            smallest = 'A';
        }
        else if(bro[0] == '>' && bro[1]=='>'){
            largest = 'A';
        }
        else{
            middle = 'A';
        }

        if(largest !=' ' && largest == 'A'){
            //check if b is smallest
            if(bro[2] == '<'){
                middle = 'C';
            }
            else{
                middle = 'B';
            }
        }
        else if(smallest !=' ' && smallest == 'A'){
            if(bro[2] == '<'){
                middle = 'B';
            }
            else{
                middle = 'C';
            }
        }
        System.out.println(middle);



    }
}