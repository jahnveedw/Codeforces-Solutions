//723A
import java.util.*;
public class newYear_meetingFriends {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=Math.max(b,Math.max(a,c));
        int min=Math.min(b,Math.min(a,c));
        System.out.println(max-min);


        sc.close();
    }
}
