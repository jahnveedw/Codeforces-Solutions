//1915A
import java.util.*;
public class OddOneOut {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int unique;
            if(b==c){
                unique=a;
            }else if(a==c){
                unique=b;
            }else{
                unique=c;
            }
            System.out.println(unique);
        }
        





        sc.close();
    }
}
