package net.jcornelio.projects.tictactoe.domain;

import javax.swing.Timer;
import net.jcornelio.projects.tictactoe.listeners.AITurnPerformer;
import net.jcornelio.projects.tictactoe.util.Constants;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 4, 2013
 * @version: 1.0
 **************************************************/
public class DukeTheAI extends Player {

    private static DukeTheAI duke;
    private Timer tmr;
    
    private DukeTheAI() {
        this.setName(Constants.AI_NAME);
        this.setStatusMessage(Constants.STATUS_PREFIX+Constants.LABEL_TURN_AI+Constants.STATUS_SUFFIX);
        tmr = new Timer(2000, new AITurnPerformer());
    }
    
    public static DukeTheAI getInstance(){
        if(duke==null){
            duke = new DukeTheAI();
        }
        return duke;
    }

    @Override
    public void performTurn() {
        tmr.start();
    }
    
    public void endTurn(){
        tmr.stop();
    }
}

