//2225B
import java.util.*;
public class AlternatingString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            String input=sc.nextLine();
            int pair=0;
            for(int j=1;j<input.length();j++){
                if(input.charAt(j-1)==input.charAt(j)){
                    pair++;
                }
            }
            if(pair<3){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }




        sc.close();
    }
}
