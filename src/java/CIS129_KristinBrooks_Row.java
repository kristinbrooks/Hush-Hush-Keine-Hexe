/***************************************************************
 * Kristin Brooks
 * CIS129
 * Final Project
 * Due: 8/5/19
 **************************************************************/

public class CIS129_KristinBrooks_Row {
    // field declarations
    int rowNum;
    CIS129_KristinBrooks_Witch[] rowData;

    // constructor
    public CIS129_KristinBrooks_Row(int rowNum, CIS129_KristinBrooks_Witch[] rowData) {
        this.rowNum = rowNum;
        this.rowData = rowData;
    }

    // METHODS

    // make string with the row number and witches or blank spaces
    public String toString() {
        // create instance of StringBuffer
        StringBuilder out = new StringBuilder();
        // put the row number at the beginning of the string
        out.append("|").append(rowNum).append("|");
        // loop to finish the string
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