package net.jcornelio.projects.tictactoe.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 3, 2013
 * @version: 1.0
 **************************************************/
public class DisposeActionListener implements ActionListener{

    private JFrame frame;
    
    public DisposeActionListener(JFrame frame) {
        this.frame = frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
    }

}

