package net.jcornelio.projects.tictactoe.ai;

import java.util.Random;
import net.jcornelio.projects.tictactoe.domain.Slot;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 7, 2013
 * @version: 1.0
 **************************************************/
public class RandomTurnProvider {

    public static Slot getTurn(){
        int index  = new Random().nextInt(AvailableSlotProvider.getInstance().getAllAvailableSlots().size());
        return AvailableSlotProvider.getInstance().getAvailableSlot(index);
    }
}

