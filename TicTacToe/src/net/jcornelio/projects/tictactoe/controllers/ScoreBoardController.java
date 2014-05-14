package net.jcornelio.projects.tictactoe.controllers;

import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JTextField;
import net.jcornelio.projects.tictactoe.domain.Player;
import net.jcornelio.projects.tictactoe.gameplay.GameManager;
import net.jcornelio.projects.tictactoe.gameplay.PlayerManager;
import net.jcornelio.projects.tictactoe.util.Constants;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 11, 2013
 * @version: 1.0
 **************************************************/
public class ScoreBoardController {

    private static ScoreBoardController sbCtrl;
    private HashMap<String, JTextField> fields;
    
    private ScoreBoardController() {
        fields = new HashMap<String, JTextField>();
    }
    
    public static ScoreBoardController getInstance() {
        if(sbCtrl==null){
            sbCtrl = new ScoreBoardController();
        }
        return sbCtrl;
    }
    
    public void addToControlledLabel(String label, JTextField jTxt){
        System.out.println("TextField "+label+" was added to controlled textfields");
        fields.put(label, jTxt);
    }
    
    public void updateScoreBoard(Player p){
        fields.get(Constants.LABEL_GAME_REMAIN).setText("");
        fields.get(Constants.LABEL_GAME_WON).setText(String.valueOf(p.getScore().getGameWon()));
        fields.get(Constants.LABEL_GAME_LOSE).setText(String.valueOf(p.getScore().getGameLost()));
        fields.get(Constants.LABEL_GAME_TIED).setText(String.valueOf(p.getScore().getGameTied()));
    }
    
}

