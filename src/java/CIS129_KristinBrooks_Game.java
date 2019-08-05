/***************************************************************
 * Kristin Brooks
 * CIS129
 * Final Project
 * Due: 8/5/19
 *
 * This class runs the game.
 **************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CIS129_KristinBrooks_Game {
    // field declarations
    CIS129_KristinBrooks_BoardData boardData = new CIS129_KristinBrooks_BoardData();
    CIS129_KristinBrooks_Board board = new CIS129_KristinBrooks_Board(boardData);

    // METHODS
    // plays the game
    public void play() {
        // create input streams
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        int numberPlayers = 1;

        System.out.print("Welcome to Hush, Hush Kleine Hexe! How many players are there? ");

        try {
            String numPlayers = reader.readLine();
            while (!isNumPlayersValid(numPlayers)) {
                System.out.print("Invalid input. Please enter a number of players from 2 - 4: ");
                numPlayers = reader.readLine();
            }
            numberPlayers = Integer.parseInt(numPlayers);

        } catch (IOException e) {
            System.out.println("Error reading from user.");
        }

        System.out.println("Here is the board before it is shuffled.");
        board.display();
        initBoard();
        board.display();

        gameLoop(numberPlayers);

        System.out.println("The game has ended.");
        boardData.showAllWitches();
        board.display();
    }

    // makes sure the user entered 2 -4 players
    private boolean isNumPlayersValid(String numPlayers) {
        String regexPattern = "[2-4]";
        return numPlayers.matches(regexPattern);
    }

    // runs the looping players turns
    private void gameLoop(int numberPlayers) {
        int currentPlayer = 1;
        boolean wonGame = false;
        CIS129_KristinBrooks_Turn turn = new CIS129_KristinBrooks_Turn(boardData);

        while (!wonGame) {
            boolean playerGetsATurn = true;
            while (playerGetsATurn && !wonGame) {
                playerGetsATurn = turn.take(currentPlayer);
                board.display();
                wonGame = boardData.didWinGame();
            }
            currentPlayer++;
            if (currentPlayer > numberPlayers) {
                currentPlayer = 1;
            }
        }
        System.out.println("Congratulations! Player " + currentPlayer + " has won the game!!!");
    }

    // sets the board at the start of the game
    private void initBoard() {
        boardData.shuffleWitches();
        boardData.hideAllWitches();
    }
}
