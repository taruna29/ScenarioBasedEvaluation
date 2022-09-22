import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringJoiner;

public class ListPrimeNumbers {
    private static boolean isPrime(int no) {
        if (no < 2) {
            return false;
        } else if (no == 2) {
            return true;
        } else {
            for (int i = 2; i <= (int) Math.sqrt(no); ++i) {
                if (no % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int start = sc.nextInt();
        int end = sc.nextInt();

        if (start <= 0 || start >= end) {
            System.out.println("Provide valid input");
        } else {
            StringJoiner stringJoiner = new StringJoiner(" ");

            while (start <= end) {
                if (isPrime(start)) {
                    stringJoiner.add(String.valueOf(start));
                }

                ++start;
            }

            System.out.println(stringJoiner.toString());
        }
    }
}
