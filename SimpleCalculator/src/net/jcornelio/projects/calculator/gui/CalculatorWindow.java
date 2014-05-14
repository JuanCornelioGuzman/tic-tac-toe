package net.jcornelio.projects.calculator.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import net.jcornelio.projects.calculator.controllers.ButtonController;
import net.jcornelio.projects.calculator.controllers.ScreenController;
import net.jcornelio.projects.calculator.domain.Operators;
import net.jcornelio.projects.calculator.listeners.BackSpaceActionListener;
import net.jcornelio.projects.calculator.listeners.ClearButtonActionListener;
import net.jcornelio.projects.calculator.listeners.DotButtonActionListener;
import net.jcornelio.projects.calculator.listeners.OperandActionListener;
import net.jcornelio.projects.calculator.listeners.OperatorActionListener;
import net.jcornelio.projects.calculator.listeners.ResultActionListener;
import net.jcornelio.projects.calculator.logic.ExpressionAnalyzer;
import net.jcornelio.projects.calculator.util.Constants;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: September 11, 2013
 * @version: 1.0
 **************************************************/
public class CalculatorWindow extends JFrame {
    
    private JButton[] btnNum;
    private JButton[] btnOperators;
    private JButton btnEqual;    
    private JButton btnClear;
    private JButton btnDot;
    private JButton btnBackspace;
    
    private JTextField txtScreen;    
    private CalculatorLayoutManager clm;
    
    public CalculatorWindow() {
        instantiateComponents();
        setComponentProperties();        
        clm.performLayout();
    }     
    
    private Insets getButtonDefaultMargin(){
        return new Insets(2, 5, 2, 5);
    }

    private void instantiateComponents() {
        txtScreen = new JTextField();
        btnDot = new JButton();
        btnClear = new JButton();
        btnBackspace = new JButton();
        btnEqual = new JButton();
        btnNum = new JButton[10];
        btnOperators = new JButton[4];
        for(int i=0; i<btnNum.length; i++){
            btnNum[i] = new JButton();
        }
        for(int i=0; i<btnOperators.length; i++){
            btnOperators[i] = new JButton();
        }
        clm = new CalculatorLayoutManager(this);
    }

    private void setComponentProperties() throws SecurityException {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle(Constants.APPLICATION_NAME);
        setAlwaysOnTop(true);
        setResizable(false);

        txtScreen.setFont(new Font(Constants.FONT_STYLE, 0, 24));
        txtScreen.setHorizontalAlignment(JTextField.RIGHT);
        txtScreen.setEditable(false);
        ScreenController.getInstance().setControlledLabel(txtScreen);
        
        for(int i=0; i<btnNum.length; i++){
            btnNum[i].setText(Constants.NUMBER[i]);
            btnNum[i].setMargin(getButtonDefaultMargin());
            btnNum[i].addActionListener(new OperandActionListener(Constants.NUMBER[i]));
        }

        for(int i=0; i<btnOperators.length; i++){
            btnOperators[i].setFont(new Font(Constants.FONT_STYLE, 1, 13));
            btnOperators[i].setForeground(Color.BLUE);
            btnOperators[i].setText(Constants.OPERATOR[i]);
            btnOperators[i].setMargin(getButtonDefaultMargin());
            btnOperators[i].addActionListener(new OperatorActionListener(Constants.OPERATOR[i]));
            ButtonController.getInstance().addToControlledButtons(btnOperators[i]);
            ButtonController.getInstance().disableButton(Constants.OPERATOR[i]);
            Operators.getInstance().addToOperators(btnOperators[i]);
            Operators.getInstance().addToOperations(Constants.OPERATOR[i]);
            ExpressionAnalyzer.getInstance().addToOperatorRegEx(Constants.OPERATOR[i]);
        }
        
        btnClear.setText(Constants.CLEAR);
        btnClear.setFont(new Font(Constants.FONT_STYLE, 0, 13));
        btnClear.setForeground(Color.RED);
        btnClear.setMargin(getButtonDefaultMargin());
        btnClear.addActionListener(new ClearButtonActionListener());
        
        btnDot.setText(Constants.DOT);
        btnDot.setMargin(getButtonDefaultMargin());
        btnDot.addActionListener(new DotButtonActionListener());
        ButtonController.getInstance().addToControlledButtons(btnDot);
        
        btnBackspace.setText(Constants.BACKSPACE);
        btnBackspace.setFont(new Font(Constants.FONT_STYLE, 0, 13));
        btnBackspace.setForeground(Color.RED);
        btnBackspace.setMargin(getButtonDefaultMargin());
        btnBackspace.addActionListener(new BackSpaceActionListener());

        
        btnEqual.setText(Constants.EQUALS_SIGN);
        btnEqual.setFont(new Font(Constants.FONT_STYLE, 1, 13));
        btnEqual.setForeground(Color.BLUE);
        btnEqual.addActionListener(new ResultActionListener());
        btnEqual.setMargin(getButtonDefaultMargin());
        ButtonController.getInstance().addToControlledButtons(btnEqual);
        ButtonController.getInstance().disableButton(Constants.EQUALS_SIGN);
    }
    
    public static void displayWindow() {
        /* Set the Nimbus look and feel */
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (Constants.LOOK_AND_FEEL.equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(CalculatorWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorWindow().setVisible(true);
            }
        });
    }
             
    public JButton getBtnNumber(int index) {
        return btnNum[index];
    }

    public JButton getBtnOperator(int index) {
        return btnOperators[index];
    }

    public JButton getBtnEqual() {
        return btnEqual;
    }

    public JButton getBtnClear() {
        return btnClear;
    }

    public JButton getBtnDot() {
        return btnDot;
    }

    public JButton getBtnBackspace() {
        return btnBackspace;
    }

    public JTextField getTxtScreen() {
        return txtScreen;
    }
}