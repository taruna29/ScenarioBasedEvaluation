import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id;
        Pattern pattern = Pattern.compile("^GBL/\\d{3}/\\d{4}$");

        System.out.println("Enter your ID");
        id = sc.next();

        Matcher matcher = pattern.matcher(id);

        if (matcher.matches()) {
            System.out.println("Login success");
        } else {
            System.out.println("Incorrect ID");
        }
    }
}
