import java.util.Scanner;

public class LightningDistanceCalculator {
  public static void main(String[] args) {
    /*
     * Create new scanner to read input
     */
    Scanner scanner = new Scanner(System.in);

    /*
     * Start program loop
     */
    while (true) {
      /*
       * Prints a linebreak
       */
      System.out.println("-".repeat(48));

      /*
       * Ask user for length unit, then sanitize it
       */
      System.out.println("Do you want to use feet or meters? (Enter 'feet' or 'meters')");
      String unit = scanner.nextLine().trim().toLowerCase();

      /*
       * Check if input is valid
       */
      if (!unit.equals("feet") && !unit.equals("meters")) {
        System.out.println("Invalid input. Please enter 'feet' or 'meters'.");
        continue;
      }

      /*
       * Ask for duration between flash and bang
       */
      System.out.println("Enter the number of seconds from the flash of lightning to the sound of thunder:");
      double seconds = scanner.nextDouble();

      /*
       * Display results
       */
      double distance;
      if (unit.equals("feet")) {
        distance = seconds * 1100; // speed of sound ~1100 feet per second
        System.out.println("The distance is approximately " + distance + " feet.");
      } else {
        distance = seconds * 343; // speed of sound ~343 meters per second
        System.out.println("The distance is approximately " + distance + " meters.");
      }

      /*
       * Ask if user wants to calculate distance again
       */
      System.out.println("Do you want to calculate again? (yes/no)");
      scanner.nextLine(); // Consume the remaining newline to make input line stay
      String again = scanner.nextLine().trim().toLowerCase();
      if (!again.equals("yes")) {
        break;
      }
    }
    scanner.close();
  }
}
