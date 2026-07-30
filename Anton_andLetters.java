//443A
import java.util.*;
public class Anton_andLetters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Character> set=new HashSet<>();
        String str=sc.nextLine();
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)!='{' && str.charAt(i)!='}' && str.charAt(i)!=',' && str.charAt(i)!=' '){
                set.add(str.charAt(i));
            }
        }
        System.out.println(set.size());

        sc.close();
    }
}
