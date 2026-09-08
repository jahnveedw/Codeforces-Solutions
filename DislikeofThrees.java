//1560A
import java.util.*;
public class DislikeofThrees {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k=sc.nextInt();
            int counter=1;
            while(k>0){
                if(counter%3!=0 && counter%10!=3){
                    k--;
                }
                counter++;
            }
            System.out.println(counter-1);
        }




        sc.close();
    }
}
