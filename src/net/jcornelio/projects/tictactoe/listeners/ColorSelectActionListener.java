package net.jcornelio.projects.tictactoe.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import net.jcornelio.projects.tictactoe.gui.ColorPickerWindow;
import net.jcornelio.projects.tictactoe.gui.NewGameWindow;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 3, 2013
 * @version: 1.0
 **************************************************/
public class ColorSelectActionListener implements ActionListener{

    private ColorPickerWindow cpFrame;
    private JTextField txtColor;

    public ColorSelectActionListener(ColorPickerWindow cpFrame, JTextField txtColor) {
        this.cpFrame = cpFrame;
        this.txtColor = txtColor;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.print(cpFrame.getColorChooser().getSelectionModel().getSelectedColor());
        txtColor.setBackground(cpFrame.getColorChooser().getSelectionModel().getSelectedColor());
        cpFrame.dispose();
    }

}

