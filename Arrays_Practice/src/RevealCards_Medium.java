import java.util.Arrays;
import java.util.Random;

public class RevealCards_Medium {
    public static void main(String[] args) {
        int initial_deck[] = {17,13,11,2,3,5,7};
        int result[] = new RevealCards_Medium().deckRevealedIncreasing(initial_deck);

        for (int i:
             result) {
            System.out.println(i);
        }
    }

    public int[] shuffledeck(int[] val)
    {
        Random r  = new Random();
        for (int i = 1; i < val.length; i++)
        {
            int r_index = r.nextInt(i);

            int temp = val[i];
            val[i] = val[r_index];
            val[r_index] = temp;
        }
        return val;
    }

    public int[] deckRevealedIncreasing(int[] deck) {
        int sorted[] = deck;
        int temp;

//      Sorting the deck
        for (int i = 0; i < deck.length; i++)
        {
            for (int j = i + 1; j < deck.length; j++)
            {
                if (sorted[i] > sorted[j])
                {
                    temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }

        int[] result_deck;
        result_deck = shuffledeck(deck);
        int count = 0;
        for (int i = 0; i < deck.length; i++)
        {
            for (int j = 0; j < deck.length; j++) {
                if ((result_deck[j] == sorted[i])) {
                    count++;
                }
            }
            while (count + 1 == deck.length)
            {
                shuffledeck(deck);
            }
        }
        System.out.println("Deck Length:" + deck.length + ", Count: "  + count);

//


        return result_deck;
    }
}
