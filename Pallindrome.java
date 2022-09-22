import java.util.Scanner;

class Pallindrome {
    private static boolean isCorrectInput(String word) {
        char[] chars = word.toCharArray();

        for (char ch : chars) {
            if (!Character.isLetter(ch)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word :");
        String input = sc.nextLine();
        String word = input.toLowerCase();

        if (isCorrectInput(word)) {
            String reverse = new StringBuffer(word).reverse().toString();
            boolean isPalindrome = word.equals(reverse);

            if (isPalindrome) {
                System.out.println(input + " is a palindrome");
            } else {
                System.out.println(input + " is not a palindrome");
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}
