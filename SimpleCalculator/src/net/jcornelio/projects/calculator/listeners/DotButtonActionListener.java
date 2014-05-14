package net.jcornelio.projects.calculator.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import net.jcornelio.projects.calculator.controllers.ButtonController;
import net.jcornelio.projects.calculator.controllers.ScreenController;
import net.jcornelio.projects.calculator.util.Constants;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Sep 19, 2013
 * @version: 1.0
 **************************************************/
public class DotButtonActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        ScreenController.getInstance().concatToDisplay(Constants.DOT);
        ButtonController.getInstance().disableButton(Constants.DOT);
    }

}

