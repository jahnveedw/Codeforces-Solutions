//9A
import java.util.*;
public class DieRoll {
    public static void main(String[]  args){
        Scanner sc= new Scanner(System.in);
        int y=sc.nextInt();
        int w=sc.nextInt();
        int num=7-Math.max(y,w);
        int n=6;
        if(num%2==0){
            num/=2;
            n/=2;
        }
        if(num%3==0){
            num/=3;
            n/=3;
        }
        System.out.println(num+"/"+n);
        sc.close();
    }
}
