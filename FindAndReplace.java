import java.util.Scanner;

class FindAndReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence, word, replacement;

        System.out.println("Enter the string:");
        sentence = sc.nextLine();

        System.out.println("Enter the word to be searched:");
        word = sc.nextLine();

        System.out.println("Enter the word to be replaced:");
        replacement = sc.nextLine();

        String replacedSentence = sentence.replace(word, replacement);

        if (replacedSentence.equals(sentence)) {
            System.out.println("The word " + word + " not found");
        } else {
            System.out.println(replacedSentence);
        }
    }
}