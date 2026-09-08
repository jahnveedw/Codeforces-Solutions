//490A
import java.util.*;
public class TeamOlympiad {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int n=sc.nextInt();
        int ones=0,twos=0,threes=0;
        ArrayList<Integer> one=new ArrayList<>();
        ArrayList<Integer> two=new ArrayList<>();
        ArrayList<Integer> three=new ArrayList<>();
        for (int i = 0; i <n; i++) {
            int num=sc.nextInt();
            if(num==1){
                ones++;
                one.add(i+1);
            }else if(num==2){
                twos++;
                two.add(i+1);
            }else{
                threes++;
                three.add(i+1);
            }
        }
        int min_teams=Math.min(ones,Math.min(twos,threes));
        System.out.println(min_teams);
        int counter=0;
        while(min_teams>0){
            System.out.println(one.get(counter)+" "+two.get(counter)+" "+three.get(counter));
            counter++;
            min_teams--;
        }


        sc.close();
    }
}
