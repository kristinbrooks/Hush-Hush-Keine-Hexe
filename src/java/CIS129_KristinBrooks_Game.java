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
        board.display();
        initBoard();
        board.display();

        CIS129_KristinBrooks_Turn turn = new CIS129_KristinBrooks_Turn(boardData);

        boolean wonGame = false;

        while (!wonGame) {
            boolean playerGetsATurn = true;
            while (playerGetsATurn && !wonGame) {
                playerGetsATurn = turn.take();
                board.display();
                wonGame = boardData.didWinGame();
            }
            if (wonGame) {
                System.out.println("Congratulations! You have won the game!!!");
            }
        }

        System.out.println("The game has ended.");
        boardData.showAllWitches();
        board.display();
    }

    private void initBoard() {
        // hide the witches
        boardData.hideAllWitches();
    }
}
