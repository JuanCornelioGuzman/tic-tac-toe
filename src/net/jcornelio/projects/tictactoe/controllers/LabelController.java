package net.jcornelio.projects.tictactoe.controllers;

import javax.swing.JLabel;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 4, 2013
 * @version: 1.0
 **************************************************/
public class LabelController {
    
    private static LabelController lblMngr;
    private JLabel status;
    
    private LabelController() {}
    
    public static LabelController getInstance() {
        if(lblMngr==null){
            lblMngr = new LabelController();
        }
        return lblMngr;
    }
        
    public void display(String text){
        status.setText(text);
    }
    
    public String getDisplayedText(){
        return status.getText();
    }
    
    public JLabel getScreen() {
        return status;
    }

    public void setScreen(JLabel screen) {
        this.status = screen;
    }

}

