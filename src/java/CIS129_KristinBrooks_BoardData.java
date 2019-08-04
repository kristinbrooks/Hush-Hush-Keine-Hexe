/***************************************************************
 * Kristin Brooks
 * CIS129
 * Final Project
 * Due: 8/5/19
 **************************************************************/

public class CIS129_KristinBrooks_BoardData {
    // field declarations
    private CIS129_KristinBrooks_Witch[][] data = new CIS129_KristinBrooks_Witch[5][5];
    private CIS129_KristinBrooks_Witch[] witches;

    // constructor
    public CIS129_KristinBrooks_BoardData() {
        CIS129_KristinBrooks_Witch witch0 = new CIS129_KristinBrooks_Witch("O");
        CIS129_KristinBrooks_Witch witch1 = new CIS129_KristinBrooks_Witch("Y");
        CIS129_KristinBrooks_Witch witch2 = new CIS129_KristinBrooks_Witch("R");
        CIS129_KristinBrooks_Witch witch3 = new CIS129_KristinBrooks_Witch("B");
        CIS129_KristinBrooks_Witch witch4 = new CIS129_KristinBrooks_Witch("G");

        witches = new CIS129_KristinBrooks_Witch[]{witch0, witch1, witch2, witch3, witch4};
        CIS129_KristinBrooks_Witch[] rowData = {witch0, witch1, witch2, witch3, witch4};

        data[0] = rowData;
    }

    // METHODS

    public CIS129_KristinBrooks_Witch[][] getData() {
        return data;
    }

    public void hideAllWitches() {
        // hide the witches
        for (CIS129_KristinBrooks_Witch witch : witches) {
            witch.hide();
        }
    }

    public void showAllWitches() {
        // show the witches
        for (CIS129_KristinBrooks_Witch witch : witches) {
            witch.show();
        }
    }

    public void shuffle(int witchIndex1, int witchIndex2) {
        int index1 = witchIndex1 - 1;
        int index2 = witchIndex2 - 1;
        String tempColor = witches[index1].getColor();
        witches[index1].setColor(witches[index2].getColor());
        witches[index2].setColor(tempColor);
    }

    public Boolean doesWitchMatch(String color, int columnNumber) {
        return color.equals(witches[columnNumber - 1].getColor());
    }

    public void showWitch(int input) {
        witches[input - 1].show();
    }

    public void hideWitch(int input) {
        witches[input - 1].hide();
    }

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
}
