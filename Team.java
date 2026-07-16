//231A
import java.util.*;
public class Team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        sc.nextLine();
        
        int ans=0;
        for (int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<3;j++){
                int value=sc.nextInt();
                sum=sum+value;
                
            }
            if (sum>=2){
                ans=ans+1;
        }   
        }
        System.out.println(ans);


        sc.close();
    }
}
