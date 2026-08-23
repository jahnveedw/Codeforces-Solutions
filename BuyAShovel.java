//732A
import java.util.*;
public class BuyAShovel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cost=sc.nextInt();
        int r=sc.nextInt();
        int count=1;
        while((cost*count)%10!=r && (cost*count)%10!=0){
            count++;
        }
        System.out.println(count);

        sc.close();
    }
}
