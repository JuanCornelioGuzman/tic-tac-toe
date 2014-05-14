package net.jcornelio.projects.tictactoe.domain;

import net.jcornelio.projects.tictactoe.gameplay.GameManager;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Sep 24, 2013
 * @version: 1.0
 **************************************************/
public class User extends Player{

    public User(String name, MarkSymbol symbol) {
        this.setName(name);
        this.setSymbol(symbol);
    }
    
    @Override
    public void performTurn() {
        GameManager.getInstance().switchPlayer();
    }

}

