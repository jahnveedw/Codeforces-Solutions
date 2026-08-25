//1999A
import java.util.*;
public class APlusB_Again{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int num=sc.nextInt();
            System.out.println(num%10+num/10);
        }


        sc.close();
    }
}
