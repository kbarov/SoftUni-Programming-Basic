import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String presentationName = scanner.nextLine();

        double averageGrade = 0;
        double finalScore = 0;
        int presentationCount = 0;

        while (!"Finish".equals(presentationName)){

            for (int i = 0; i < n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                averageGrade += grade;

            }
            presentationCount++;
            finalScore += averageGrade / n;

            System.out.printf("%s - %.2f.\n", presentationName , averageGrade / n);
            presentationName = scanner.nextLine();
            averageGrade = 0;
        }

        System.out.printf("Student's final assessment is %.2f.", finalScore / presentationCount);

    }
}
