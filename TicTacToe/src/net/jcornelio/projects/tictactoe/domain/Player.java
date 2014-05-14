package net.jcornelio.projects.tictactoe.domain;

import java.util.ArrayList;
import java.util.List;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Sep 24, 2013
 * @version: 1.0
 **************************************************/
public abstract class Player {

    private String name;
    private MarkSymbol symbol;
    private String statusMessage;
    private Score score;
    private List<Slot> markedSlots;

    public Player() {
        markedSlots = new ArrayList<Slot>();
        score = new Score();
    }
    
    public void addToMarkedSlots(Slot s){
        markedSlots.add(s);
    }
    
    public MarkSymbol getSymbol() {
        return symbol;
    }

    public void setSymbol(MarkSymbol symbol) {
        this.symbol = symbol;
    }

    public abstract void performTurn();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
    
}

