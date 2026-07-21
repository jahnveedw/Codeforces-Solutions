//734A
import java.util.*;
public class Anton_andDanik {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        int danik = 0, anton = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='A'){
                anton++;
            }
            else{
                danik++;
            }
        }
        if(anton>danik){
            System.out.println("Anton");
        }
        else if(anton<danik){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
    }
}
