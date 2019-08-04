/***************************************************************
 * Kristin Brooks
 * CIS129
 * Final Project
 * Due: 8/5/19
 **************************************************************/

public class CIS129_KristinBrooks_Row {
    // field declarations
    CIS129_KristinBrooks_Witch[] rowData;

    // constructor
    public CIS129_KristinBrooks_Row(CIS129_KristinBrooks_Witch[] rowData) {
        this.rowData = rowData;
    }

    // METHODS

    // make string with the row number and witches or blank spaces
    public String toString() {
        // create instance of StringBuilder
        StringBuilder out = new StringBuilder();

        // loop to make the row of witches
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