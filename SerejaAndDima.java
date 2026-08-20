import java.util.*;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> cards = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int card = sc.nextInt();
            cards.add(card);
        }

        int left = 0;
        int right = n - 1;
        int sereja = 0;
        int dima = 0;

        for(int k = 0; k < n; k++) {

            int card;

            if(cards.get(left) > cards.get(right)) {
                card = cards.get(left);
                left++;
            } else {
                card = cards.get(right);
                right--;
            }

            if(k % 2 == 0) {
                sereja += card;
            } else {
                dima += card;
            }
        }

        System.out.println(sereja + " " + dima);

        sc.close();
    }
}