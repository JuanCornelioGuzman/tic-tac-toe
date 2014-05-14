package net.jcornelio.projects.crud.utils;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 3, 2013
 * @version: 1.0
 **************************************************/
public class WindowHelper {
    
    public static void setStartUpLocationToCenter(JFrame jf){
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        jf.setLocation((int)((dimension.getWidth() - jf.getWidth())/2), (int)((dimension.getHeight() - jf.getHeight())/2));
    }
    
    public static void setStartUpLocationToCenter(JFileChooser jf){
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        jf.setLocation((int)((dimension.getWidth() - jf.getWidth())/2), (int)((dimension.getHeight() - jf.getHeight())/2));
    }
}

