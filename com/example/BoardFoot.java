import java.util.Scanner;

/**
 * Change me.
 *
 * @author Kevin Csiffary
 * @version 1.0
 * @since 2024-03-28
 */

// BoardFoot class
public final class BoardFoot {

  /** Define a board foot. */
  static final double BOARD_FOOT = 144.0;

  /** Private constructor to prevent instantiation. */
  private BoardFoot() {
    throw new UnsupportedOperationException("Cannot instantiate");
  }

  /**
   * This is the main method.
   *
   * @param args Unused
   */
  public static void main(final String[] args) {
    // Tell the user what the program does.
    System.out.print("This program calculates the length of your board ");
    System.out.println("foot given the width and height (in inches).");

    // Create the scanner.
    Scanner sc = new Scanner(System.in);

    try {
      // Get user input.
      System.out.println("What is the width of your board foot?");
      final double width = sc.nextDouble();
      System.out.println("What is the height of your board foot?");
      final double height = sc.nextDouble();

      final double boardFoot = calculateBoardFoot(width, height);

      System.out.print("Your board foot is ");
      System.out.print(String.format("%.2f", boardFoot));
      System.out.println(" inches long.");

    } catch (Exception e) {
      System.out.println("Please enter a proper number!\n");
    }
  }

  static double calculateBoardFoot(final double width, final double height) {
    double length = BOARD_FOOT / (width * height);
    return length;
  }
}
