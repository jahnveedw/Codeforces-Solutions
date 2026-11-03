//2210B
import java.util.*;
public class SimplySittingOnChairs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int[] p=new int[n];
            boolean[] ans=new boolean[n];
            int sit=0;
            for(int j=0;j<n;j++){
                int  ele=sc.nextInt();
                p[j]=ele-1;
            }
            for(int j=0;j<n;j++){
                if(ans[j]==false ){
                    if(p[j]>j ){continue;}
                    ans[p[j]]=true;
                    sit++;
                }else{
                    break;
                }
            }
            System.out.println(sit);
        }



        sc.close();
    }
}
