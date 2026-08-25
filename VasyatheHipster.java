//581A
import java.util.*;
public class VasyatheHipster {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int min=Math.min(a,b);
        int max=Math.max(a,b);
        System.out.println(min+" "+(max-min)/2);


        sc.close();
    }
}
