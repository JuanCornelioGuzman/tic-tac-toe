package net.jcornelio.projects.tictactoe.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.jcornelio.projects.tictactoe.ai.RandomTurnProvider;
import net.jcornelio.projects.tictactoe.domain.DukeTheAI;
import net.jcornelio.projects.tictactoe.gameplay.GameManager;
import net.jcornelio.projects.tictactoe.util.SlotMarker;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 7, 2013
 * @version: 1.0
 **************************************************/
public class AITurnPerformer implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e) {
        SlotMarker.markSlot(RandomTurnProvider.getTurn());
        GameManager.getInstance().switchPlayer();
        DukeTheAI.getInstance().endTurn();
    }

}

