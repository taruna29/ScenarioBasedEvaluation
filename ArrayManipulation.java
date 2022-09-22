import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayManipulation {
    public String getPrice() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");
        int no = sc.nextInt();
        int[] arr = new int[no];

        System.out.println("Enter the price details");

        for (int i = 0; i < no; ++i) {
            try {
                arr[i] = sc.nextInt();
            } catch (InputMismatchException ignore) {
                return "Input was not in the correct format";
            }
        }

        System.out.println("Enter the index you want to access");

        try {
            int index = sc.nextInt();
            return "The array element is " + arr[index];
        } catch (InputMismatchException ignore) {
            return "Input was not in the correct format";
        } catch (ArrayIndexOutOfBoundsException ignore) {
            return "Array index is out of range";
        }
    }

    public static void main(String[] args) {
        System.out.println(new ArrayManipulation().getPrice());
    }
}
