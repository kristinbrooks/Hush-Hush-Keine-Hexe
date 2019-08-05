/***************************************************************
 * Kristin Brooks
 * CIS129
 * Final Project
 * Due: 8/5/19
 *
 * This class holds the features of an individual witch.
 **************************************************************/

public class CIS129_KristinBrooks_Witch {
    // field declarations
    private String color;
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

    // sets shown when we want the witch covered by an X
    public void hide() {
        shown = false;
    }

    // the getter for the witch's color
    public String getColor() {
        return color;
    }

    // the setter for the witch's color
    public void setColor(String color) {
        this.color = color;
    }

    // reveals the color of the witch on the board
    public void show() {
        shown = true;
    }
}