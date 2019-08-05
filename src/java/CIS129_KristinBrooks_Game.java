/***************************************************************
 * Kristin Brooks
 * CIS129
 * Final Project
 * Due: 8/5/19
 **************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CIS129_KristinBrooks_Game {
    // field declarations
    CIS129_KristinBrooks_BoardData boardData = new CIS129_KristinBrooks_BoardData();
    CIS129_KristinBrooks_Board board = new CIS129_KristinBrooks_Board(boardData);

    // METHODS
    public void play() {
        // create input streams
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        int numberPlayers = 1;

        System.out.print("Welcome to Hush, Hush Keine Hexe! How many players are there? ");

        try {
            String numPlayers = reader.readLine();
            while (!isNumPlayersValid(numPlayers)) {
                System.out.print("Invalid input. Please enter a number of players from 1 - 4: ");
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

    private boolean isNumPlayersValid(String numPlayers) {
        String regexPattern = "[1-4]";
        return numPlayers.matches(regexPattern);
    }

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

    private void initBoard() {
        boardData.shuffleWitches();
        // hide the witches
        boardData.hideAllWitches();
    }
}
