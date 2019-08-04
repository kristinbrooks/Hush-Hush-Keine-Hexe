/***************************************************************
 * Kristin Brooks
 * CIS129
 * Final Project
 * Due: 8/5/19
 **************************************************************/

public class CIS129_KristinBrooks_Game {
    // field declarations
    CIS129_KristinBrooks_Witch[][] boardData = new CIS129_KristinBrooks_Witch[5][5];
    CIS129_KristinBrooks_Board board;

    // constructor
    public CIS129_KristinBrooks_Game() {
        CIS129_KristinBrooks_Witch witch0 = new CIS129_KristinBrooks_Witch("O");
        CIS129_KristinBrooks_Witch witch1 = new CIS129_KristinBrooks_Witch("Y");
        CIS129_KristinBrooks_Witch witch2 = new CIS129_KristinBrooks_Witch("R");
        CIS129_KristinBrooks_Witch witch3 = new CIS129_KristinBrooks_Witch("B");
        CIS129_KristinBrooks_Witch witch4 = new CIS129_KristinBrooks_Witch("G");

        CIS129_KristinBrooks_Witch[] rowData = {witch0, witch1, witch2, witch3, witch4};

        boardData[0] = rowData;

        board = new CIS129_KristinBrooks_Board(boardData);
    }

    // METHODS
    public void play() {
        System.out.println(board);
        initBoard();
        System.out.println(board);

        CIS129_KristinBrooks_Turn turn = new CIS129_KristinBrooks_Turn();

        turn.take();
    }

    private void initBoard() {
        // hide the witches
        for (int i = 0; i < boardData[0].length; i++) {
            boardData[0][i].hide();
        }
    }
}
