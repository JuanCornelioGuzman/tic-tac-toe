package net.jcornelio.projects.calculator.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import net.jcornelio.projects.calculator.controllers.ScreenController;
import net.jcornelio.projects.calculator.domain.Expression;
import net.jcornelio.projects.calculator.logic.ComputationPerformer;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Sep 18, 2013
 * @version: 1.0
 **************************************************/
public class ResultActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        ComputationPerformer.calculateExpresion(ScreenController.getInstance().getDisplayedText());
        ScreenController.getInstance().display(Expression.getInstance().getResult());
        Expression.getInstance().clearAll();
    }
}

