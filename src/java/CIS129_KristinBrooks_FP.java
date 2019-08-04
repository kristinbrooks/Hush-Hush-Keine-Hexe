/***************************************************************************
 * Kristin Brooks
 * CIS129
 * Final Project
 * Due: 8/5/2019
 *
 * This program runs the game Hush, Hush Kleine Hexe for 2-4 players.
 **************************************************************************/

public class CIS129_KristinBrooks_FP {

    public static void main(String[] args) {
        CIS129_KristinBrooks_Witch witch0 = new CIS129_KristinBrooks_Witch("P");
        CIS129_KristinBrooks_Witch witch1 = new CIS129_KristinBrooks_Witch("Y");
        CIS129_KristinBrooks_Witch witch2 = new CIS129_KristinBrooks_Witch("R");
        CIS129_KristinBrooks_Witch witch4 = new CIS129_KristinBrooks_Witch("G");

        witch1.setShown();

        CIS129_KristinBrooks_Witch[] witches = {witch0, witch1, witch2, null, witch4};

        CIS129_KristinBrooks_Row row = new CIS129_KristinBrooks_Row(3, witches);

        System.out.print(row);
    }

}