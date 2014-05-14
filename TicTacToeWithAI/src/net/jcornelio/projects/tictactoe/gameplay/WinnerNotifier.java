package net.jcornelio.projects.tictactoe.gameplay;

import java.util.ArrayList;
import java.util.List;
import net.jcornelio.projects.tictactoe.domain.Pattern;
import net.jcornelio.projects.tictactoe.domain.Player;
import net.jcornelio.projects.tictactoe.domain.Slot;
import net.jcornelio.projects.tictactoe.domain.SlotsHolder;
import net.jcornelio.projects.tictactoe.pattern.PatternHolder;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 11, 2013
 * @version: 1.0
 **************************************************/
public class WinnerNotifier {

    public static boolean hasWon(Player player) {
        
        char symbol = player.getSymbol().getValue();
        System.out.println("Symbol is "+symbol);
        
        List<Slot> slotsWithGivenSymbol = new ArrayList<Slot>();
        
        for(Slot s : SlotsHolder.getInstance().getAllSlots()){
            if(s.getSymbol() == symbol){
                slotsWithGivenSymbol.add(s);
            }
        }
            
        for(Pattern p: PatternHolder.getInstance().getAllWinningPatterns()){
            if(p.isMatched(slotsWithGivenSymbol)){
                return true;
            }
        }
        
        return false;
        
    }
    
}

