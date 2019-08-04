/***************************************************************
 * Kristin Brooks
 * CIS129
 * Final Project
 * Due: 8/5/19
 **************************************************************/

public class CIS129_KristinBrooks_Row {
    // field declarations
    int rowNum;
    CIS129_KristinBrooks_Witch[] witches;

    // constructor
    public CIS129_KristinBrooks_Row(int rowNum, CIS129_KristinBrooks_Witch[] witches) {
        this.rowNum = rowNum;
        this.witches = witches;
    }

    // METHODS

    // make string with the row number and witches or blank spaces
    public String toString() {
        // create instance of StringBuffer
        StringBuffer out = new StringBuffer();
        // put the row number at the beginning of the string
        out.append("|"
                + rowNum
                + "|");
        // loop to finish the string
        for (int i = 0; i < witches.length; i++) {
            if (witches[i] == null) {
                out.append(" ");
            } else {
                out.append(witches[i]);
            }
            out.append("|");
        }
        return out.toString();
    }

}