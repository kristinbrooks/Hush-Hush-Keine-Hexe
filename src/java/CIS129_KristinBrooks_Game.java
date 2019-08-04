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
        System.out.println(board);
        initBoard();
        System.out.println(board);

        CIS129_KristinBrooks_Turn turn = new CIS129_KristinBrooks_Turn(boardData);

        turn.take();

        System.out.println("The game has ended.");
        boardData.showAllWitches();
        System.out.println(board);
    }

    private void initBoard() {
        // hide the witches
        boardData.hideAllWitches();
    }
}
