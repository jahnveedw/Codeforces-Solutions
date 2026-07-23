//266B
import java.util.*;
public class Queue_atThe_School {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int t=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
        String new_str="";
        
        for(int j=0;j<t;j++){
            new_str="";
            for (int i = 0; i < n; i++) {
                if(i!=n-1 && str.charAt(i)=='B' && str.charAt(i+1)=='G' ){
                    new_str+="GB";
                    i++;
                }
                else{
                    new_str+=str.charAt(i);
                }
            }
            str=new_str;
        }
        System.out.println(new_str);
        sc.close();
    }
}
