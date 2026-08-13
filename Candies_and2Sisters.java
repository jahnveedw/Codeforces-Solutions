//1335A
import java.util.*;
public class Candies_and2Sisters {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        int less,high,cases;
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            if(n%2==0){
                less=n/2;
                high=n-1;
                cases=high-less;
            }
            else{
                less=(n+1)/2;
                high=n-1;
                cases=high-less+1;
            }
            System.out.println(cases);
        }
        

        sc.close();
    }
}
