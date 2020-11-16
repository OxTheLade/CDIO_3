package com.company;

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;

import java.awt.*;


public class Player {


    public String playerName = Main.board.gui.getUserString("Hvad er dit navn?");
    public GUI_Car car = new GUI_Car();
    public GUI_Player GuiPlayer = new GUI_Player(playerName, 0, car);
    public static Player[] players = new Player[Main.board.maxPlayers];
    public int playerPosition = 0;


    // Metode der oprtter spillere
    public void createPlayer() {
        // Sætter spillerns balance alt efter hvor mange spillere man er.
        switch (Main.board.maxPlayers) {
            case 2:
                GuiPlayer.setBalance(20);
                break;
            case 3:
                GuiPlayer.setBalance(18);
                break;
            case 4:
                GuiPlayer.setBalance(16);
                break;
        }

        // Spørger spilleren om hvilken farve bil man vil have og validerer spillerns valg vha. et Switch statement.
        String carColor = Main.board.gui.getUserSelection("Hvilken farve bil vil du have?", "Gul", "Rød", "Blå", "Sort");

        switch (carColor) {
            case "Gul":
                car.setPrimaryColor(Color.YELLOW);
                break;
            case "Rød":
                car.setPrimaryColor(Color.red);
                break;
            case "Blå":
                car.setPrimaryColor(Color.blue);
                break;
            case "Sort":
                car.setPrimaryColor(Color.black);
                break;
        }

        // Tilføjer spillerne til brættet.
        Main.board.gui.addPlayer(GuiPlayer);
        Main.board.fields[0].setCar(GuiPlayer, true);
    }


}
