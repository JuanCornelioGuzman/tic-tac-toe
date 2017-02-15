package net.jcornelio.projects.tictactoe.domain;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 2, 2013
 * @version: 1.0
 **************************************************/
public class Score {
    
    private int gameWon;
    private int gameLost;
    private int gameTied; 
    
    public void incrementWon(){
        gameWon++;
    }
    
    public void incrementLost(){
        gameLost++;
    }
    
    public void incrementTied(){
        gameTied++;
    }
    
    public int getGameWon() {
        return gameWon;
    }

    public int getGameLost() {
        return gameLost;
    }

    public int getGameTied() {
        return gameTied;
    }
    
}

