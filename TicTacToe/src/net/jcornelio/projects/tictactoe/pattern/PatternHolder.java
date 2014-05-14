package net.jcornelio.projects.tictactoe.pattern;

import java.util.ArrayList;
import java.util.List;
import net.jcornelio.projects.tictactoe.domain.Pattern;
import net.jcornelio.projects.tictactoe.domain.Slot;
import net.jcornelio.projects.tictactoe.util.Constants;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 11, 2013
 * @version: 1.0
 **************************************************/
public class PatternHolder {
    
    private static PatternHolder ph;
    private List<Pattern> winningPatterns;
    
    private PatternHolder(){
        winningPatterns = new ArrayList<Pattern>();
        populateWinningPatterns();
        
    }
    
    public static PatternHolder getInstance(){
        if(ph==null){
            ph = new PatternHolder();
        }
        return ph;
    }
    
    public List<Pattern> getAllWinningPatterns(){
        return winningPatterns;
    }
    
    public List<Pattern> getPatterns(Slot s){
        List<Pattern> pattern = new ArrayList<Pattern>();
        for(Pattern p: winningPatterns){
            if(p.isSlotIncluded(s)){
                pattern.add(p);
            }
        }
        return pattern;
    }

    private void populateWinningPatterns() {
        winningPatterns.add(Constants.PATTERN_COLUMN1);
        winningPatterns.add(Constants.PATTERN_COLUMN2);
        winningPatterns.add(Constants.PATTERN_COLUMN3);
        winningPatterns.add(Constants.PATTERN_ROW1);
        winningPatterns.add(Constants.PATTERN_ROW2);
        winningPatterns.add(Constants.PATTERN_ROW3);
        winningPatterns.add(Constants.PATTERN_DIAGONAL1);
        winningPatterns.add(Constants.PATTERN_DIAGONAL2);
    }

}

