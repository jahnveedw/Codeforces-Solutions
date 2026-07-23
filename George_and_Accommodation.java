//467A
import java.util.*;
public class George_and_Accommodation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rooms=0;
        int p,q;
        for (int i=0;i<n;i++){
            p=sc.nextInt();
            q=sc.nextInt();
            if(q-p>=2){
                rooms++;
            }
        }
        System.out.println(rooms);

        sc.close();
    }
}
