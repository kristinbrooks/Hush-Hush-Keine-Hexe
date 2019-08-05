/***************************************************************
 * Kristin Brooks
 * CIS129
 * Final Project
 * Due: 8/5/19
 **************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        // create input streams
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        try {
            Boolean witchDoesMatch = true;
            while (witchDoesMatch) {
                System.out.print("You rolled " + roll + ". Enter the column 'c' of the witch you would like to guess: ");
                String columnNum = reader.readLine();
                while (!isColumnNumValid(columnNum)) {
                    System.out.print("Invalid input. Please enter a column number from 1-5: ");
                    columnNum = reader.readLine();
                }
                int column = Integer.parseInt(columnNum);
                boardData.showWitch(column);
                board.display();
                boardData.hideWitch(column);
                witchDoesMatch = boardData.doesWitchMatch(roll, column);
                if (witchDoesMatch) {
                    System.out.println("Your guess was a match, so your turn continues.");
                    boardData.moveWitch(column);
                    board.display();
                    roll = rollDie();
                } else {
                    System.out.println("It was not a match. Your turn is over.");
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading from user.");
        }
    }

    private boolean isColumnNumValid(String columnNum) {
        String regexPattern = "[1-5]";
        return columnNum.matches(regexPattern);
    }

    private void shuffleTurn(String roll) {
        // create input streams
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        try {
            int count = 0;
            String shuffleAgain = "y";

            System.out.print("You rolled " + roll + ". You can shuffle up to 5 times.");
            while (shuffleAgain.compareToIgnoreCase("y") == 0 && (count < 5)) {
                System.out.println("Enter column numbers 'c1,c2' of the witches you'd like to shuffle: ");
                String locations = reader.readLine();
                while (!isLocationValid(locations)) {
                    System.out.print("Input invalid. Please enter 'c1,c2': ");
                    locations = reader.readLine();
                }
                String[] columns = locations.split(",");
                boardData.shuffle(Integer.parseInt(columns[0]), Integer.parseInt(columns[1]));
                count += 1;
                if (count < 5) {
                    System.out.print("Would you like to shuffle again? (y/n) ");
                    shuffleAgain = reader.readLine();
                    while (!isShuffleAgainInputValid(shuffleAgain)) {
                        System.out.print("Invalid input. Please enter 'y' or 'n': ");
                        shuffleAgain = reader.readLine();
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading from user.");
        }
    }

    private boolean isLocationValid(String locations) {
        String regexPattern = "\\d,\\d";
        return locations.matches(regexPattern);
    }

    private Boolean isShuffleAgainInputValid(String answer) {
        return (answer.compareToIgnoreCase("y") == 0 || answer.compareToIgnoreCase("n") == 0);
    }

    private String rollDie() {
        // array with sides of the die
        String[] sides = {"B", "G", "Y", "R", "O", "S"};
        // create instance of random number generator
        Random random = new Random();
        return sides[random.nextInt(6)];
    }
}
