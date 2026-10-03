//2269A
import java.util.*;
public class SauSaGeBank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int ans=(int)Math.pow(2, (n-k+1));
            System.out.println((ans+(k-1)*2));
        }

        sc.close();
    }
}
