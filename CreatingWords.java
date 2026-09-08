//1985A
import java.util.*;
public class CreatingWords {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String a=sc.next();
            String b=sc.next();
            System.out.println(b.charAt(0)+a.substring(1)+" "+a.charAt(0)+b.substring(1));
        }



        sc.close();
    }
}
