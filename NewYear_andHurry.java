//750A
import java.util.*;
public class NewYear_andHurry {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int time=0;
        int p=0;
        for (int i = 1; i <= n; i++) {
            time+=5*i;
            if(time>240-k){
                break;
            }
            p++;
        }
        System.out.println(p);



        sc.close();
    }
}
