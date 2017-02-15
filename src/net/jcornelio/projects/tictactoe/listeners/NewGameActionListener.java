package net.jcornelio.projects.tictactoe.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.jcornelio.projects.tictactoe.gui.NewGameWindow;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 3, 2013
 * @version: 1.0
 **************************************************/
public class NewGameActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        NewGameWindow.displayWindow();
    }

}

