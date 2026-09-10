//2258A
import java.util.*;
public class OddEraser {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int a=0,b=0;
            for(int j=0;j<n;j++){
                int num=sc.nextInt();
                if(j==0){
                    a=num;
                }
                if(j==n-1){
                    b=num;
                }
            }
            //gcd of a ,b
            while(b>0){
                int temp=a;
                a=b;
                b=temp%b;
            }
            System.out.println(a);

        }


        sc.close();
    }
}
