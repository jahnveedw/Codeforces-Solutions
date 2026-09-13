//2238B
import java.util.*;
public class CrimsonTriples {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int sum=0;
            for(int j=1;j<=n;j++){
                sum+=Math.pow(n/j,2);
            }
            System.out.println(sum);
        }


        sc.close();
    }
}
