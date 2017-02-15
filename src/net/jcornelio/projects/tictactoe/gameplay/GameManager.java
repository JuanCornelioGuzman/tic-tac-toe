package net.jcornelio.projects.tictactoe.gameplay;

import net.jcornelio.projects.tictactoe.ai.AvailableSlotProvider;
import net.jcornelio.projects.tictactoe.controllers.LabelController;
import net.jcornelio.projects.tictactoe.controllers.ScoreBoardController;
import net.jcornelio.projects.tictactoe.domain.DukeTheAI;
import net.jcornelio.projects.tictactoe.domain.Player;
import net.jcornelio.projects.tictactoe.domain.SlotsHolder;
import net.jcornelio.projects.tictactoe.util.Constants;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 2, 2013
 * @version: 1.0
 **************************************************/
public class GameManager {

    private static GameManager gameMngr;
    private Player currentPlayer;
    private String difficulty;
    
    private GameManager(){ }
    
    public static GameManager getInstance(){
        if(gameMngr==null){
            gameMngr = new GameManager();
        }
        return gameMngr;
    }
    
    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    
    public void switchPlayer(){
        if(WinnerNotifier.hasWon(currentPlayer)){
            LabelController.getInstance().display(Constants.STATUS_PREFIX+currentPlayer.getName()+Constants.LABEL_PLAYER_WON+Constants.STATUS_SUFFIX);
            currentPlayer.getScore().incrementWon();
            PlayerManager.getInstance().getOpponent(currentPlayer).getScore().incrementLost();
            ScoreBoardController.getInstance().updateScoreBoard(PlayerManager.getInstance().getPlayer(0));
        }else if(AvailableSlotProvider.getInstance().getAllAvailableSlots().isEmpty()){
            LabelController.getInstance().display(Constants.STATUS_PREFIX+Constants.LABEL_RESULT_TIE+Constants.STATUS_SUFFIX);
            currentPlayer.getScore().incrementTied();
            PlayerManager.getInstance().getOpponent(currentPlayer).getScore().incrementTied();
            ScoreBoardController.getInstance().updateScoreBoard(PlayerManager.getInstance().getPlayer(0));
        }else{
            setCurrentPlayer(PlayerManager.getInstance().getOpponent(currentPlayer));
        }
    }
    
    public Player getCurrentPlayer() {
        return currentPlayer;
    }
    
    public void setCurrentPlayer(Player currentPlayer) {
        LabelController.getInstance().display(currentPlayer.getStatusMessage());
        this.currentPlayer = currentPlayer;
        if(currentPlayer instanceof DukeTheAI){
            currentPlayer.performTurn();
        }
    }
    
    public void resetGame(){
        clearBoard();
        PlayerManager.getInstance().clearPlayers();
    }
    
    public void clearBoard(){
        SlotsHolder.getInstance().clearAllSlots();
    }
    
}

