package Activity9;
import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard9 extends Board9 {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard9() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		return containsPairSum11(selectedCards) || containsJQK(selectedCards);
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
//		System.out.println("NEW MOVE");
		List<Integer> selected = new ArrayList<Integer>();
		List<Integer> cardI = cardIndexes();
		for (int i=0; i<cardI.size()-2; i++) {
			selected.add(cardI.get(i));
			for (int j=i+1; j<cardI.size()-1; j++) {
				selected.add(cardI.get(j));
//				System.out.println(cardAt(selected.get(0)).pointValue() + " " + cardAt(selected.get(1)).pointValue());
				if (containsPairSum11(selected)) return true;
				for (int k=j+1; k<cardI.size(); k++) {
					selected.add(cardI.get(k));
					if (containsJQK(selected)) return true;
					int temp = selected.remove(0);
					if (containsPairSum11(selected)) return true;
					selected.add(0, temp);
					selected.remove(2);
				}
				selected.remove(1);
			}
			selected.remove(0);
		}
		return false;
	}

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containsPairSum11(List<Integer> selectedCards) {
		return selectedCards.size() == 2 && cardAt(selectedCards.get(0)).pointValue() + cardAt(selectedCards.get(1)).pointValue() == 11;
	}

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) {
		if (selectedCards.size() != 3) return false;
		int c0 = cardAt(selectedCards.get(0)).pointValue();
		int c1 = cardAt(selectedCards.get(1)).pointValue();
		int c2 = cardAt(selectedCards.get(2)).pointValue();
		String r0 = cardAt(selectedCards.get(0)).rank();
		String r1 = cardAt(selectedCards.get(1)).rank();
		String r2 = cardAt(selectedCards.get(2)).rank();
		return c0+c1+c2 == 0 && !(r0.equals(r1) || r0.equals(r2) || r1.equals(r2)); // if 3 cards aren't the same and add to 36 they must be 11, 12, and 13
	}
}
