//96A
import java.util.*;
public class Football {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int max=1;
        char prev=input.charAt(0);
        boolean ans=false; 
        for(int i=1;i<input.length();i++){
            if(input.charAt(i)==prev){
                max++;
                if(max==7){
                    ans=true;
                    break;
                }
            }else{
                max=0;
            }
            prev=input.charAt(i);
        }
        if(ans){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        sc.close();
    }
}
