import java.util.Scanner;

public class Graduation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double sum = 0;
        double years = 1;
        int notPassed = 0;

        while (years <= 12 && notPassed < 2) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4.00) {
                sum += grade;

                years++;
            } else {
                notPassed += 1;
            }
        }
        double average = sum / 12;

        if (notPassed < 2) {
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        } else {
            System.out.printf("%s has been excluded at %.0f grade", name , years);
        }
    }
}
