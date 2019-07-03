import java.util.Scanner;

public class Time15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        min = min + 15;

        if (min >= 60) {
            min = min - 60;
            hour = hour + 1;

        }

        if (hour > 23) {
            hour = hour - 24;
        }
        if (min < 10) {
            System.out.println(hour + ":" + "0" + min);
        }else if (min >= 10) {
            System.out.println(hour + ":" + min);
        }

    }
}


