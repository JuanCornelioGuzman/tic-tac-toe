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
 * @since: Sep 18, 2013
 * @version: 1.0
 **************************************************/
public class BackSpaceActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        ScreenController scr = ScreenController.getInstance();
        int scrLastIndex = scr.getDisplayedText().length()-1;
        
        if(scr.getDisplayedText().length()>1){
            String trailingChar = scr.getDisplayedText().substring(scrLastIndex);
            System.out.println("Screen last character is: "+trailingChar);
            if(Operators.getInstance().containsOperator(trailingChar)){
                for(JButton jb : Operators.getInstance().getAllOperators()){
                    ButtonController.getInstance().enableButton(jb.getText());
                }
            }
            if(Constants.DOT.equals(trailingChar)){
                ButtonController.getInstance().enableButton(Constants.DOT);
            }
            scr.display(scr.getDisplayedText().substring(0, scrLastIndex));
        }else{
            ButtonController.getInstance().disableButton(Constants.EQUALS_SIGN);
            for(JButton jb : Operators.getInstance().getAllOperators()){
                ButtonController.getInstance().disableButton(jb.getText());
            }
            scr.display(Constants.BLANK);
        }
    }

}

