import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/***************************************************************
 * Kristin Brooks
 * CIS129
 * Final Project
 * Due: 8/5/19
 **************************************************************/

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
            numberPlayers = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Error reading from user.");
        }

        board.display();
        initBoard();
        board.display();

        gameLoop(numberPlayers);

        System.out.println("The game has ended.");
        boardData.showAllWitches();
        board.display();
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
        // hide the witches
        boardData.hideAllWitches();
    }
}
