/***************************************************************
 * Kristin Brooks
 * CIS129
 * Final Project
 * Due: 8/5/19
 *
 * This class has the data about where the witches are on the
 * board and the methods that act on this data.
 **************************************************************/

import java.util.Random;

public class CIS129_KristinBrooks_BoardData {
    // field declarations
    private CIS129_KristinBrooks_Witch[][] data = new CIS129_KristinBrooks_Witch[5][5];
    private CIS129_KristinBrooks_Witch[] witches;

    // constructor
    public CIS129_KristinBrooks_BoardData() {
        // the individual withches on the board
        CIS129_KristinBrooks_Witch witch0 = new CIS129_KristinBrooks_Witch("O");
        CIS129_KristinBrooks_Witch witch1 = new CIS129_KristinBrooks_Witch("Y");
        CIS129_KristinBrooks_Witch witch2 = new CIS129_KristinBrooks_Witch("R");
        CIS129_KristinBrooks_Witch witch3 = new CIS129_KristinBrooks_Witch("B");
        CIS129_KristinBrooks_Witch witch4 = new CIS129_KristinBrooks_Witch("G");

        // the columns the witches are in
        witches = new CIS129_KristinBrooks_Witch[]{witch0, witch1, witch2, witch3, witch4};

        CIS129_KristinBrooks_Witch[] rowData = {witch0, witch1, witch2, witch3, witch4};
        data[0] = rowData; // the witches in the starting row of the game
    }

    // METHODS
    // the getter for the 2d array of board data
    public CIS129_KristinBrooks_Witch[][] getData() {
        return data;
    }

    // hides all the witches on the board
    public void hideAllWitches() {
        for (CIS129_KristinBrooks_Witch witch : witches) {
            witch.hide();
        }
    }

    // shows all the witches on the board
    public void showAllWitches() {
        for (CIS129_KristinBrooks_Witch witch : witches) {
            witch.show();
        }
    }

    // switches the positions of 2 witches
    public void shuffle(int column1, int column2) {
        int index1 = column1 - 1;
        int index2 = column2 - 1;
        String tempColor = witches[index1].getColor();
        witches[index1].setColor(witches[index2].getColor());
        witches[index2].setColor(tempColor);
    }

    // determines if the color of the dice roll matches the guessed witch
    public Boolean doesWitchMatch(String color, int columnNumber) {
        return color.equals(witches[columnNumber - 1].getColor());
    }

    // shows an individual witch
    public void showWitch(int input) {
        witches[input - 1].show();
    }

    // hides an individual witch
    public void hideWitch(int input) {
        witches[input - 1].hide();
    }

    // finds the which row the witch occupies in the column and moves it up the board by one space
    public void moveWitch(int column) {
        int witchesCurrentRowIndex = 0;
        int columnIndex = column - 1;
        for (int currentRowIndex = 0; currentRowIndex < data.length; currentRowIndex++) {
            if (data[currentRowIndex][columnIndex] != null) {
                witchesCurrentRowIndex = currentRowIndex;
            }
        }
        data[witchesCurrentRowIndex + 1][columnIndex] = data[witchesCurrentRowIndex][columnIndex];
        data[witchesCurrentRowIndex][columnIndex] = null;
    }

    // determines if any witches are in the 5th row
    public Boolean didWinGame() {
        for (int i = 0; i < witches.length; i++) {
            if (data[4][i] != null) {
                return true;
            }
        }
        return false;
    }

    // shuffles all the columns randomly at the start of the game
    public void shuffleWitches() {
        for (int i = 0; i <= 100; i++) {
            Random random = new Random();
            int column1 = random.nextInt(4) + 1;
            int column2 = random.nextInt(4) + 1;
            shuffle(column1, column2);
        }
    }
}
