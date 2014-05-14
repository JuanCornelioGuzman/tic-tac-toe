package net.jcornelio.projects.tictactoe.gui;

import java.awt.EventQueue;
import java.awt.Font;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import net.jcornelio.projects.tictactoe.gui.layout.ColorPickerWindowLayoutManager;
import net.jcornelio.projects.tictactoe.gui.layout.LayoutManager;

import net.jcornelio.projects.tictactoe.listeners.ColorSelectActionListener;
import net.jcornelio.projects.tictactoe.listeners.DisposeActionListener;
import net.jcornelio.projects.tictactoe.util.Constants;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 3, 2013
 * @version: 1.0
 **************************************************/
public class ColorPickerWindow extends JFrame {
         
    private JButton btnCancel;
    private JButton btnSelect;
    private JColorChooser colorChooser; 
    private JTextField txtColor;
    private LayoutManager cplMngr;

    public ColorPickerWindow(JTextField txtColor) {
        this.txtColor = txtColor;
        instantiateComponents();
        setComponentProperties();
        cplMngr.performLayout();
    }
                     
    private void setComponentProperties() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Color Picker");
        setResizable(false);

        btnSelect.setFont(new Font(Constants.FONT_TAHOMA, 0, 14)); // NOI18N
        btnSelect.setText("Select");
        btnSelect.addActionListener(new ColorSelectActionListener(this, txtColor));

        btnCancel.setFont(new Font(Constants.FONT_TAHOMA, 0, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new DisposeActionListener(this));
    }                                 
    
    public static void displayWindow(final JTextField txtColor) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (Constants.APP_LOOK_AND_FEEL.equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(ColorPickerWindow.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ColorPickerWindow(txtColor).setVisible(true);
            }
        });
    }
    
    
    public JButton getBtnCancel() {
        return btnCancel;
    }

    public JButton getBtnSelect() {
        return btnSelect;
    }

    public JColorChooser getColorChooser() {
        return colorChooser;
    }

    private void instantiateComponents() {
        colorChooser = new JColorChooser();
        btnSelect = new JButton();
        btnCancel = new JButton();
        cplMngr = new ColorPickerWindowLayoutManager(this);
    }
    
    
}

