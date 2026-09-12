//2232B
import java.util.*;
public class CakeLeveling {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            long sum=0;
            long[] prefix_arr=new long[n];
            for(int j=0;j<n;j++){
                int num=sc.nextInt();
                sum+=num;
                prefix_arr[j]=sum;
            }
            long min =prefix_arr[0];
            for(int j=0;j<n;j++){
                min =Math.min(min,prefix_arr[j]/(j+1));
                System.out.print(min+" ");
            }
        }
        sc.close();
    }
}
