//510A --again
import java.util.*;
public class Fox_and_Snakes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String str1="#";
        String str2=".";
        String[] arr={str1.repeat(m),str2.repeat(m-1)+str1,str1.repeat(m),str1+str2.repeat(m-1)};
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.println(str1.repeat(m));
            }
            else{
                if((i/2)%2==0){
                    System.out.println(str2.repeat(m-1)+str1);
                }
                else{
                    System.out.println(str1+str2.repeat(m-1));
                }
            }
        }
        sc.close();
    }
}
