//1857A
import java.util.*;
public class ArrayColoring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int even_sum=0;
            int odd_sum=0;
            int n =sc.nextInt();
            for(int j=0;j<n;j++){
                int element=sc.nextInt();
                if(element%2==0){
                    even_sum+=element;
                }else{
                    odd_sum+=element;
                }
            }
            if(even_sum%2==0 && odd_sum%2==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }


        sc.close();
    }
}
