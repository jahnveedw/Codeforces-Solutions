//59A
import java.util.*;
public class Word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int lower=0;
        int upper=0;
        for (int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                lower++;
            }
            else{
                upper++;
            }
        }
        if(lower>=upper){
            System.out.println(str.toLowerCase());
        }
        else{
            System.out.println(str.toUpperCase());
        }
    }
}
