/***************************************************************
 * Kristin Brooks
 * CIS129
 * Final Project
 * Due: 8/5/19
 *
 * This class creates a row of the board containing some
 * combination of witches and spaces.
 **************************************************************/

public class CIS129_KristinBrooks_Row {
    // field declarations
    CIS129_KristinBrooks_Witch[] rowData;

    // constructor
    public CIS129_KristinBrooks_Row(CIS129_KristinBrooks_Witch[] rowData) {
        this.rowData = rowData;
    }

    // METHODS
    // make string row of witches and/or blank spaces
    public String toString() {
        // create instance of StringBuilder
        StringBuilder out = new StringBuilder();
        for (CIS129_KristinBrooks_Witch rowDatum : rowData) {
            if (rowDatum == null) {
                out.append(" ");
            } else {
                out.append(rowDatum);
            }
            out.append("|");
        }
        return out.toString();
    }

}