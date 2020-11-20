package com.company;

import gui_codebehind.GUI_Center;
import gui_fields.*;
import gui_main.GUI;

import static java.lang.Integer.parseInt;

public class GameBoard {

    public GUI gui;
    public int maxPlayers;
    public GUI_Field[] fields = new GUI_Field[]{
            new GUI_Start(),
            new GUI_Street(),
            new GUI_Street(),
            new GUI_Chance(),
            new GUI_Street(),
            new GUI_Street(),
            new GUI_Jail(),
            new GUI_Street(),
            new GUI_Street(),
            new GUI_Chance(),
            new GUI_Street(),
            new GUI_Street(),
            new GUI_Tax(),
            new GUI_Street(),
            new GUI_Street(),



    };

    public void createBoard() {


        fields[0].setTitle("Start");

        fields[1].setTitle("Burgerbaren");

        fields[2].setTitle("Pizzaria");

        fields[3].setTitle("Chance");

        fields[4].setTitle("Slikbutikken");

        fields[5].setTitle("Iskiosken");

        fields[6].setTitle("Fængsel");

        fields[7].setTitle("Museum");

        fields[8].setTitle("Biblotek");

        fields[9].setTitle("Chance");

        fields[10].setTitle("Skaterparken");

        fields[11].setTitle("Svømmingpool");

        fields[12].setTitle("Parkering");

        fields[13].setTitle("Spillehallen");

        fields[14].setTitle("Biografen");

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

        GUI_Field Slikbutikken = gui.getFields()[4];
        GUI_Ownable SlikbutikkenOwnable = (GUI_Ownable) Slikbutikken;
        SlikbutikkenOwnable.setSubText("Pris 1500");

        GUI_Field Iskiosken = gui.getFields()[5];
        GUI_Ownable IskioskenOwnable = (GUI_Ownable) Iskiosken;
        IskioskenOwnable.setSubText("Pris 2500");

        GUI_Field Museum = gui.getFields()[5];
        GUI_Ownable MuseumOwnable = (GUI_Ownable) Museum;
        MuseumOwnable.setSubText("Pris 2500");

        GUI_Field Biblotek = gui.getFields()[8];
        GUI_Ownable BiblotekOwnable = (GUI_Ownable) Biblotek;
        MuseumOwnable.setSubText("Pris 3000");

        GUI_Field Skaterparken = gui.getFields()[10];
        GUI_Ownable SkaterparkenOwnable = (GUI_Ownable) Skaterparken;
        SkaterparkenOwnable.setSubText("Pris 2400");

        GUI_Field Svømmingpool = gui.getFields()[11];
        GUI_Ownable SvømmingpoolOwnable = (GUI_Ownable) Svømmingpool;
        SvømmingpoolOwnable.setSubText("Pris 1400");

        GUI_Field Spillehallen = gui.getFields()[13];
        GUI_Ownable SpillehallenOwnable = (GUI_Ownable) Spillehallen;
        SpillehallenOwnable.setSubText("Pris 2000");

        GUI_Field Biografen = gui.getFields()[14];
        GUI_Ownable BiografenOwnable = (GUI_Ownable) Biografen;
        BiografenOwnable.setSubText("Pris 2700");








    }


}
