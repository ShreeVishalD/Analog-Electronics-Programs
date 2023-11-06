import java.util.Scanner;

public class DepletionMOSFETVoltageDividerCalculator {
    public static void main(String[] args) {
        System.out.println("Calculator For Depletion Type MOSFET Voltage Divider Configuration");
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Calculate Gate-Voltage");
        System.out.println("2. Calculate Drain-Voltage");
        System.out.println("3. Calculate Gate Source-Voltage");
        System.out.println("4. Calculate Source-Current");
        System.out.println("5. Calculate Source-Resistance");
        System.out.println("6. Calculate Drain Supply-Voltage");
        System.out.println("7. Calculate Drain Current");
        System.out.println("8. Calculate Drain Resistance");

        System.out.print("Please enter the serial number corresponding to the parameter you wish to calculate: ");
        String a = scanner.nextLine();

        if (a.equals("1")) {
            System.out.print("Enter the value of R1: ");
            double r1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of R2: ");
            double r2 = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Drain Voltage (Vdd): ");
            double vdd = Double.parseDouble(scanner.nextLine());
            double Rth = (r1 * r2) / (r1 + r2);
            double vg = Rth * vdd;
            System.out.println("The value of Gate Voltage is " + vg + " Volts.");
        } else if (a.equals("2")) {
            System.out.print("Enter the value of R1: ");
            double r1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of R2: ");
            double r2 = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Gate Voltage (Vg): ");
            double vg = Double.parseDouble(scanner.nextLine());
            double Rth = (r1 * r2) / (r1 + r2);
            double vdd = vg / Rth;
            System.out.println("The value of Drain Voltage is " + vdd + " Volts.");
        } else if (a.equals("3")) {
            System.out.print("Enter the value of Source Current (Is): ");
            double Is = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Source Resistance (Rs): ");
            double Rs = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Gate Voltage (Vg): ");
            double vg = Double.parseDouble(scanner.nextLine());
            double vgs = vg - (Is * Rs);
            System.out.println("The value of Gate Source Voltage is " + vgs + " Volts.");
        } else if (a.equals("4")) {
            System.out.print("Enter the value of Gate Source Voltage (Vgs): ");
            double vgs = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Source Resistance (Rs): ");
            double Rs = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Gate Voltage (Vg): ");
            double vg = Double.parseDouble(scanner.nextLine());
            double Is = (vg - vgs) / Rs;
            System.out.println("The value of Source Current is " + Is + " Amperes.");
        } else if (a.equals("5")) {
            System.out.print("Enter the value of Gate Source Voltage (Vgs): ");
            double vgs = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Source Current (Is): ");
            double Is = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Gate Voltage (Vg): ");
            double vg = Double.parseDouble(scanner.nextLine());
            double rs = (vg - vgs) / Is;
            System.out.println("The value of Source Resistance is " + rs + " Ohms.");
        } else if (a.equals("6")) {
            System.out.print("Enter the value of Drain Voltage (Vdd): ");
            double vdd = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Drain Current (Id): ");
            double id = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Drain Resistance (Rd): ");
            double rd = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Source Resistance (Rs): ");
            double rs = Double.parseDouble(scanner.nextLine());
            double vds = vdd - (id * (rd + rs));
            System.out.println("The value of Drain Supply Voltage is " + vds + " Volts.");
        } else if (a.equals("7")) {
            System.out.print("Enter the value of Drain Voltage (Vdd): ");
            double vdd = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Drain Source Voltage (Vds): ");
            double vds = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Drain Resistance (Rd): ");
            double rd = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Source Resistance (Rs): ");
            double rs = Double.parseDouble(scanner.nextLine());
            double id = (vdd - vds) / (rd + rs);
            System.out.println("The value of Drain Current is " + id + " Amperes.");
        } else if (a.equals("8")) {
            System.out.print("Enter the value of Drain Voltage (Vdd): ");
            double vdd = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Drain Source Voltage (Vds): ");
            double vds = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Drain Current (Id): ");
            double id = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Source Resistance (Rs): ");
            double rs = Double.parseDouble(scanner.nextLine());
            double rd = ((vdd - vds) / id) - rs;
            System.out.println("The value of Drain Resistance is " + rd + " Ohms.");
        } else {
            System.out.println("Invalid option selected. Please choose a valid option.");
        }
    }
}
