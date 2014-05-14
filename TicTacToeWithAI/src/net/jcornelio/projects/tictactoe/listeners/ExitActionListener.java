package net.jcornelio.projects.tictactoe.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 3, 2013
 * @version: 1.0
 **************************************************/
public class ExitActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
    
}

