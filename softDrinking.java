//151A
import java.util.*;
public class softDrinking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();
        int mls=k*l/nl;
        int slice=c*d;
        int salt=p/np;
        int drinks=(Math.min(mls,Math.min(slice,salt)))/n;
        System.out.println(drinks);


        sc.close();
    }
}
