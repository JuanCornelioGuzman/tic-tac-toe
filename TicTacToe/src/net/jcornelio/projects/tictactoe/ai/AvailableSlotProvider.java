package net.jcornelio.projects.tictactoe.ai;

import java.util.ArrayList;
import java.util.List;
import net.jcornelio.projects.tictactoe.domain.Slot;
import net.jcornelio.projects.tictactoe.domain.SlotsHolder;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Sep 19, 2013
 * @version: 1.0
 **************************************************/
public class AvailableSlotProvider {
    
    private List<Slot> availableSlots;
    private static AvailableSlotProvider availSlotProvider;
    
    private AvailableSlotProvider(){
        availableSlots = new ArrayList<Slot>();
    }
    
    public static AvailableSlotProvider getInstance(){
        if(availSlotProvider==null){
            availSlotProvider = new AvailableSlotProvider();
        }
        return availSlotProvider;
    }
        
    public List<Slot> getAllAvailableSlots(){
        generateAvailableSlots();
        return availableSlots;
    }
    
    public Slot getAvailableSlot(int index) {
        generateAvailableSlots();
        return availableSlots.get(index);
    }

    private void generateAvailableSlots() {
        availableSlots.clear();
        for(Slot slt: SlotsHolder.getInstance().getAllSlots()){
            if(slt.isSlotAvailable()){
                availableSlots.add(slt);
            }               
        }
    }
}

