import java.util.Scanner;

public class Spaceship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double lenght = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double heightAstronaut = Double.parseDouble(scanner.nextLine());

        double volumeRocket = width * lenght * height;
        double volumeRoom = (heightAstronaut + 0.40) * 2 * 2;
        double space = Math.floor(volumeRocket / volumeRoom);

        if (space >= 3 && space <= 10){
            System.out.printf("The spacecraft holds %.0f astronauts.", space);
        } else if (space < 3){
            System.out.println("The spacecraft is too small.");
        } else if (space > 10){
            System.out.println("The spacecraft is too big.");
        }
    }
}
