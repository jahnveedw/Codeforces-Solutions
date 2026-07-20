//266A
import java.util.*;
public class Stones_onthe_Table {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
        int stones=0;
        for (int i = 0; i < num-1; i++) {
            if(str.charAt(i)==str.charAt(i+1)){

                stones++; 
            }
        }
        
        System.out.println(stones);
        sc.close();
    }
}
