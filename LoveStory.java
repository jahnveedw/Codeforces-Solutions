//1829A
import java.util.*;
public class LoveStory {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        String str="codeforces";
        sc.nextLine();
        for(int i=0;i<t;i++){
            String input=sc.nextLine();
            int ans=0;
            for(int j=0;j<10;j++){
                if(str.charAt(j)!=input.charAt(j)){
                    ans++;
                }
            }
            System.out.println(ans);
        }



        sc.close();
    }
}
