import java.util.Scanner;

public class WasteCollectionStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter waste collected in kilograms: ");
        double wasteCollected = scanner.nextDouble();

        // Check collection status using if-else
        if (wasteCollected >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }

        scanner.close();
    }
}