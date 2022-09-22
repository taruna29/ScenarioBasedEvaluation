import java.util.Scanner;
import java.util.StringJoiner;

class InitCap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        boolean flag = true;

        System.out.println("Enter the String:");
        str = sc.nextLine();

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; ++i) {
            String word = words[i];
            char firstLetter = word.charAt(0);
            String remaining = word.substring(1);

            if (Character.isLowerCase(firstLetter)) {
                flag = false;
                firstLetter = Character.toUpperCase(firstLetter);
                word = firstLetter + remaining;
                words[i] = word;
            }
        }

        if (!flag) {
            StringJoiner stringJoiner = new StringJoiner(" ");

            for (String word : words) {
                stringJoiner.add(word);
            }

            System.out.println(stringJoiner.toString());
        } else {
            System.out.println("First character of each word is already in uppercase");
        }
    }
}