import java.util.Scanner;
import java.util.StringJoiner;

class CumulativeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter number of elements");
        n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Range");
        } else {
            int sum = 0;
            StringJoiner stringJoiner = new StringJoiner(" ");

            System.out.println("Enter the elements");

            for (int i = 0; i < n; ++i) {
                int no = sc.nextInt();
                sum += no;
                stringJoiner.add(String.valueOf(sum));
            }

            System.out.println(stringJoiner.toString());
        }
    }
}
