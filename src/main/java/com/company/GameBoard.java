package com.company;

import gui_fields.*;
import gui_main.GUI;

import static java.lang.Integer.parseInt;

public class GameBoard {

    public GUI gui;
    public int maxPlayers;
    public GUI_Field[] fields;

    public void createBoard() {


        fields = new GUI_Field[]{
                new GUI_Start(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Chance()
        };
        fields[0].setTitle("Start");

        fields[1].setTitle("Burgerbaren");

        fields[2].setTitle("Pizzaria");

        fields[3].setTitle("Chance");

//        fields[2].setTitle("Pizzeriaet");
//
//        fields[3].setTitle("Chance");
//        fields[3].s
        gui = new GUI(fields);
        maxPlayers = parseInt(gui.getUserSelection("Hvor mange spillere er i?", "2", "3", "4"));
        gui.setDice(1,6);
    }

    public void addProperties() {
        GUI_Field burgerBaren = gui.getFields()[1];
        GUI_Ownable burgerBarenOwnable = (GUI_Ownable) burgerBaren;
        burgerBarenOwnable.setSubText("Pris: 1000");

        GUI_Field Pizzaria = gui.getFields()[2];
        GUI_Ownable pizzariaOwnable = (GUI_Ownable) Pizzaria;
        pizzariaOwnable.setSubText("Pris: 2000");
    }


}
