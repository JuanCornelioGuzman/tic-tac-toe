package net.jcornelio.projects.tictactoe.pattern;

import net.jcornelio.projects.tictactoe.domain.Pattern;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 11, 2013
 * @version: 1.0
 **************************************************/
public class PatternEvaluator {
    
    char mySymbol = 'X';
    char oppSymbol = 'O';

    public int getPatternScore(Pattern p) {
        
        int score = 0;
        
        score = getFirstSlotScore(p, score);
        score = getSecondSlotScore(p, score);
        score = getThirdSlotScore(p, score);

        return score;
     }
    
    private int getFirstSlotScore(Pattern p, int score){
        if(p.getFirstSlot().getSymbol() ==  mySymbol) {
            score = 1;
        } else if ( p.getFirstSlot().getSymbol() == oppSymbol) {
            score = -1;
        }
        return score;
    }

    private int getSecondSlotScore(Pattern p, int score) {
        if (p.getSecondSlot().getSymbol() == mySymbol) {
           if (score == 1) {   // cell1 is mySeed
                score = 10;
           } else if (score == -1) {  // cell1 is oppSeed
                return 0;
           }
        } else if (p.getSecondSlot().getSymbol() == oppSymbol) {
           if (score == -1) { // cell1 is oppSeed
              score = -10;
           } else if (score == 1) { // cell1 is mySeed
              return 0;
           }
        }
        return score;
    }

    private int getThirdSlotScore(Pattern p, int score) {
        if (p.getThirdSlot().getSymbol() == mySymbol) {
           if (score > 0) {  // cell1 and/or cell2 is mySeed
              score *= 10;
           } else if (score < 0) {  // cell1 and/or cell2 is oppSeed
              return 0;
           } 
        } else if (p.getThirdSlot().getSymbol() == oppSymbol) {
           if (score < 0) {  // cell1 and/or cell2 is oppSeed
              score *= 10;
           } else if (score > 1) {  // cell1 and/or cell2 is mySeed
              return 0;
           } 
        }
        return score;
    }
    
}

