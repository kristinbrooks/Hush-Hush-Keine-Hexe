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

    // methods
    public String toString() {

        StringBuffer out = new StringBuffer();

        out.append("|"
                + rowNum
                + "|");
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