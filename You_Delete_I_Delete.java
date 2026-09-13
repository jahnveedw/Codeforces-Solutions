//2248A
import java.util.*;
public class You_Delete_I_Delete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            String input=sc.nextLine();
            int l=-1,m=-1;
            for(int j=0;j<input.length();j++){
                if(input.charAt(j)=='0' && l==-1){
                    l=j;
                }
                if(input.charAt(j)=='1' && m==-1){
                    m=j;
                }
            }
            for(int j=0;j<input.length();j++){
                if(j!=m && j!=l){
                    System.out.print(input.charAt(j));
                }
            }
            System.out.println();
        }


        sc.close();
    }
}
