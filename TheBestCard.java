//2253A
import java.util.*;
public class TheBestCard {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int num=n+1;
            boolean ans=true;
            for(int k=2;k<=Math.sqrt(num);k++){
                if(num%k==0){
                    ans=false;
                    break;
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
