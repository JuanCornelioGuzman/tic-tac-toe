package net.jcornelio.projects.tictactoe.util;

import net.jcornelio.projects.tictactoe.domain.Pattern;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Sep 19, 2013
 * @version: 1.0
 **************************************************/
public class Constants {
    
    public static final String APP_NAME = "JSG Tic Tac Toe";
    public static final String APP_LOOK_AND_FEEL = "Nimbus";
    
    public static final String STATUS_PREFIX = "<HTML><CENTER><P>";
    public static final String STATUS_SUFFIX = "</P></CENTER></HTML>";
    
    public static final String LABEL_TURN_AI = "Duke is thinking for it\'s turn. Please wait...";
    public static final String LABEL_TURN_USER = "\'s turn. Select the grid to be marked";
    
    public static final String LABEL_PLAYER_WON = " won! Press Ctrl+G to start the next game.";
    public static final String LABEL_RESULT_TIE = "Game result was a tie. Press Ctrl+G to start the next game.";
    
    /*MENU items*/
    public static final String LABEL_GAME_MENU = "Game";
    public static final String LABEL_HELP_MENU = "Help";
    public static final String OPTION_NEW_GAME = "New Game";
    public static final String OPTION_EXIT = "Exit";
    public static final String OPTION_ABOUT = "About";
    public static final String OPTION_ABOUT_CONTENT = "Tic Tac Toe v1 \nDeveloped by JC Guzman";
    public static final String OPTION_HOW_TO_PLAY = "How To Play";
    public static final String OPTION_HOW_TO_PLAY_CONTENT = "1. Open Chrome\n"
                                                          + "2. Type \"how to play Tic Tac Toe\" in the address bar.\n"
                                                          + "3. Read results.";
    
    
    public static final String CANCEL = "Cancel";
    public static final String START_GAME = "Start Game";
    public static final String SELECT = "Select";

    public static final String FONT_COMIC_SANS_MS = "Comic Sans MS";
    public static final String FONT_TAHOMA = "Tahoma";
    
    public static final String LABEL_PROGRAM_START = "Press Ctrl+N to Start a New Game";
        
    public static final Pattern PATTERN_DIAGONAL1 = new Pattern(0,4,8);
    public static final Pattern PATTERN_DIAGONAL2 = new Pattern(2,4,6);
    public static final Pattern PATTERN_COLUMN1 = new Pattern(0,3,6);
    public static final Pattern PATTERN_COLUMN2 = new Pattern(1,4,7);
    public static final Pattern PATTERN_COLUMN3 = new Pattern(2,5,8);
    public static final Pattern PATTERN_ROW1 = new Pattern(0,1,2);
    public static final Pattern PATTERN_ROW2 = new Pattern(3,4,5);
    public static final Pattern PATTERN_ROW3 = new Pattern(6,7,8);
    
    public static final String LABEL_GAME_REMAIN = "Games Remaining";
    public static final String LABEL_GAME_WON = "Games Won";
    public static final String LABEL_GAME_LOSE = "Games Lose";
    public static final String LABEL_GAME_TIED = "Games Tied";
    
    public static final String[] LABEL_SCORE_BOARD = {LABEL_GAME_REMAIN, LABEL_GAME_WON, LABEL_GAME_LOSE, LABEL_GAME_TIED};
    
    public static final char X_SYMBOL = 'X';
    public static final char O_SYMBOL = 'O';
    
    public static final String DEFAULT_SCORE = "0";
    
    public static final String DIALOG_NEW_GAME_NAME = "New Game";
    
    public static final String BLANK_STRING = "";
    public static final char BLANK_CHAR = ' ';
    
    public static final String MSG_SLOT_MARKED = "Slot already marked. Choose another slot";
    public static final String TITLE_ALERT = "Alert";
    
    
    //AI Properties
    public static final String AI_NAME = "Duke";
    public static final int AI_THINKING_TIME = 1000;
    
    
}

