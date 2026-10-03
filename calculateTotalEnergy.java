
import java.util.Scanner;

public class Main {
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter morning energy generated (kWh): ");
        double morningEnergy = scanner.nextDouble();

        System.out.print("Enter evening energy generated (kWh): ");
        double eveningEnergy = scanner.nextDouble();

        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);
        System.out.println("Total energy generated: " + totalEnergy + " kWh");

        scanner.close();
    }
}