//32B
import java.util.*;
public class Borze {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input=sc.nextLine();
        String str="";
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='.'){
                System.out.print(0);
            }else{
                if(input.charAt(i+1)=='.'){
                    System.out.print(1);
                }else{
                    System.out.print(2);
                }
                i++;
            }
        }

        sc.close();
    }
}
