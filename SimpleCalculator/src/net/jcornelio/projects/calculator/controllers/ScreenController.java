package net.jcornelio.projects.calculator.controllers;

import javax.swing.JTextField;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Sep 11, 2013
 * @version: 1.0
 **************************************************/
public class ScreenController {
    
    private static ScreenController scmgr;
    private JTextField screen;
    
    private ScreenController() {}
    
    public static ScreenController getInstance() {
        if(scmgr==null){
            scmgr = new ScreenController();
        }
        return scmgr;
    }
        
    public void display(String text){
        screen.setText(text);
    }
    
    public void concatToDisplay(String text){
        display(screen.getText().concat(text));
    }
    
    public String getDisplayedText(){
        return screen.getText();
    }
    
    public JTextField getScreen() {
        return screen;
    }

    public void setControlledLabel(JTextField screen) {
        this.screen = screen;
    }
    
}