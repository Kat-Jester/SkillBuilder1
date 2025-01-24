import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args)
    { calcWallPaint();
        Scanner input = new Scanner(System.in);
        System.out.println("You're Jane's Friend!");
        System.out.println("\"What's your name?\"");
        String name=input.nextLine();
        System.out.println("Enter a floating-point number");
        double spice = input.nextDouble();
        System.out.println("Well " + name + ", the spice value resulted in " + Math.pow((4.0 / 3) * 2, Math.sqrt(5) / Math.pow(spice, 3)));

    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        // define our named constants
        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();
        // TODO: Calculate and output the wall's area
        double wallArea = wallHeight * wallWidth;
        System.out.printf("Wall area: "+"%.0f"+" square feet", wallArea);
        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall
        double paintRequired = wallArea / squareFeetPerGallons;
        System.out.printf("\nPaint needed: %.2f gallons%n", paintRequired);
        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
        int cansNeeded = (int) Math.ceil(paintRequired);
        System.out.println("Cans needed: " + cansNeeded + " can(s)");

    }
}
