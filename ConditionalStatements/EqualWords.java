import java.util.Scanner;

public class EqualWords {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String word1 = scanner.nextLine();

        if (word.equalsIgnoreCase(word1)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
