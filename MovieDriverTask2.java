/*
 * Class: CMSC203 CRN 40539
 * Program: Lab 1( MovieDriverTask2)
 * Instructor: Dr. Grinberg
 * Summary of Description: prompt the user to enter a movie's title, rating, and number of tickets sold.
 * create a Movie object with that information and displays it. The process repeats until the user chooses to stop.
 * Due Date: 06/30/2025
 * 
 * Integrity Pledge: I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * 
 * Your Name: Liya Chekol
 */



import java.util.Scanner;

public class MovieDriverTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        do {
            
            Movie movie = new Movie();

           
            System.out.print("Enter the name of a movie: ");  //getting title
            String title = scanner.nextLine();
            movie.setTitle(title);

            
            System.out.print("Enter the rating of the movie: ");
            String rating = scanner.nextLine();
            movie.setRating(rating);

            
            System.out.print("Enter the number of tickets sold for this movie: ");
            int ticketsSold = scanner.nextInt();
            scanner.nextLine();  
            movie.setSoldTickets(ticketsSold);

            
            System.out.println("\n" + movie.toString());

            
            System.out.print("Do you want to enter another? (y or n): ");
            continueInput = scanner.nextLine();

        } while (continueInput.equalsIgnoreCase("y"));

        System.out.println("Goodbye!!");
        scanner.close();
    }
}
