//282A
import java.util.*;
public class Bit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        sc.nextLine();
        int v=0;
        for (int i=0;i<n;i++){
            String str=sc.nextLine();

            if(str.equals("X++") || str.equals("++X")){
                v=v+1;
            }
            else if(str.equals("X--") || str.equals("--X")){
                v=v-1;
            }
            
        }
        System.out.println(v);
        

        sc.close();
    }
}
