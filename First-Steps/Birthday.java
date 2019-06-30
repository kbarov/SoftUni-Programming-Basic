import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = lenght * width * height;
        double allLitres = volume * 0.001;
        double per = percent * 0.01;
        double result = allLitres * (1 - per);



        System.out.printf("%.3f", result);
    }

}