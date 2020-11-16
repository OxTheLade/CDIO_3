package com.company;

public class Game {

    // Opretter 2 instanser af Die klassen, som skal være vores 2 terninger
    Die dice1 = new Die(1, 1);
    Die dice2 = new Die(1, 2);

    private int turn = 0;
    private boolean isPlaying = true;


    // Metode der beregner hvis tur det alt efter hvor mange spillere man er
    private void playerTurnCalculate() {
        if (Player.players.length == 2) {
            switch (turn) {
                case 0:
                    turn = 1;
                    playerTurn(Player.players[0]);
                    break;
                case 1:
                    turn = 0;
                    playerTurn(Player.players[1]);
                    break;
            }
        }
        if (Player.players.length == 3) {
            switch (turn) {
                case 0:
                    turn = 1;
                    playerTurn(Player.players[0]);
                    break;
                case 1:
                    turn = 2;
                    playerTurn(Player.players[1]);
                    break;
                case 2:
                    turn = 0;
                    playerTurn(Player.players[2]);
                    break;
            }
        }
        if (Player.players.length == 4) {
            switch (turn) {
                case 0:
                    turn = 1;
                    playerTurn(Player.players[0]);
                    break;
                case 1:
                    turn = 2;
                    playerTurn(Player.players[1]);
                    break;
                case 2:
                    turn = 3;
                    playerTurn(Player.players[2]);
                    break;
                case 3:
                    turn = 0;
                    playerTurn(Player.players[3]);
                    break;
            }
        }
    }




    // Metode der bestemmer hvad der sker, når det er en spillers tur
    private void playerTurn(Player player) {
        Main.board.gui.showMessage(player.playerName + "'s tur");
        String knap = Main.board.gui.getUserSelection("Slå med terningen", "Slå!");

        if (knap.equals("Slå!")) {

            int sum = dice1.diceTurn(dice1, dice2);
//            int sum = 2;

            Main.board.gui.setDice(dice1.diceNumber, dice2.diceNumber);
            System.out.println(sum);
            Main.board.gui.getFields()[player.playerPosition].setCar(player.GuiPlayer, false);
            player.playerPosition = player.playerPosition + sum;

            // Logik for når man er en runde over brættet.
            if (player.playerPosition >= Main.board.fields.length) {
                player.playerPosition = player.playerPosition - Main.board.fields.length;
            }
            Main.board.gui.getFields()[player.playerPosition].setCar(player.GuiPlayer, true);

        }

    }

    // en while loop der holder spillet kørende indtil en vinder er fundet.
    public void game() {
        while (isPlaying) {
            playerTurnCalculate();
        }
    }


}
