import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());

        double averageGrade = Double.parseDouble(scanner.nextLine());
        double minWage = Double.parseDouble(scanner.nextLine());

        double socialScholarship = minWage * 0.35;
        double scholarshipForExcellence = averageGrade * 25;

        if (averageGrade <= 4.50) {

            System.out.println("You cannot get a scholarship!");

        } else if (averageGrade > 4.50 && averageGrade < 5.50 && income >= minWage) {

            System.out.println("You cannot get a scholarship!");

        } else if (averageGrade > 4.5 && averageGrade < 5.5 && income < minWage) {

            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship));

        } else if (averageGrade >= 5.5 && income < minWage && socialScholarship <= scholarshipForExcellence) {

            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(scholarshipForExcellence));

        } else if (averageGrade >= 5.5 && income < minWage && socialScholarship > scholarshipForExcellence) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship));

        } else if (averageGrade >= 5.5 && income >= minWage) {

            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(scholarshipForExcellence));

        }


    }
}
