package net.jcornelio.projects.crud.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 23, 2013
 * @version: 1.0
 **************************************************/
public class OpenFileActionListener implements ActionListener {

    private JFileChooser chooser;
    private JFrame jf;
    
    public OpenFileActionListener(JFileChooser ch, JFrame jf) {
        chooser = ch;
        this.jf = jf;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {        
        chooser = new JFileChooser(); 
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Open File");
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        
        chooser.setAcceptAllFileFilterUsed(false);
        
        if (chooser.showOpenDialog(jf) == JFileChooser.APPROVE_OPTION) { 
          System.out.println("getCurrentDirectory(): " 
             +  chooser.getCurrentDirectory());
          System.out.println("getSelectedFile() : " 
             +  chooser.getSelectedFile());
          }
        else {
          System.out.println("No Selection ");
          }
    }
}

