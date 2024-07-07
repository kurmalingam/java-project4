import java.util.Scanner;

public class TextAdventureGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playing = true;

        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself in a mysterious place...\n");

        while (playing) {
            System.out.println("What will you do?");
            System.out.println("1. Go left");
            System.out.println("2. Go right");
            System.out.println("3. Check your inventory");
            System.out.println("4. Quit the game");

            int choice = getUserChoice(scanner, 1, 4);

            switch (choice) {
                case 1:
                    System.out.println("You chose to go left.");
                    break;
                case 2:
                    System.out.println("You chose to go right.");
                    break;
                case 3:
                    System.out.println("You check your inventory.");
                    break;
                case 4:
                    System.out.println("You quit the game. Goodbye!");
                    playing = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    break;
            }
        }

        scanner.close();
    }

    private static int getUserChoice(Scanner scanner, int min, int max) {
        int choice = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= min && choice <= max) {
                    isValid = true;
                } else {
                    System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); 
            }
        }

        return choice;
    }
}