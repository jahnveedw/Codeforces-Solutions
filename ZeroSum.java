//2247A
import java.util.*;
public class ZeroSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for( int i=0;i<t;i++){
            int n=sc.nextInt();
            int ones=0;
            for(int j=0;j<n;j++){
                int num=sc.nextInt();
                if(num==1){
                    ones++;
                }
            }
            if(n%2==0 && ones%2==(n/2)%2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }




        sc.close();
    }
}
