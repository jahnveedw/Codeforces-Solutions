//271A
import java.util.*;

public class Beautiful_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        while (true) {
            year++;
            Set<Character> set = new HashSet<>();

            String s = String.valueOf(year);

            for (int i = 0; i < s.length(); i++) {
                set.add(s.charAt(i));
            }

            if (set.size() == 4) {
                System.out.println(year);
                break;
            }
        }

        sc.close();
    }
}