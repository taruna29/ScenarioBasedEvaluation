import java.util.Scanner;

public class NumerologyNumber {
    private static int getSum(long no) {
        char[] chars = Long.toString(no).toCharArray();
        int sum = 0;

        for (char ch : chars) {
            sum += Character.digit(ch, 10);
        }

        return sum;
    }

    private static int getNumerology(long no) {
        String str= String.valueOf(no);

        while (str.length() != 1) {
            str = String.valueOf(getSum(Long.parseLong(str)));
        }

        return Integer.parseInt(str);
    }

    private static int getOddCount(long no) {
        int oddCount = 0;

        for (char ch : Long.toString(no).toCharArray()) {
            if (Character.digit(ch, 10) % 2 != 0) {
                ++oddCount;
            }
        }

        return oddCount;
    }

    private static int getEvenCount(long no) {
        int evenCount = 0;

        for (char ch : Long.toString(no).toCharArray()) {
            if (Character.digit(ch, 10) % 2 == 0) {
                ++evenCount;
            }
        }

        return evenCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        long num = sc.nextLong();

        System.out.println("Sum of digits");
        System.out.println(getSum(num));

        System.out.println("Numerology number");
        System.out.println(getNumerology(num));

        System.out.println("Number of odd numbers");
        System.out.println(getOddCount(num));

        System.out.println("Number of even numbers");
        System.out.println(getEvenCount(num));
    }
}