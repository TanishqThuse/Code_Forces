import java.util.Scanner;
 
public class VasyaSleuth {

    public static char remove_space(String question,char lastLetter,int i)
    {
        lastLetter = question.charAt(question.length()-i);
        i++;
        if(lastLetter == ' ')
        {
            lastLetter = remove_space(question,lastLetter,i);
        }
        return lastLetter;
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String question = scanner.nextLine().toLowerCase().trim();
 
        char lastLetter = question.charAt(question.length() - 2); // Ignore spaces and question mark
        
        int i=2;
        if(lastLetter == ' '){
            i++;
            lastLetter = remove_space(question,lastLetter,i);
            if (lastLetter == 'a' || lastLetter == 'e' || lastLetter == 'i' || 
                lastLetter == 'o' || lastLetter == 'u' || lastLetter == 'y') {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        else{
            if (lastLetter == 'a' || lastLetter == 'e' || lastLetter == 'i' || 
                lastLetter == 'o' || lastLetter == 'u' || lastLetter == 'y') {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}