package org.academiadecodigo.stringteasers.guessanumber;

public class Main {

    public static void main(String[] args) {

        Player[] players = new Player[]{
            new Player("Inês"),
            new Player("Diana"),
            new Player("Luís"),
            new Player("José")
        };

        Game game = new Game(10, players);

        game.start();
    }
}
