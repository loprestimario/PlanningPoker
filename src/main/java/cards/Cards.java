package cards;
import java.util.ArrayList;

public class Cards {

    public static final String ONE = "1";
    public static final String TWO = "2";
    public static final String THREE = "3";
    public static final String FIVE = "5";
    public static final String EIGHT = "8";
    public static final String THIRTEEN = "13";
    public static final String TWENTY = "20";
    public static final String QUESTIONMARK = "?";

    private ArrayList moves;


    public Cards() {
        moves = new ArrayList();
        moves.add(ONE);
        moves.add(TWO);
        moves.add(THREE);
        moves.add(FIVE);
        moves.add(EIGHT);
        moves.add(THIRTEEN);
        moves.add(TWENTY);
        moves.add(QUESTIONMARK);

    }

    public ArrayList getCards() {

        return moves;
    }
}
