package poker;

import java.util.ArrayList;

public class Rules {

    void estimate(ArrayList<Object> playedCards){

        double estimation;

        if (containsQuestionMark(playedCards)){
            System.out.println("\nestimation: ? ");

        }
        else{
            estimation= makeAverage(playedCards);
            if(estimation>=13)
                System.out.println("\nestimation: " + (int)(estimation) + "   We need to split the task");
            else
                System.out.println("\nestimation: " + (int)(estimation));

        }

    }

    public boolean containsQuestionMark(ArrayList<Object> playedCards){
        boolean questionMark= false;
        for (int i = 0; i < playedCards.size(); i++) {
            if(playedCards.get(i).equals("?")){
                questionMark= true;
            }
        }
        return questionMark;
    }

    public double makeAverage(ArrayList<Object> playedCards){
        float average=0;
      int sum = 0;
        Object card;
        for (int i = 0; i < playedCards.size(); i++) {

            card = playedCards.get(i);
            String s =card.toString();
            Integer s1= Integer.valueOf(s);
            sum = sum + s1;
        }
        average= (float)(sum)/playedCards.size();
        return Math.ceil(average);
    }
}
