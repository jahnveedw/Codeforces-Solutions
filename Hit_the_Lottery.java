//996A
import java.util.*;
public class Hit_the_Lottery{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int bills=n/100;
        n%=100;
        bills+=n/20;
        n%=20;
        bills+=n/10;
        n%=10;
        bills+=n/5;
        n%=5;
        bills+=n/1;
        System.out.println(bills);


        sc.close();
    }
}