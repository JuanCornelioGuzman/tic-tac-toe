package net.jcornelio.projects.calculator.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import net.jcornelio.projects.calculator.controllers.ButtonController;
import net.jcornelio.projects.calculator.controllers.ScreenController;
import net.jcornelio.projects.calculator.domain.Operators;
import net.jcornelio.projects.calculator.util.Constants;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Sep 19, 2013
 * @version: 1.0
 **************************************************/
public class OperatorActionListener implements ActionListener{

    private String operation;

    public OperatorActionListener(String operation) {
        System.out.println("OperatorActionListener was added to "+operation+" button.");
        this.operation = operation;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        controlButtons();
        ScreenController.getInstance().concatToDisplay(operation);
    }

    private void controlButtons() {
        ButtonController.getInstance().enableButton(Constants.DOT);
        ButtonController.getInstance().disableButton(Constants.EQUALS_SIGN);
        for(JButton jb : Operators.getInstance().getAllOperators()){
            ButtonController.getInstance().disableButton(jb.getText());
        }
    }
}

