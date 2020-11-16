package com.company;


public class Main {

    public static Player player;
    public static GameBoard board = new GameBoard();
    public static Game game = new Game();

    public static void main(String[] args) {
        board.createBoard();
        board.addProperties();

        /* Tilføjer spillere alt efter hvor mange spillere man er vha. et for loop og sætter alle spillerne i en array.
           Hvis "i" tæller fra 0 og til op til fx max 2 spillere, så vil den forsøge at oprette 3 gendstande til array
           Derfor starter vi at tælle fra 1 og bagefter trækker 1 fra, da array starter med index 0
           Her bliver spillerne gemt i "players" array fra Player klassen */

        for (int i = 1; i <= board.maxPlayers; i++) {
            player = new Player();
            Player.players[i - 1] = player;
            player.createPlayer();
//            System.out.println(Player.players[i - 1].GuiPlayer.getBalance());
        }
        game.game();
    }
}
