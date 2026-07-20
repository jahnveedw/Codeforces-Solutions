//339A
import java.util.*;
public class Helpful_maths{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i =0;i<str.length();i+=2){
            int num=Character.getNumericValue(str.charAt(i));
            list.add(num);
        }
        Collections.sort(list);
        for(int j=0;j<list.size();j++){
            System.out.print(list.get(j));
            if(j!=list.size()-1){
                System.out.print("+");
            }
        }
        sc.close();
    }
}
