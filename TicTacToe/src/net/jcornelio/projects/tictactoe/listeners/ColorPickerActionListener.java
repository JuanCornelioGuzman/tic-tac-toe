package net.jcornelio.projects.tictactoe.listeners;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import net.jcornelio.projects.tictactoe.gui.ColorPickerWindow;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 3, 2013
 * @version: 1.0
 **************************************************/
public class ColorPickerActionListener extends MouseAdapter{

    private JTextField txtColor;

    public ColorPickerActionListener(JTextField txtColor) {
        this.txtColor = txtColor;
    }
    
    @Override
    public void mousePressed(MouseEvent evt) {                                      
        ColorPickerWindow.displayWindow(txtColor);
    }
}

