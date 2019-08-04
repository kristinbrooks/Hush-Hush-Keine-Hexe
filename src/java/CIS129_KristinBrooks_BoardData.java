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
        String tempColor = witches[witchIndex1].getColor();
        witches[witchIndex1].setColor(witches[witchIndex2].getColor());
        witches[witchIndex2].setColor(tempColor);
    }

}
