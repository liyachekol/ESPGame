/*
 * Class: CMSC203 CRN 40539
 * Program: Lab 1( MovieDriverTask1)
 * Instructor: Dr. Grinberg
 * Summary of Description: prompt the user to enter a movie's title, rating, and number of tickets sold.
 * creates a Movie object with that information and displays it. Doesnt loop.
 * Due Date: 06/30/2025
 * 
 * Integrity Pledge: I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * 
 * Your Name: Liya Chekol
 */




import java.util.Scanner;

public class MovieDriverTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Movie movie = new Movie();

        System.out.print("Enter the name of a movie: ");
        String title = scanner.nextLine();
        movie.setTitle(title);

        System.out.print("Enter the rating of this movie: ");
        String rating = scanner.nextLine();
        movie.setRating(rating);

        System.out.print("Enter the number of tickets sold for this movie: ");
        int ticketsSold = scanner.nextInt();
        scanner.nextLine();
        movie.setSoldTickets(ticketsSold);

        System.out.println("\n" + movie.toString());

        scanner.close();
    }
}
