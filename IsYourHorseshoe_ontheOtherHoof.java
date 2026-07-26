//228A
import java.util.*;
public class IsYourHorseshoe_ontheOtherHoof {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> set=new HashSet<>(); 
        for(int i=0;i<4;i++){
            int n=sc.nextInt();
            set.add(n);
        }
        System.out.println(4-set.size());

        sc.close();
    }
}
