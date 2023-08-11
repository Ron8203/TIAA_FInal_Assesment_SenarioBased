import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double heightInCentimeters = scanner.nextDouble();

        System.out.print("Enter your weight in kilograms: ");
        double weightInKilograms = scanner.nextDouble();

        double heightInMeters = heightInCentimeters / 100;

        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

                // Categorize BMI
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 24.9) {
            category = "Normal weight";
        } else if (bmi < 29.9) {
            category = "Overweight";
        } else {
            category = "Obesity";
        }

        System.out.println("Your BMI is: " + bmi);
        System.out.println("Category: " + category);
        scanner.close();

    }
}