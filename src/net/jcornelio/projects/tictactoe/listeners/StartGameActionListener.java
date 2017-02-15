package net.jcornelio.projects.tictactoe.listeners;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import net.jcornelio.projects.tictactoe.domain.DukeTheAI;
import net.jcornelio.projects.tictactoe.domain.MarkSymbol;
import net.jcornelio.projects.tictactoe.domain.User;
import net.jcornelio.projects.tictactoe.gameplay.GameManager;
import net.jcornelio.projects.tictactoe.gameplay.PlayerManager;
import net.jcornelio.projects.tictactoe.gui.NewGameWindow;
import net.jcornelio.projects.tictactoe.util.Constants;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 3, 2013
 * @version: 1.0
 **************************************************/
public class StartGameActionListener implements ActionListener {

    private NewGameWindow ngame;

    public StartGameActionListener(NewGameWindow ngame) {
        this.ngame = ngame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        GameManager.getInstance().resetGame();
        setPropertiesOfPlayers();
        GameManager.getInstance().setDifficulty(ngame.getCmbDifficulty().getSelectedItem().toString());
        int randomPlayer = new Random().nextInt(PlayerManager.getInstance().getPlayers().size());
        GameManager.getInstance().setCurrentPlayer(PlayerManager.getInstance().getPlayer(randomPlayer));        
        System.out.println("Current Player is "+GameManager.getInstance().getCurrentPlayer().getName());
        ngame.dispose();
    }

    private User setUserProperties() {
        char symbol = ngame.getCmbSymbol().getSelectedItem().toString().charAt(0);
        Color color = ngame.getTxtColor().getBackground();
        String name = ngame.getTxtName().getText();
        User user = new User(name, new MarkSymbol(symbol,color));
        user.setStatusMessage(Constants.STATUS_PREFIX+ name + Constants.LABEL_TURN_USER + Constants.STATUS_SUFFIX);
        return user;
    }
    
    private DukeTheAI setDukeProperties(){
        char symbol;
        if(Constants.X_SYMBOL==ngame.getCmbSymbol().getSelectedItem().toString().charAt(0)){
            symbol = Constants.O_SYMBOL;
        }else{
            symbol = Constants.X_SYMBOL;
        }    
        DukeTheAI.getInstance().setSymbol(new MarkSymbol(symbol, Color.BLACK));
        return DukeTheAI.getInstance();
    }

    private void setPropertiesOfPlayers() {
        User user = setUserProperties();
        DukeTheAI du = setDukeProperties();
        PlayerManager.getInstance().addToPlayers(user);
        PlayerManager.getInstance().addToPlayers(du);
    }
}

