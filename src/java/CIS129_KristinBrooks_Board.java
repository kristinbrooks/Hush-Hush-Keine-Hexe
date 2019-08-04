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
            CIS129_KristinBrooks_Row row = new CIS129_KristinBrooks_Row(i, rowData);
            rows[i] = row;
        }
    }

    // METHODS

    public String toString() {
        // create instance of StringBuffer
        StringBuilder out = new StringBuilder();
        //
        for (CIS129_KristinBrooks_Row row : rows) {
            out.append(row);
            out.append("\n");
        }
        return out.toString();
    }

}