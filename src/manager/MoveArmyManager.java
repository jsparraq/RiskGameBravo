/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.util.ArrayList;
import riskgamemodel.*;

/**
 *
 * @author user
 */
public class MoveArmyManager {
    
    public static String Map(Session sessionstart){
        return "/images/" + sessionstart.getMap().getName() + ".png";
    } 
    
    public static String[] Territories(Session sessionstart){
        Player[] players = sessionstart.getPlayers();
        Player playerstart = new Player();
        for (Player player : players) {
            if (player.getTurn()) {
                playerstart = player;
            }
        }
        ArrayList<Territory> territoryplayer = new ArrayList();
        Continent[] continents = sessionstart.getMap().getContinents();
        for (Continent continent : continents) {
            Territory[] territories = continent.getTerritory();
            for (Territory territorie : territories) {
                if (territorie.getOwner().equals(playerstart.getColor())) {
                    territoryplayer.add(territorie);
                }
            }
        }
        String[] territoriesplayer = new String[territoryplayer.size()];
        for (int i = 0; i < territoryplayer.size(); i++) {
            territoriesplayer[i] = territoryplayer.get(i).getString();
        }
        return territoriesplayer;
    }
    public static String[] neighbours(Session sessionstart,String territory){
        Player[] players = sessionstart.getPlayers();
        Player playerstart = new Player();
        for (Player player : players) {
            if (player.getTurn()) {
                playerstart = player;
            }
        }
        Territory territoryA = new Territory();
        Continent[] continents = sessionstart.getMap().getContinents();
        for (Continent continent : continents) {
            Territory[] territories = continent.getTerritory();
            for (Territory territorie : territories) {
                if (territorie.getOwner().equals(playerstart.getColor()) || territorie.getString().equals(territory)) {
                    territoryA = territorie;
                }
            }
        }
        Territory[] territories = sessionstart.getMap().getboundary().getTerritories();
        Neighbour[] neighbours = sessionstart.getMap().getboundary().getNeighbours();
        ArrayList<String> Neighbours = new ArrayList();
        for (int i = 0; i < territories.length; i++) {
            if (territories[i] == territoryA){
                Neighbours.add(neighbours[i].getString());
            }
        }
        String[] NEIGHBOURS = new String[Neighbours.size()];
        for (int i = 0; i < Neighbours.size(); i++) {
            NEIGHBOURS[i] = Neighbours.get(i);
        }
        return NEIGHBOURS;
    }
}
