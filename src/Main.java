import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their party affiliation
        System.out.print("Enter your party affiliation (D for Democrat, R for Republican, I for Independent): ");
        String input = scanner.nextLine().trim().toUpperCase();

        // Determine the party affiliation
        if (input.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (input.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (input.equals("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get an Other.");
        }

    }
}