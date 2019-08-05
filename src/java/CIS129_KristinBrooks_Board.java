/***************************************************************
 * Kristin Brooks
 * CIS129
 * Final Project
 * Due: 8/5/19
 *
 * This class constructs the board and displays it.
 **************************************************************/

public class CIS129_KristinBrooks_Board {
    // field declarations
    CIS129_KristinBrooks_Row[] rows = new CIS129_KristinBrooks_Row[5];

    // constructor
    public CIS129_KristinBrooks_Board(CIS129_KristinBrooks_BoardData boardData) {
        for (int i = 0; i < boardData.getData().length; i++) {
            CIS129_KristinBrooks_Witch[] rowData = boardData.getData()[i];
            CIS129_KristinBrooks_Row row = new CIS129_KristinBrooks_Row(rowData);
            rows[i] = row;
        }
    }

    // METHODS
    // creates the game board of rows and columns
    public String toString() {
        // create instance of StringBuilder
        StringBuilder out = new StringBuilder();
        for (int i = rows.length - 1; i >= 0; i--) {
            // add horizontal lines
            out.append("-------------\n");
            // put the row number at the beginning of the row string
            out.append("|").append(i + 1).append("|");
            // the rows of witches/spaces
            out.append(rows[i]);
            out.append("\n");
        }
        out.append("-------------\n");
        // put column numbers at the bottom of the board
        out.append("| |1|2|3|4|5|\n");
        out.append("-------------");
        return out.toString();
    }

    // display the board
    public void display() {
        System.out.println(this);
    }
}