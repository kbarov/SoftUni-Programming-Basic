import java.util.Scanner;

public class FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        String souvenir = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        double price = 0;



        if (team.equals("Argentina")) {
            if (souvenir.equals("flags")) {
                price = 3.25 * count;
            } else if (souvenir.equals("caps")) {
                price = 7.2 * count;
            } else if (souvenir.equals("posters")) {
                price = 5.1 * count;
            } else if (souvenir.equals("stickers")) {
                price = 1.25 * count;
            } else {
                System.out.println("Invalid stock!");
                return;
            }

        } else if (team.equals("Brazil")) {
            if (souvenir.equals("flags")) {
                price = 4.2 * count;
            } else if (souvenir.equals("caps")) {
                price = 8.5 * count;
            } else if (souvenir.equals("posters")) {
                price = 5.35 * count;
            } else if (souvenir.equals("stickers")) {
                price = 1.2 * count;
            } else {
                System.out.println("Invalid stock!");
                return;
            }
        } else if (team.equals("Croatia")) {
            if (souvenir.equals("flags")) {
                price = 2.75 * count;
            } else if (souvenir.equals("caps")) {
                price = 6.90 * count;
            } else if (souvenir.equals("posters")) {
                price = 4.95 * count;
            } else if (souvenir.equals("stickers")) {
                price = 1.1 * count;
            } else {
                System.out.println("Invalid stock!");
                return;
            }

        } else if (team.equals("Denmark")) {
            if (souvenir.equals("flags")) {
                price = 3.1 * count;
            } else if (souvenir.equals("caps")) {
                price = 6.5 * count;
            } else if (souvenir.equals("posters")) {
                price = 4.80 * count;
            } else if (souvenir.equals("stickers")) {
                price = 0.9 * count;
            } else {
                System.out.println("Invalid stock!");
                return;
            }
        } else {
            System.out.println("Invalid country!");
            return;
        }
        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count , souvenir , team , price);
    }
}