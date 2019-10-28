//Matt Lynn

package co.gc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class movieApp 
{

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Movie> allMovies = new ArrayList<Movie>();
		//Movie movie = new Movie();
		Boolean cont;
		allMovies.add(new Movie("Brave Little Toaster","animated"));
		allMovies.add(new Movie("Oliver and Company","animated"));
		allMovies.add(new Movie("Cats", "horror"));
		allMovies.add(new Movie("The Godfather","drama"));
		allMovies.add(new Movie("Pacific Rim","scifi"));
		allMovies.add(new Movie("Halloween", "horror"));
		allMovies.add(new Movie("City of God", "drama"));
		allMovies.add(new Movie("23", "horror"));
		allMovies.add(new Movie("Predator", "scifi"));
		allMovies.add(new Movie("The Great Mouse Detective", "animated"));
		for(int i=0;i<100;i++)
		allMovies.add(MovieIO.getMovie(i));
		System.out.println("Welcome to the Movie List Application");
		System.out.println("There are " + allMovies.size() + " in this list.");
		do {
		do {
			cont = true;
			//do loop here
			System.out.println("What category are you interested in?");
			System.out.println("1. Animated");
			System.out.println("2. Comedy");
			System.out.println("3. Drama");
			System.out.println("4. Musical");
			System.out.println("5. Scifi");
			System.out.print("Please enter a number: ");
			switch (scan.nextLine()) {
			case "1":
				for (int i = 0; i < allMovies.size(); i++) {
					if (allMovies.get(i).getCategory().equals("animated"))
						System.out.println(allMovies.get(i).getTitle());
				}
				break;

			case "2":
				for (int i = 0; i < allMovies.size(); i++) {
					if (allMovies.get(i).getCategory().equals("drama"))
						System.out.println(allMovies.get(i).getTitle());
				}
				break;

			case "3":
				for (int i = 0; i < allMovies.size(); i++) {
					if (allMovies.get(i).getCategory().equals("horror"))
						System.out.println(allMovies.get(i).getTitle());

				}
				break;

			case "4":
				for (int i = 0; i < allMovies.size(); i++) {
					if (allMovies.get(i).getCategory().equals("musical"))
						System.out.println(allMovies.get(i).getTitle());
				}
				break;

			case "5":
				for (int i = 0; i < allMovies.size(); i++) {
					if (allMovies.get(i).getCategory().equals("scifi"))
						System.out.println(allMovies.get(i).getTitle());
				}
				break;

			default:

				System.out.println("Sorry, that wasn't one of options. Please try again.");
				cont = false;
			}
			
		} while (!cont);
		
		System.out.println("\nContinue? (Y/N)");
		if(scan.nextLine().equalsIgnoreCase("n"))
			{
			scan.close();
			System.out.println("Goodbye!");
			System.exit(0);
			}
		
		} while(true);
		
		

	}

}
