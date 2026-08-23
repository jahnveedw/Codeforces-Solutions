//1676A
import java.util.*;
public class Lucky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String input=sc.nextLine();
            int sum1=0;
            int sum2=0;
            for(int j=0;j<6;j++){
                if(j<=2){
                    sum1+=input.charAt(j)-'0';
                }else{
                    sum2+=input.charAt(j)-'0';
               }
            }
            if(sum1==sum2){System.out.println("YES");}
            else{System.out.println("NO");}
        }
        sc.close();
    }
}
