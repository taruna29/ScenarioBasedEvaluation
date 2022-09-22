import java.util.Scanner;

public class PalindromeNumber {
    private static boolean isPalindrome(int no) {
        String numString = String.valueOf(no);
        int size = numString.length();

        for (int i = 0; i < size / 2; ++i) {
            if (numString.charAt(i) != numString.charAt(size - i -1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Invalid Input");
        } else {
            if (isPalindrome(num)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
        }
    }
}