//past contest
import java.util.*;
public class MinusTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int max,odd=0,modulo_0=0,modulo_2=0;
            for(int j=0;j<n;j++){
                int num=sc.nextInt();
                if(num%2!=0){
                    odd++;
                }else{
                    if(num%4==0){
                        modulo_0++;
                    }
                    if(num%4==2){
                        modulo_2++;
                    }
                }
            }
            max=Math.max(modulo_0,Math.max(odd,modulo_2));
            System.out.println(max);
        }



        sc.close();
    }
}
