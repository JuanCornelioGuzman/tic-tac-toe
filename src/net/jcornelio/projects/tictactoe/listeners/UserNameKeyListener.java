package net.jcornelio.projects.tictactoe.listeners;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import net.jcornelio.projects.tictactoe.controllers.ButtonController;
import net.jcornelio.projects.tictactoe.util.Constants;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 4, 2013
 * @version: 1.0
 **************************************************/
public class UserNameKeyListener extends KeyAdapter {

    private JTextField txtName;

    public UserNameKeyListener(JTextField txtName) {
        this.txtName = txtName;
    }    
    
    @Override
    public void keyReleased(KeyEvent e) {
        txtName.setText(txtName.getText().toUpperCase());
        if(txtName.getText().equals(Constants.BLANK_STRING)){
            ButtonController.getInstance().disableButton(Constants.START_GAME);
        }else{
            ButtonController.getInstance().enableButton(Constants.START_GAME);
        }
    }
    
}