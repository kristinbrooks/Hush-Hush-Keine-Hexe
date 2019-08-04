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

    // METHODS

    // tells what should be printed in a space that has a witch in it
    public String toString() {
        if (shown) {
            return color;
        } else {
            return "X";
        }
    }

    // sets shown when we want it covered by an X
    public void setShown() {
        shown = false;
    }

}