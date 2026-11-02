//2266B
import java.util.*;
public class ThreePiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a>=b){
                System.out.println(a+c-b);
            }else{
                if(Math.abs(a+c-b)>Math.abs(a-b)){
                    System.out.println(Math.abs(a+c-b));
                }else{
                    System.out.println(Math.abs(a-b));
                }
            }
        }


        sc.close();
    }
}
