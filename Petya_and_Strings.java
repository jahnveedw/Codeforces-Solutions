//112A
import java.util.*;
public class Petya_and_Strings{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine().toLowerCase();
        String str2=sc.nextLine().toLowerCase();
        int difference=str1.compareTo(str2);
        if(difference==0){
            System.out.println(0);
        }
        if(difference<0){
            System.out.println(-1);
        }
        if(difference>0){
            System.out.println(1);
        }

        sc.close();
    }
}