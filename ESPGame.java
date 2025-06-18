import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Random;

public class ESPGame {
    public static void main(String[] args) {
       final String FILE = "colors.txt";
        final int TOTAL_COLORS = 16;

       final String Color_1 = "black";
       final String Color_2 = "white";
      final String Color_3 = "gray";
      final String Color_4 = "silver";
       final String Color_5 = "maroon";
      final String Color_6 = "red";
       final String Color_7 = "purple";
      final String Color_8 = "fuchsia";
      final String Color_9 = "green";
       final String Color_10 = "lime";
       final String Color_11 = "olive";
       final String Color_12 = "yellow";
       final String Color_13 = "navy";
        final String Color_14 = "blue";
        final String Color_15 = "teal";
        final String Color_16 = "aqua";

       Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String playAgain = "Yes";

        while (playAgain.equalsIgnoreCase("Yes")) {
            System.out.println("Would you please choose one of the 4 options from the menu:\n");
            System.out.println("1 - Show the first 16 names of colors from colors.txt");
            System.out.println("2 - Show the first 10 names of colors from colors.txt");
            System.out.println("3 - Show the first 5 names of colors from colors.txt");
            System.out.println("4 - Exit from program");
            System.out.print("Enter Your option: ");

            int options = input.nextInt();
            input.nextLine(); 

            int color_Limit = 0;

            if (options == 1) {
                color_Limit = 16; } 
            else if (options == 2) {
                color_Limit = 10; } 
            else if (options == 3) {
                color_Limit = 5;} 
            else if (options == 4) {
                break; } 
            else {
                System.out.println("Your input was not valid. Please try again");
                continue; }

        
            try {
                File file = new File(FILE);
                Scanner fileScanner = new Scanner(file);
                System.out.println("\nThere are colors from the file:\n");
                int count = 1;
                while (fileScanner.hasNextLine() && count <= color_Limit) {
                    String color = fileScanner.nextLine();
                    System.out.println(count + " " + color);
                    count++;
                }
                fileScanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("colors.txt file not found!");
                return;  }

            int Count = 0;

            for (int round = 1; round <= 3; round++) {
                int randomNum = rand.nextInt(color_Limit) + 1;
                String chosenColor = "";

                if (randomNum == 1) chosenColor = Color_1;
                else if (randomNum == 2) chosenColor = Color_2;
                else if (randomNum == 3) chosenColor = Color_3;
                else if (randomNum == 4) chosenColor = Color_4;
                else if (randomNum == 5) chosenColor = Color_5;
                else if (randomNum == 6) chosenColor = Color_6;
                else if (randomNum == 7) chosenColor = Color_7;
                else if (randomNum == 8) chosenColor = Color_8;
                else if (randomNum == 9) chosenColor = Color_9;
                else if (randomNum == 10) chosenColor = Color_10;
                else if (randomNum == 11) chosenColor = Color_11;
                else if (randomNum == 12) chosenColor = Color_12;
                else if (randomNum == 13) chosenColor = Color_13;
                else if (randomNum == 14) chosenColor = Color_14;
                else if (randomNum == 15) chosenColor = Color_15;
                else if (randomNum == 16) chosenColor = Color_16;

                System.out.println("\n Round " + round);
                System.out.println("I am thinking of a color.");
                System.out.println("Is it one of the colors listed above?");
                System.out.print("Enter your guess: ");
                String guess = input.nextLine();

                System.out.println("I was thinking of " + chosenColor.substring(0, 1).toUpperCase() + chosenColor.substring(1) + ".");

                if (guess.equalsIgnoreCase(chosenColor)) {
                    Count++;
                } }

            System.out.println("\nGame Over");
            System.out.println("You guessed " + Count + " out of the 3 colors correctly.");

            try {
                PrintWriter writer = new PrintWriter("EspGameResults.txt");
                writer.println("Game Over");
                writer.println("You guessed " + Count + " out of 3 colors correctly.");
                writer.close(); } 
            catch (FileNotFoundException e) {
                System.out.println("Error writing to EspGameResults.txt."); }

      System.out.print("\n Would you like to continue a Game? Type Yes/No: ");
            playAgain = input.nextLine(); }

       
        System.out.print("please enter your name: ");
        String username = input.nextLine();
        System.out.print("Describe yourself: ");
        String description = input.nextLine();
        System.out.print("Due-Date(MM/DD): ");
        String dueDate = input.nextLine();

        System.out.println("\n Username: " + username);
        System.out.println("User Description: " + description);
        System.out.println("Date: " + dueDate);

    try {
          PrintWriter writer = new PrintWriter("EspGameResults.txt");
            writer.println("Game Over!!!");
            writer.println("Username: " + username);
            writer.println("User Description: " + description);
            writer.println("Date: " + dueDate);
            writer.close(); } catch (FileNotFoundException e) {
            System.out.println("Can't update EspGameResults.txt."); }

        input.close(); }
}
