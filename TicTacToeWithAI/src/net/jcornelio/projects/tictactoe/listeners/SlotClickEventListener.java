package net.jcornelio.projects.tictactoe.listeners;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import net.jcornelio.projects.tictactoe.domain.Slot;
import net.jcornelio.projects.tictactoe.domain.SlotsHolder;
import net.jcornelio.projects.tictactoe.domain.User;
import net.jcornelio.projects.tictactoe.gameplay.GameManager;
import net.jcornelio.projects.tictactoe.gameplay.WinnerNotifier;
import net.jcornelio.projects.tictactoe.util.SlotMarker;
import net.jcornelio.projects.tictactoe.util.Constants;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 2, 2013
 * @version: 1.0
 **************************************************/
public class SlotClickEventListener extends MouseAdapter{

    private Slot slot;
    
    public SlotClickEventListener(Slot slot) {
        this.slot = slot;
        SlotsHolder.getInstance().addToSlots(slot);
    }

    @Override
    public void mousePressed(MouseEvent evt) { 
        if(GameManager.getInstance().getCurrentPlayer()!=null
           && GameManager.getInstance().getCurrentPlayer() instanceof User
           && !WinnerNotifier.hasWon(GameManager.getInstance().getCurrentPlayer())){
            if(slot.isSlotAvailable()){
                SlotMarker.markSlot(slot);
                GameManager.getInstance().getCurrentPlayer().addToMarkedSlots(slot);
                GameManager.getInstance().getCurrentPlayer().performTurn();
            }else{
                JOptionPane.showMessageDialog(null, Constants.MSG_SLOT_MARKED, Constants.TITLE_ALERT, JOptionPane.WARNING_MESSAGE);
            }
        }
        
    }
}

