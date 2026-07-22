//116A
import java.util.*;
public class Tram {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int space=0;
        int capacity=0;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            space-=a;
            space+=b;
            if(space>capacity){
                capacity=space;
            }

        }
        System.out.println(capacity);



        sc.close();
    }
}
