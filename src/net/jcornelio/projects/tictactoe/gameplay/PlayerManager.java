package net.jcornelio.projects.tictactoe.gameplay;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import net.jcornelio.projects.tictactoe.domain.Player;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 7, 2013
 * @version: 1.0
 **************************************************/
public class PlayerManager {
    
    private static PlayerManager pm;
    private HashMap<String, Player> players;
    private List<Player> playerList;
    
    private PlayerManager(){
        players = new HashMap<String, Player>();
        playerList = new ArrayList<Player>();
    }
    
    public static PlayerManager getInstance(){
        if(pm==null){
            pm = new PlayerManager();
        }
        return pm;
    }
    
    public void addToPlayers(Player p) {
        if(players.size()<2){
            players.put(p.getName(), p);
            playerList.add(p);
        }else{
            System.out.println("Only two players are allowed");
        }    
    }
    
    public Player getPlayer(String name){
        return players.get(name);
    }
    
    public Player getPlayer(int index){
        return playerList.get(index);
    }
    
    public Collection<Player> getPlayers(){
        return players.values();
    }
    
    public void clearPlayers(){
        players.clear();
        playerList.clear();
    }
    
    public Player getOpponent(Player ply){
        Player pl = null;
        for(Player p: playerList){
            if(!p.getName().equalsIgnoreCase(ply.getName())){
                pl = p;
                break;
            }
        }
        return pl;
    }

}

