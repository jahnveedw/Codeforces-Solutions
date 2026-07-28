//705A
import java.util.*;
public class Hulk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        String str="";

        for(int i=0;i<n;i++){
            if(i%2==0){
                str+="I hate";
            }
            else {
                str+="I love";
            }
            if(i!=n-1){
                str+=" that ";
            }
            else {
                str+=" it ";
            }
            
        }
        System.out.println(str);


        sc.close();
    }
}
