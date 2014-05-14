package net.jcornelio.projects.tictactoe.util;

import net.jcornelio.projects.tictactoe.domain.Slot;
import net.jcornelio.projects.tictactoe.gameplay.GameManager;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 7, 2013
 * @version: 1.0
 **************************************************/
public class SlotMarker {

    public static void markSlot(Slot slot){
        slot.setForeground(GameManager.getInstance().getCurrentPlayer().getSymbol().getColor());
        slot.setSymbol(GameManager.getInstance().getCurrentPlayer().getSymbol().getValue());
        slot.setIsAvailable(false);
    }
    
}

