import java.util.Scanner;

public class BestPlayer {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int maxGoals = 0;
        String bestPlayer = "";
        while (true){
            String name = scanner.nextLine();
            if ("END".equals(name)){
                break;
            }
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals >= 10){
                System.out.printf("%s is the best player!\n", name);
                System.out.printf("He has scored %d goals and made a hat-trick !!!", goals);
                return;
            }
            if (maxGoals < goals){
                maxGoals = goals;
                bestPlayer = name;
            }
        }
        System.out.printf("%s is the best player!\n", bestPlayer);
        if (maxGoals >= 3){
            System.out.printf("He has scored %d goals and made a hat-trick !!!",maxGoals);
        }else{
            System.out.printf("He has scored %d goals.", maxGoals);
        }
    }
}

