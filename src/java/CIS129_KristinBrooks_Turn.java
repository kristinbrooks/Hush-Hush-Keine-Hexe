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
    private CIS129_KristinBrooks_Board board;

    // constructor
    public CIS129_KristinBrooks_Turn(CIS129_KristinBrooks_BoardData boardData) {
        this.boardData = boardData;
        this.board = new CIS129_KristinBrooks_Board(boardData);
    }

    // METHODS
    public void take() {
        String roll = rollDie();

        if (roll.equals("S")) {
            shuffleTurn(roll);
        } else {
            guessTurn(roll);
        }
        board.display();


    }

    private void guessTurn(String roll) {
        System.out.print("You rolled " + roll + ". Enter the column 'c' of the witch you would like to guess: ");
        int column = 4;
        boardData.showWitch(column);
        board.display();
        boardData.hideWitch(column);
        Boolean witchDoesMatch = boardData.doesWitchMatch(roll, column);
        if (witchDoesMatch) {
            boardData.moveWitch(column);
        }
    }

    private void shuffleTurn(String roll) {
        System.out.print("You rolled " + roll + ". Enter column numbers 'c1,c2' of the witches you'd like to " +
                "shuffle or 'x' to end your turn: ");
        String input = "1,3";
        String[] columns = input.split(",");
        boardData.shuffle(Integer.parseInt(columns[0]), Integer.parseInt(columns[1]));
    }

    private String rollDie() {
        // array with sides of the die
        String[] sides = {"B", "G", "Y", "R", "O", "S"};
        // create instance of random number generator
        Random random = new Random();
        return sides[random.nextInt(6)];
    }
}
