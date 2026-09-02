//1409A
import java.util.*;
public class YetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int diff=Math.abs(b-a);
            int moves = (diff + 9) / 10;
            System.out.println(moves);
        }


        sc.close();
    }
}
