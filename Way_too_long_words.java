import java.util.*;

public class Way_too_long_words{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String word=sc.nextLine();

            if(word.length()>10){
                String mid=String.valueOf(word.length()-2);
                char first_char=word.charAt(0);
                char sec_char=word.charAt(word.length()-1);
                String abrr=first_char+mid+sec_char;
                System.out.println(abrr);
            }
            else{
                System.out.println(word);
            }
        }

    sc.close();
    }
}
