//432A
import java.util.*;
public class ChoosingTeams {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int limit=5-k;
        int count=0;
        sc.nextLine();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(num<=limit){
                count++;
            }
        }
        System.out.println(count/3);

        sc.close();
    }
}
