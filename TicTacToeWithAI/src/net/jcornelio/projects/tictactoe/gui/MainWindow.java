package net.jcornelio.projects.tictactoe.gui;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import net.jcornelio.projects.tictactoe.controllers.LabelController;
import net.jcornelio.projects.tictactoe.controllers.ScoreBoardController;

import net.jcornelio.projects.tictactoe.domain.Slot;
import net.jcornelio.projects.tictactoe.gui.layout.LayoutManager;
import net.jcornelio.projects.tictactoe.gui.layout.MainWindowLayoutManager;
import net.jcornelio.projects.tictactoe.listeners.AboutActionListener;
import net.jcornelio.projects.tictactoe.listeners.ExitActionListener;
import net.jcornelio.projects.tictactoe.listeners.HowToPlayActionListener;
import net.jcornelio.projects.tictactoe.listeners.NewGameActionListener;
import net.jcornelio.projects.tictactoe.listeners.SlotClickEventListener;
import net.jcornelio.projects.tictactoe.util.Constants;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 2, 2013
 * @version: 1.0
 **************************************************/
public class MainWindow extends JFrame {

    private JMenuBar menuBar;
    private JMenu menuGame;
    private JMenu menuHelp;
    private JMenuItem menuItemAbout;
    private JMenuItem menuItemExit;
    private JMenuItem menuItemInstruction;
    private JMenuItem menuItemNewGame;
    private JPanel pnlBoard;
    private JPanel pnlGameArea;
    private JPanel pnlSideBar;
    private JTextField[] txtGameStatus;
    private JLabel lblStatusMsg;
    private Slot[] txtSlot;
    private LayoutManager mwlMngr;
    
    public MainWindow() {
        instantiateComponents();
        setComponentProperties();
        mwlMngr.performLayout();
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
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    private void instantiateComponents() {
        mwlMngr = new MainWindowLayoutManager(this);
        pnlGameArea = new JPanel();
        pnlSideBar = new JPanel();
        pnlBoard = new JPanel();
        lblStatusMsg = new JLabel();
        menuBar = new JMenuBar();
        menuGame = new JMenu();
        menuItemNewGame = new JMenuItem();
        menuItemExit = new JMenuItem();
        menuHelp = new JMenu();
        menuItemInstruction = new JMenuItem();
        menuItemAbout = new JMenuItem();
        txtGameStatus = new JTextField[4];
        txtSlot = new Slot[9];
        for(int i=0; i<txtSlot.length; i++){
            txtSlot[i] = new Slot();
        }
        for(int i=0; i<txtGameStatus.length; i++){
            txtGameStatus[i] = new JTextField();
        }
    }

    private void setComponentProperties() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle(Constants.APP_NAME);
        setResizable(false);

        pnlGameArea.setBackground(new Color(255, 204, 153));

        pnlSideBar.setBackground(new Color(76, 60, 23));
        pnlSideBar.setBorder(new SoftBevelBorder(BevelBorder.RAISED));

        pnlBoard.setBackground(new Color(73, 60, 23));
        pnlBoard.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        
        for(int i=0; i<txtSlot.length; i++){
            txtSlot[i].setEditable(false);
            txtSlot[i].setBackground(new Color(255, 255, 153));
            txtSlot[i].setFont(new Font(Constants.FONT_COMIC_SANS_MS, 1, 48)); 
            txtSlot[i].setHorizontalAlignment(JTextField.CENTER);
            txtSlot[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
            txtSlot[i].setHighlighter(null);
            txtSlot[i].addMouseListener(new SlotClickEventListener(txtSlot[i]));
        }
        
        for(int i=0; i<txtGameStatus.length; i++){
            txtGameStatus[i].setEditable(false);
            txtGameStatus[i].setBackground(new Color(76, 60, 23));
            txtGameStatus[i].setFont(new Font(Constants.FONT_TAHOMA, 1, 14));
            txtGameStatus[i].setForeground(new Color(255, 255, 153));
            txtGameStatus[i].setHorizontalAlignment(JTextField.CENTER);
            txtGameStatus[i].setText(Constants.DEFAULT_SCORE);
            txtGameStatus[i].setBorder(BorderFactory.createTitledBorder(null, Constants.LABEL_SCORE_BOARD[i], TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, new Font(Constants.FONT_COMIC_SANS_MS, 1, 12), new Color(255, 153, 51))); 
            txtGameStatus[i].setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            txtGameStatus[i].setFocusable(false);
            ScoreBoardController.getInstance().addToControlledLabel(Constants.LABEL_SCORE_BOARD[i], txtGameStatus[i]);
        }
        
        lblStatusMsg.setFont(new Font(Constants.FONT_COMIC_SANS_MS, 1, 14));
        lblStatusMsg.setHorizontalTextPosition(SwingConstants.CENTER);
        lblStatusMsg.setText(Constants.STATUS_PREFIX + Constants.LABEL_PROGRAM_START + Constants.STATUS_SUFFIX);
        LabelController.getInstance().setScreen(lblStatusMsg);

        menuItemNewGame.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
        menuItemNewGame.setText(Constants.OPTION_NEW_GAME);
        menuItemNewGame.addActionListener(new NewGameActionListener());

        menuItemExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
        menuItemExit.setText(Constants.OPTION_EXIT);
        menuItemExit.addActionListener(new ExitActionListener());
        
        menuGame.setText(Constants.LABEL_GAME_MENU);
        menuGame.add(menuItemNewGame);
        menuGame.add(menuItemExit);

        menuItemInstruction.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
        menuItemInstruction.setText(Constants.OPTION_HOW_TO_PLAY);
        menuItemInstruction.addActionListener(new HowToPlayActionListener(rootPane));

        menuItemAbout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0));
        menuItemAbout.setText(Constants.OPTION_ABOUT);
        menuItemAbout.addActionListener(new AboutActionListener(rootPane));
        
        menuHelp.setText(Constants.LABEL_HELP_MENU);
        menuHelp.add(menuItemInstruction);
        menuHelp.add(menuItemAbout);

        menuBar.add(menuGame);
        menuBar.add(menuHelp);

        setJMenuBar(menuBar);
    }
    
    public JMenu getMenuGame() {
        return menuGame;
    }

    public JMenu getMenuHelp() {
        return menuHelp;
    }

    public JMenuItem getMenuItemAbout() {
        return menuItemAbout;
    }

    public JMenuItem getMenuItemExit() {
        return menuItemExit;
    }

    public JMenuItem getMenuItemInstruction() {
        return menuItemInstruction;
    }

    public JMenuItem getMenuItemNewGame() {
        return menuItemNewGame;
    }

    public JPanel getPnlBoard() {
        return pnlBoard;
    }

    public JPanel getPnlGameArea() {
        return pnlGameArea;
    }

    public JPanel getPnlSideBar() {
        return pnlSideBar;
    }

    public JLabel getLblStatusMsg() {
        return lblStatusMsg;
    }
    
    public Slot getSlot(int index){
        return txtSlot[index];
    }
    
    public JTextField getScoreBoardLabel(int index){
        return txtGameStatus[index];
    }      
}
