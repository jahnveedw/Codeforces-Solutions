//2250A
import java.util.*;
public class ThresholdMovement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int l=Integer.MAX_VALUE,m=0;
            for(int j=0;j<n;j++){
                int num=sc.nextInt();
                if(j%2==0 && num<l){
                    l=num;
                }
                if(j%2!=0 && num>m){
                    m=num;
                }
            }
            if(n%2==0 && (l-m)>1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }


        sc.close();
    }
}
