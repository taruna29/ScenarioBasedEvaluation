import java.util.Scanner;

public class AverageAge {
    private static double calculateAverage(int[] age) {
        double sum = 0.0;
        
        for (int i : age) {
            sum += i;
        }

        return sum / (double) age.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total no.of employees:");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Please enter a valid employee count");
        } else {
            System.out.println(String.format("Enter the age for %d employees:", n));
            
            int[] age = new int[n];
            boolean allValidAge = true;

            for (int i = 0; i < n; ++i) {
                int a = sc.nextInt();

                if (a < 28 || a > 40) {
                    allValidAge = false;
                    break;
                }

                age[i] = a;
            }


            if (allValidAge) {
                double average = calculateAverage(age);
                System.out.println(String.format("The average age is %.2f", average));
            } else {
                System.out.println("Invalid age encountered!");
            }
        }
    }
}