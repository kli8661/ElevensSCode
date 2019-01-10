package Activity2;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        String[] suits = {"Diamonds","Clubs","Hearts","Spades"};
        String[] ranks = {"1","2","3","4"};
        int[] pointValues = {1,2,3,4};
        Deck x = new Deck(suits,ranks,pointValues);
        System.out.println(x.deal());
//        x.shuffle();
//        while(x.size()>0)
//        {
//            System.out.println(x.deal());
//        }
    }
}

