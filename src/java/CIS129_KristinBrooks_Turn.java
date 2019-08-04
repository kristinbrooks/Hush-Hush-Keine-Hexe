/***************************************************************
 * Kristin Brooks
 * CIS129
 * Final Project
 * Due: 8/5/19
 **************************************************************/

import java.util.Random;

public class CIS129_KristinBrooks_Turn {
    // field declarations

    // constructor

    // METHODS
    public void take() {
        System.out.print(rollDie());
    }

    private String rollDie() {
        // array with sides of the die
        String[] sides = {"B", "G", "Y", "R", "O", "S"};
        // create instance of random number generator
        Random random = new Random();
        return sides[random.nextInt(6)];
    }
}
