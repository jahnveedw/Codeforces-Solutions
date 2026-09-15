//2075A
import java.util.*;
public class ToZero {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int large_even,large_odd;
            if(k%2==0){
                large_even=k;
                large_odd=k-1;
            }else{
                large_even=k-1;
                large_odd=k;
            }
            int ans=0;
            while(n>0){
                if(n%2==0){
                    ans+=(n+large_even-1)/large_even;
                    break;
                }else{
                    n-=large_odd;
                    ans++;
                }
            }
            System.out.println(ans);
        }


        sc.close();
    }
}
