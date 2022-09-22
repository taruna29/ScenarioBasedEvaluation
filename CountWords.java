import java.util.*;

@SuppressWarnings("unchecked") 
public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String article = sc.nextLine().toLowerCase();
        Map<String, Integer> map = new TreeMap<>();

        String[] strings = article.split("[ ,;:.?!]");

        for (String string : strings) {
            if (!string.isEmpty()) {
                map.put(string, map.getOrDefault(string, 0) + 1);
            }
        }

        int count = 0;

        for (int i : map.values()) {
            count += i;
        }

        System.out.println("Number of words " + count);
        System.out.println("Words with the count");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}