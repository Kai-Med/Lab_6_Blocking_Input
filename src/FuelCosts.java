public class FuelCosts {
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gallons;
        double milesPerGallon;
        double pricePerGallon;

        do {
            System.out.print("Enter the number of gallons of fuel in the tank: ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                in.next(); // consume the invalid input
            }
            gallons = in.nextDouble();
        } while (gallons <= 0);

        do {
            System.out.print("Enter the fuel efficiency of the vehicle (in miles per gallon): ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                in.next(); // consume the invalid input
            }
            milesPerGallon = in.nextDouble();
        } while (milesPerGallon <= 0);

        do {
            System.out.print("Enter the price of fuel (per gallon): ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                in.next(); // consume the invalid input
            }
            pricePerGallon = in.nextDouble();
        } while (pricePerGallon <= 0);

        double costToDrive100Miles = (100 / milesPerGallon) * pricePerGallon;
        double distanceWithCurrentFuel = gallons * milesPerGallon;
        System.out.printf("With %.2f gallons of fuel, you can drive %.2f miles.%n", gallons, distanceWithCurrentFuel);
        System.out.printf("The cost to drive 100 miles is: $%.2f%n", costToDrive100Miles);
    }