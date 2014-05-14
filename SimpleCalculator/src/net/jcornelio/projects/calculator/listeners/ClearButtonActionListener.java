package net.jcornelio.projects.calculator.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import net.jcornelio.projects.calculator.controllers.ButtonController;

import net.jcornelio.projects.calculator.controllers.ScreenController;
import net.jcornelio.projects.calculator.domain.Expression;
import net.jcornelio.projects.calculator.domain.Operators;
import net.jcornelio.projects.calculator.util.Constants;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Sep 18, 2013
 * @version: 1.0
 **************************************************/
public class ClearButtonActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        ScreenController.getInstance().display(Constants.BLANK);
        for(JButton jb : Operators.getInstance().getAllOperators()){
            ButtonController.getInstance().disableButton(jb.getText());
        }
        Expression.getInstance().clearAll();
    }

}

