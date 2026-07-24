//344A
import java.util.*;
public class Magnets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int grp=1;
        int prev=sc.nextInt();
        for (int i = 0; i < n-1; i++) {
            int value=sc.nextInt();
            if(value!=prev){
                grp++;
            }
            prev=value;
        }
        System.out.println(grp);
    }
}
