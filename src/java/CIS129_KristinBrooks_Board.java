/***************************************************************
 * Kristin Brooks
 * CIS129
 * Final Project
 * Due: 8/5/19
 **************************************************************/

public class CIS129_KristinBrooks_Board {
    // field declarations
    CIS129_KristinBrooks_Row[] rows = new CIS129_KristinBrooks_Row[5];

    // constructor
    public CIS129_KristinBrooks_Board(CIS129_KristinBrooks_Witch[][] boardData) {
        for (int i = 0; i < boardData.length; i++) {
            CIS129_KristinBrooks_Witch[] rowData = boardData[i];
            CIS129_KristinBrooks_Row row = new CIS129_KristinBrooks_Row(rowData);
            rows[i] = row;
        }
    }

    // METHODS

    public String printIt() {
        // create instance of StringBuffer
        StringBuilder out = new StringBuilder();

        for (int i = rows.length - 1; i >= 0; i--) {
            // put the row number at the beginning of the string
            out.append("|").append(i + 1).append("|");
            out.append(rows[i]);
            out.append("\n");
        }
        return out.toString();
    }

}