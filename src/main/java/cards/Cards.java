package cards;
import java.util.ArrayList;

public class Cards {

    public static final Integer ONE = 1;
    public static final Integer TWO = 2;
    public static final Integer THREE = 3;
    public static final Integer FIVE = 5;
    public static final Integer EIGHT = 8;
    public static final Integer THIRTEEN = 13;
    public static final Integer TWENTY = 20;
    public static final String QUESTIONMARK = "?";

    private ArrayList moves;

    public Cards() {
        moves = new ArrayList<Object>();
        moves.add(ONE);
        moves.add(TWO);
        moves.add(THREE);
        moves.add(FIVE);
        moves.add(EIGHT);
        moves.add(THIRTEEN);
        moves.add(TWENTY);
        moves.add(QUESTIONMARK);

    }

    public ArrayList<Object> returnCard() {

        return moves;
    }
}
