/***************************************************************************
 * Kristin Brooks
 * CIS129
 * Final Project
 * Due: 8/5/2019
 *
 * This program runs the game Hush, Hush Kleine Hexe for 2-4 players.
 **************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CIS129_KristinBrooks_FP {

    public static void main(String[] args) {
        // define input steams
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);


        // declarations


        try {
            reader.readLine();


        } catch (IOException e) {
            System.out.println("Error reading from user");
        }

    }

}