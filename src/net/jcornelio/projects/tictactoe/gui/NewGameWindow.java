package net.jcornelio.projects.tictactoe.gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import net.jcornelio.projects.tictactoe.controllers.ButtonController;
import net.jcornelio.projects.tictactoe.gui.layout.LayoutManager;
import net.jcornelio.projects.tictactoe.gui.layout.NewGameLayoutManager;
import net.jcornelio.projects.tictactoe.listeners.ColorPickerActionListener;
import net.jcornelio.projects.tictactoe.listeners.DisposeActionListener;
import net.jcornelio.projects.tictactoe.listeners.StartGameActionListener;
import net.jcornelio.projects.tictactoe.listeners.UserNameKeyListener;
import net.jcornelio.projects.tictactoe.util.Constants;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 3, 2013
 * @version: 1.0
 **************************************************/
public class NewGameWindow extends JFrame {

    private LayoutManager nglMngr;
    private JComboBox cmbDifficulty;
    private JComboBox cmbSymbol;
    private JLabel lblDifficulty;
    private JLabel lblMarkColor;
    private JLabel lblMarkSymbol;
    private JLabel lblUsername;
    private JPanel pnlBottom;
    private JPanel pnlTop;
    private JTextField txtColor;
    private JTextField txtName;                     
    private JButton btnCancel;
    private JButton btnStartGame;  
    
    public NewGameWindow() {
        instantiateComponents();
        setComponentProperties();
        nglMngr.performLayout();
    }
                       
    private void setComponentProperties() {

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(Constants.DIALOG_NEW_GAME_NAME);
        setResizable(false);

        pnlTop.setBackground(new Color(255, 255, 204));
        pnlTop.setBorder(BorderFactory.createEtchedBorder());
        pnlTop.setForeground(new Color(204, 255, 204));

        lblUsername.setFont(new Font(Constants.FONT_COMIC_SANS_MS, 0, 14)); 
        lblUsername.setText("Username:");

        txtName.setFont(new Font(Constants.FONT_COMIC_SANS_MS, 0, 14)); 
        txtName.addKeyListener(new UserNameKeyListener(txtName));

        lblMarkColor.setFont(new Font(Constants.FONT_COMIC_SANS_MS, 0, 14)); 
        lblMarkColor.setText("Color:");

        cmbSymbol.setFont(new Font(Constants.FONT_COMIC_SANS_MS, 1, 14)); 
        cmbSymbol.setModel(new DefaultComboBoxModel(new String[] { "X", "O" }));
        cmbSymbol.setCursor(new Cursor(Cursor.HAND_CURSOR));

        lblMarkSymbol.setFont(new Font(Constants.FONT_COMIC_SANS_MS, 0, 14)); 
        lblMarkSymbol.setText("Symbol:");

        txtColor.setEditable(false);
        txtColor.setBackground(new Color(0, 0, 0));
        txtColor.setCursor(new Cursor(Cursor.HAND_CURSOR));
        txtColor.addMouseListener(new ColorPickerActionListener(txtColor));

        lblDifficulty.setFont(new Font(Constants.FONT_COMIC_SANS_MS, 0, 14)); 
        lblDifficulty.setText("Difficulty:");

        cmbDifficulty.setFont(new Font(Constants.FONT_COMIC_SANS_MS, 1, 14)); 
        cmbDifficulty.setModel(new DefaultComboBoxModel(new String[] { "Easy", "Hard" }));

        pnlBottom.setBackground(new Color(204, 255, 204));

        btnStartGame.setFont(new Font(Constants.FONT_TAHOMA, 0, 14)); 
        btnStartGame.setText(Constants.START_GAME);
        btnStartGame.setMargin(new Insets(2, 2, 2, 2));
        btnStartGame.setHorizontalAlignment(SwingConstants.CENTER);
        btnStartGame.addActionListener(new StartGameActionListener(this));
        ButtonController.getInstance().addToControlledButtons(btnStartGame);
        ButtonController.getInstance().disableButton(Constants.START_GAME);

        btnCancel.setFont(new Font(Constants.FONT_TAHOMA, 0, 14)); 
        btnCancel.setText("Cancel");
        btnCancel.setMargin(new Insets(2, 2, 2, 2));
        btnCancel.addActionListener(new DisposeActionListener(this));
        btnCancel.setHorizontalAlignment(SwingConstants.CENTER);
        
    }                
    
    public static void displayWindow() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (Constants.APP_LOOK_AND_FEEL.equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(NewGameWindow.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewGameWindow().setVisible(true);
            }
        });
    }

    private void instantiateComponents() {
        nglMngr = new NewGameLayoutManager(this);
        pnlTop = new JPanel();
        pnlBottom = new JPanel();
        lblUsername = new JLabel();
        lblMarkColor = new JLabel();
        lblMarkSymbol = new JLabel();
        lblDifficulty = new JLabel();
        txtName = new JTextField();
        txtColor = new JTextField();
        cmbDifficulty = new JComboBox();
        cmbSymbol = new JComboBox();
        btnStartGame = new JButton();
        btnCancel = new JButton();
    }

    public JComboBox getCmbDifficulty() {
        return cmbDifficulty;
    }

    public JComboBox getCmbSymbol() {
        return cmbSymbol;
    }

    public JLabel getLblDifficulty() {
        return lblDifficulty;
    }

    public JLabel getLblMarkColor() {
        return lblMarkColor;
    }

    public JLabel getLblMarkSymbol() {
        return lblMarkSymbol;
    }

    public JLabel getLblUsername() {
        return lblUsername;
    }

    public JPanel getPnlBottom() {
        return pnlBottom;
    }

    public JPanel getPnlTop() {
        return pnlTop;
    }

    public JTextField getTxtColor() {
        return txtColor;
    }

    public JTextField getTxtName() {
        return txtName;
    }

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public JButton getBtnStartGame() {
        return btnStartGame;
    }
             
}