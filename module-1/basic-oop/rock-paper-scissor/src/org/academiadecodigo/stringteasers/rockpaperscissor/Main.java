package org.academiadecodigo.stringteasers.rockpaperscissor;

public class Main {

    public static void main(String[] args) {

        Game game = new Game(10, new Player("Alice"), new Player("Paula"));

        game.start();

    }
}
