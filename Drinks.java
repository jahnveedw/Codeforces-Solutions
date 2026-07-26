//200B
import java.util.*;
public class Drinks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        float t=0;
        for (int i=0; i < n; i++) {
            float v=sc.nextFloat();
            t+=v;
        }
        float percent=t/n;
        System.out.println(percent);



        sc.close();
    }
}
