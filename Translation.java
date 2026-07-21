//41A
import java.util.*;
public class Translation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String c="";
        for (int i = str1.length()-1; i >=0 ;i--) {
            c+=str1.charAt(i);
        }
        if(c.equals(str2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        sc.close();
    }
}
