//1878A
import java.util.*;
public class HowMuchDoesDaytonaCost {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            boolean ans=false;
            int n=sc.nextInt();
            int k=sc.nextInt();
            for(int j=0;j<n;j++){
                int element=sc.nextInt();
                if(element==k){
                    ans=true;
                }
            }
        if(ans){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        }


        sc.close();
    }
}
