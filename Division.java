//1669A
import java.util.*;
public class Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            int div=sc.nextInt();
            if(div>=1900){
                System.out.println("Division 1");
            }else if(div>=1600){
                System.out.println("Division 2");
            }else if(div>=1400){
                System.out.println("Division 3");
            }else {
                System.out.println("Division 4");
            }
        }

        sc.close();
    }
}
