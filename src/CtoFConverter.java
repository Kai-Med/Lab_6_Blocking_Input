    public class CtoFConverter {

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");

        while (!in.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            in.next(); // consume the invalid input
        }
        double celsius = in.nextDouble();
        double farenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + farenheit);
    }
