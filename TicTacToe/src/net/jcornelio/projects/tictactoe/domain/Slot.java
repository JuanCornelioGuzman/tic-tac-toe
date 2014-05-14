package net.jcornelio.projects.tictactoe.domain;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;
import net.jcornelio.projects.tictactoe.util.Constants;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Sep 19, 2013
 * @version: 1.0
 **************************************************/
public class Slot extends JTextField {

    
    private boolean isAvailable;
    private List<Pattern> winningPatterns;
    private int index;
    
    public Slot(){
        isAvailable = true;
        winningPatterns = new ArrayList<Pattern>();
    }

    public boolean isSlotAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    public void addToWinningPattern(Pattern pattern){
        winningPatterns.add(pattern);
    }
    
    public char getSymbol(){
        try {
            return getText().charAt(0);
        }catch(Exception e){
            return Constants.BLANK_CHAR;
        }
    }
    
    public final void setSymbol(char c){
        this.setText(String.valueOf(c));
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    
}

