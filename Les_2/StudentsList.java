import java.util.Scanner;
import java.util.HashMap;

public class StudentsList {
  public static void main(String[] args) {
    /*
     * Create new scanner to read input
     */
    Scanner scanner = new Scanner(System.in);

    /*
     * Create student list Hashmap
     */
    HashMap<String, Integer> students = new HashMap<>();

    /*
     * Welcome user
     */
    System.out.println("Welcome to the Students list");

    /*
     * Start program loop
     */
    while (true) {
      /*
       * Prints a linebreak
       */
      System.out.println("-".repeat(48));

      /*
       * Ask user which action he wants to perform
       */
      System.out.println("Which action do you want to perform next?");
      System.out.println("1: Add a student");
      System.out.println("2: Remove a student");
      System.out.println("3: See list of students");
      Integer action = scanner.nextInt();

      /*
       * Check if input is valid
       */
      if (action < 1 || action > 3) {
        System.out.println("Invalid input. Please choose one of the listed options");
        continue;
      }

      /*
       * Ask user which action he wants to perform
       */
      switch (action) {
        case 1: {
          /*
           * Asks user for student name
           */
          System.out.println("You are now adding a student.");
          System.out.println("What is the students name?");
          scanner.nextLine(); // Consume the remaining newline to make input line stay
          String studentName = scanner.nextLine().trim().toLowerCase();

          /*
           * Asks user for student age
           */
          System.out.println("And what is the age of the student?");
          Integer studentAge = scanner.nextInt();

          /*
           * Add student to students list
           */
          students.put(studentName, studentAge);
          System.out.println("You have added " + studentName + " to the students list.");
          break;
        }
        case 2: {
          /*
           * Asks user for student name
           */
          System.out.println("You are now removing a student.");
          System.out.println("What is the students name?");
          scanner.nextLine(); // Consume the remaining newline to make input line stay
          String studentName = scanner.nextLine().trim().toLowerCase();

          /*
           * Remove student from students list
           */
          students.remove(studentName);
          System.out.println("You have removed " + studentName + " from the students list.");
          break;
        }
        case 3: {
          /*
           * Print all student records
           */
          for (String student : students.keySet()) {
            System.out.println(student + ": " + students.get(student) + " years");
          }
          break;
        }
        default:
          break;
      }

      /*
       * Ask if user wants to continue
       */
      System.out.println("Do you want to perform another action? (yes/no)");
      scanner.nextLine(); // Consume the remaining newline to make input line stay
      String again = scanner.nextLine().trim().toLowerCase();

      if (!again.equals("yes")) {
        break;
      }
    }
    scanner.close();
  }
}
