import java.util.Scanner;
import java.util.StringJoiner;

class FindFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        no = Math.abs(no);

        if (no == 0) {
            System.out.println("No Factors");
        } else {
            StringJoiner stringJoiner = new StringJoiner(", ");

            for (int i = 1; i <= no; ++i) {
                if (no % i == 0) {
                    stringJoiner.add(String.valueOf(i));
                }
            }

            System.out.println(stringJoiner.toString());
        }
    }
}