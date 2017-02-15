package net.jcornelio.projects.tictactoe.domain;

import java.util.List;
import java.util.ArrayList;
import net.jcornelio.projects.tictactoe.pattern.PatternHolder;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Sep 24, 2013
 * @version: 1.0
 **************************************************/
public class Pattern {
    
    private List<Slot> winningSlots;
    
    public Pattern(int a, int b, int c){
        winningSlots = new ArrayList<Slot>();
        populateWinningSlots(a, b, c);
    }

    private void populateWinningSlots(int a, int b, int c) {
        winningSlots.add(SlotsHolder.getInstance().getSlot(a));
        winningSlots.add(SlotsHolder.getInstance().getSlot(b));
        winningSlots.add(SlotsHolder.getInstance().getSlot(c));
    }
    
    public List<Slot> getWinningSlots() {
        return winningSlots;
    }
    
    public boolean isSlotIncluded(Slot s){
        if(winningSlots.contains(s)){
            return true;
        }
        return false;
    }
    
    public Slot getFirstSlot(){
        return winningSlots.get(0);
    }
    
    public Slot getSecondSlot(){
        return winningSlots.get(1);
    }
    
    public Slot getThirdSlot(){
        return winningSlots.get(2);
    }
    
    public boolean isMatched(List<Slot> slot){
        int count = 0;
        for(Slot s : slot){
            if(isSlotIncluded(s)){
                count++;
            }
        }
        if(count == 3){
            return true;
        }
        return false;
    }
}

