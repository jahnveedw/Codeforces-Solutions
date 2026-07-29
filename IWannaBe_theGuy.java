//469A
import java.util.*;
public class IWannnaBe_theGuy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        HashSet<Integer> set=new HashSet<>();
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            int p=sc.nextInt();
            set.add(p);
        }
        int y=sc.nextInt();
        for(int j=0;j<y;j++){
            int p=sc.nextInt();
            set.add(p);
        }
        if(set.size()==n){
            System.out.println("I become the guy.");
        }
        else{
            System.out.println("Oh, my keyboard!");
        }

        sc.close();
    }
}
