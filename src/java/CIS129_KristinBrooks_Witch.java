/***************************************************************
 * Kristin Brooks
 * CIS129
 * Final Project
 * Due: 8/5/19
 **************************************************************/

public class CIS129_KristinBrooks_Witch {
    // field declarations
    private final String color;
    Boolean shown = true;

    // constructor
    public CIS129_KristinBrooks_Witch(String color) {
        this.color = color;
    }

    // methods
    public String toString() {
        if (shown) {
            return color;
        } else {
            return "X";
        }
    }

}