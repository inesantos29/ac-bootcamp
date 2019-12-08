package org.academiadecodigo.stringteasers.guessanumber;

public class Game {

    private int maxGuess;
    private Player[] players;
    private boolean endGame;

    public Game(int maxGuess, Player[] players){
        this.maxGuess = maxGuess;
        this.players = players;
    }

    public void start() {

        int systemGuess = chooseNumber();
        System.out.println("## the system chooses the number " + systemGuess);

        while (!endGame){

            for (Player player : players) {

                int playerGuess = player.chooseNumber(maxGuess);
                System.out.println(player.getName() + " guessed number " + playerGuess);

                if(playerGuess == systemGuess){
                    System.out.println("## " + player.getName() + " wins! ##");
                    endGame = true;
                    break;
                }

                else if (systemGuess > playerGuess){
                    System.out.println("## " + player.getName() + " is too low ##");
                }

                else {
                    System.out.println("## " + player.getName() + " is too high ##");
                }
            }
        }
    }

    private int chooseNumber(){
        return RandomGenerator.getRandom(maxGuess);
    }
}
