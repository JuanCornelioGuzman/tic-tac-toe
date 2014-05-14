package net.jcornelio.projects.calculator.controllers;

import java.util.HashMap;
import javax.swing.JButton;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Sep 19, 2013
 * @version: 1.0
 **************************************************/
public class ButtonController {
    
    private static ButtonController btnCtrl;
    private HashMap<String, JButton> buttons;
    
    private ButtonController() {
        buttons = new HashMap<String, JButton>();
    }
    
    public static ButtonController getInstance(){
        if(btnCtrl==null){
            btnCtrl = new ButtonController();
        }
        return btnCtrl;
    }
    
    public void addToControlledButtons(JButton btn){
        System.out.println("Button "+btn.getText()+" was added to controlled buttons.");
        buttons.put(btn.getText(), btn);
    }
    
    public void disableButton(String btnText){
        buttons.get(btnText).setEnabled(false);
    }
    
    public void enableButton(String btnText){
        buttons.get(btnText).setEnabled(true);
    }
    
    public HashMap<String, JButton> getControlledButtons(){
        return buttons;
    }
    
    public int getControlledButtonsSize(){
        return buttons.size();
    }

}

