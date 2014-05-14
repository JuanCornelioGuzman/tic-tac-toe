package net.jcornelio.projects.tictactoe.domain;

import java.util.ArrayList;
import java.util.List;
import net.jcornelio.projects.tictactoe.util.Constants;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 2, 2013
 * @version: 1.0
 **************************************************/
public class SlotsHolder {
    
    private static SlotsHolder slotHolder;
    private List<Slot> slots;
    
    private SlotsHolder(){
        slots = new ArrayList<Slot>();
    }
    
    public static SlotsHolder getInstance(){
        if(slotHolder==null){
            slotHolder = new SlotsHolder();
        }
        return slotHolder;
    }
    
    public void addToSlots(Slot s){
        slots.add(s);
    }
    
    public List<Slot> getAllSlots(){
        return slots;
    }
    
    public Slot getSlot(int index){
        return slots.get(index);
    }
    
    public void clearSlot(int index){
        slots.get(index).setIsAvailable(true);
        slots.get(index).setText(Constants.BLANK_STRING);
    }
    
    public void clearSlot(Slot s){
        s.setIsAvailable(true);
        s.setText(Constants.BLANK_STRING);
    }
    
    public void clearAllSlots(){
        for(Slot slot: slots){
            clearSlot(slot);
        }
    }

}

