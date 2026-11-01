//1367A
import java.util.*;
public class ShortSubstrings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            String input=sc.nextLine();
           StringBuilder ans = new StringBuilder();
           ans.append(input.charAt(0));
           for (int j = 2; j < input.length(); j += 2) {
                ans.append(input.charAt(j));
           }
           ans.append(input.charAt(input.length()-1));
           System.out.println(ans);
        }
        sc.close();
    }
}
