//791A
import java.util.*;
public class Bear_and_BigBrother {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int yr=0;
        
        while(a<=b){
            a*=3;
            b*=2;
            yr++;
        }
        System.out.println(yr);
        sc.close();
    }
}
