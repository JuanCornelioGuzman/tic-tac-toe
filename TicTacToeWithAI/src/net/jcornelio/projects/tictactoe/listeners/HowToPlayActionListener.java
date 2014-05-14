package net.jcornelio.projects.tictactoe.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import net.jcornelio.projects.tictactoe.util.Constants;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 3, 2013
 * @version: 1.0
 **************************************************/
public class HowToPlayActionListener implements ActionListener{

    private JRootPane rootPane;

    public HowToPlayActionListener(JRootPane rootPane) {
        this.rootPane = rootPane;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(rootPane, Constants.OPTION_HOW_TO_PLAY_CONTENT, Constants.OPTION_HOW_TO_PLAY, JOptionPane.INFORMATION_MESSAGE);
    }

}

