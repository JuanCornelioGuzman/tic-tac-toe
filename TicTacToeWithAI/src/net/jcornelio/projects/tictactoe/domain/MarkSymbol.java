package net.jcornelio.projects.tictactoe.domain;

import java.awt.Color;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Sep 25, 2013
 * @version: 1.0
 **************************************************/
public class MarkSymbol {

    private char value;
    private Color color;
    
    public MarkSymbol(char value, Color color) {
        this.value = value;
        this.color = color;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
}

