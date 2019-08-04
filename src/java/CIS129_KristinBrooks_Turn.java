/***************************************************************
 * Kristin Brooks
 * CIS129
 * Final Project
 * Due: 8/5/19
 **************************************************************/

import java.util.Random;

public class CIS129_KristinBrooks_Turn {
    // field declarations
    private CIS129_KristinBrooks_BoardData boardData;

    // constructor
    public CIS129_KristinBrooks_Turn(CIS129_KristinBrooks_BoardData boardData) {
        this.boardData = boardData;
    }

    // METHODS
    public void take() {
        String roll = rollDie();
        roll = "S";

        if (roll.equals("S")) {
            System.out.print("You rolled " + roll + ". Enter column numbers 'c1,c2' to shuffle or 'x' to end your turn: ");
            String input = "1,3";
            String[] columns = input.split(",");
            boardData.shuffle(Integer.parseInt(columns[0]), Integer.parseInt(columns[1]));
        }

    }

    private String rollDie() {
        // array with sides of the die
        String[] sides = {"B", "G", "Y", "R", "O", "S"};
        // create instance of random number generator
        Random random = new Random();
        return sides[random.nextInt(6)];
    }
}
