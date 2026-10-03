import java.util.Scanner;

public class WasteCollectionMethods {

    // Method to calculate total waste from two collection points
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input for the two collection points
        System.out.print("Enter waste collected at Collection Point 1 (in kg): ");
        double point1Waste = scanner.nextDouble();

        System.out.print("Enter waste collected at Collection Point 2 (in kg): ");
        double point2Waste = scanner.nextDouble();

        // Calling the method and storing the result
        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);

        // Displaying the output
        System.out.println("Total waste collected: " + totalWaste + " kg");

        scanner.close();
    }
}