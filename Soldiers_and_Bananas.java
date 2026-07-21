//546A
import java.util.*;
public class Soldiers_and_Bananas {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int cost=0;
        for (int i = 1; i <= w; i++) {
            cost+=i*k;          
        }
        int borrow=cost-n;
        if(borrow>0){
            System.out.println(borrow);
        }
        else{
            System.out.println(0);
        }
        
        

        sc.close();
    }
}
