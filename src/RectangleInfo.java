import java.util.Scanner;
public class RectangleInfo {}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double width;
        double height;

        do {
            System.out.print("Enter the width of the rectangle: ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                in.next(); // consume the invalid input
            }
            height = in.nextDouble();
        } while (height <= 0);

        do {
            System.out.print("Enter the height of the rectangle: ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                in.next(); // consume the invalid input
            }
            width = in.nextDouble();
        } while (width <= 0);

        double diagonal = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
        double area = height * width;
        double perimeter = 2 * (height + width);
        System.out.printf("The height of the rectangle is: %.2f%n", height);
        System.out.printf("The width of the rectangle is: %.2f%n", width);
        System.out.printf("The area of the rectangle is: %.2f%n", area);
        System.out.printf("The perimeter of the rectangle is: %.2f%n", perimeter);
        System.out.printf("The diagonal of the rectangle is: %.2f%n", diagonal);
    }
