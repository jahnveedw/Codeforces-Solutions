//520A --again (boolean method)
import java.util.*;
public class Pangram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Character> arr = new ArrayList<>(List.of('a', 'b', 'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
        int n=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
        String str_lower=str.toLowerCase();
        for (int i = 0; i < n; i++) {
            arr.remove(Character.valueOf(str_lower.charAt(i)));
        }
        if(arr.isEmpty()){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }


        sc.close();
    }
}
