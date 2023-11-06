import java.util.Scanner;

public class DepletionMOSFETBiasCalculator {
    public static void main(String[] args) {
        System.out.println("Calculator For Depletion Type MOSFET Fixed Bias Configuration");
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Calculate Gate Source-Voltage");
        System.out.println("2. Calculate Gate Supply-Voltage");
        System.out.println("3. Calculate Drain Source-Voltage");
        System.out.println("4. Calculate Drain Supply-Voltage");
        System.out.println("5. Calculate Drain-Current");
        System.out.println("6. Calculate Source-Resistance");

        System.out.print("Please enter the serial number corresponding to the parameter you wish to calculate: ");
        String a = scanner.nextLine();

        if (a.equals("1")) {
            System.out.print("Enter the value of Gate Supply-Voltage (Vgg): ");
            double vgg = Double.parseDouble(scanner.nextLine());
            double vgs = vgg;
            System.out.println("The Gate Source-Voltage is " + vgs + " Volts.");
        } else if (a.equals("2")) {
            System.out.print("Enter the value of Gate Source-Voltage (Vgs): ");
            double vgs = Double.parseDouble(scanner.nextLine());
            double vgg = vgs;
            System.out.println("The Gate Supply-Voltage is " + vgg + " Volts.");
        } else if (a.equals("3")) {
            System.out.print("Enter the value of Drain Supply-Voltage (Vdd): ");
            double vdd = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Drain-Current (Id): ");
            double id = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Source-Resistance (Rs): ");
            double rs = Double.parseDouble(scanner.nextLine());
            double vds = vdd - (id * rs);
            System.out.println("The Drain Source-Voltage is " + vds + " Volts.");
        } else if (a.equals("4")) {
            System.out.print("Enter the value of Drain Source-Voltage (Vds): ");
            double vds = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Drain-Current (Id): ");
            double id = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Source-Resistance (Rs): ");
            double rs = Double.parseDouble(scanner.nextLine());
            double vdd = vds + (id * rs);
            System.out.println("The Drain Supply-Voltage is " + vdd + " Volts.");
        } else if (a.equals("5")) {
            System.out.print("Enter the value of Drain Source-Voltage (Vds): ");
            double vds = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Drain Supply-Voltage (Vdd): ");
            double vdd = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Source-Resistance (Rs): ");
            double rs = Double.parseDouble(scanner.nextLine());
            double id = (vdd - vds) / rs;
            System.out.println("The Drain-Current is " + id + " Amperes.");
        } else if (a.equals("6")) {
            System.out.print("Enter the value of Drain Source-Voltage (Vds): ");
            double vds = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Drain Supply-Voltage (Vdd): ");
            double vdd = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Drain-Current (Id): ");
            double id = Double.parseDouble(scanner.nextLine());
            double rs = (vdd - vds) / id;
            System.out.println("The Source-Resistance is " + rs + " Ohms.");
        } else {
            System.out.println("Invalid option selected. Please choose a valid option.");
        }
    }
}
