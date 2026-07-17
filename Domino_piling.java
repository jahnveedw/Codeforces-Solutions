//50A
import java.util.*;
public class Domino_piling {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int pieces=m*n;
        int no=0;
        while(pieces>1){
            pieces-=2;
            no++;
        }
    System.out.println(no);
    }
}
