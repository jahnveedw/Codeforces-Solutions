//61A
import java.util.*;
public class UltraFast_Mathematician{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        for (int i=0;i<str1.length();i++){
            if(str1.charAt(i)==str2.charAt(i)){
                System.out.print(0);
            }
            else{
                System.out.print(1);
            }
        }


        sc.close();
    }
}