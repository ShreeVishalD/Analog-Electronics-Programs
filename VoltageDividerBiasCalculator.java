import java.util.Scanner;

public class VoltageDividerBiasCalculator {
    public static void main(String[] args) {
        System.out.println("Calculator for Voltage Divider Bias Configuration");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of R1: ");
        double r1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the value of R2: ");
        double r2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the value of Collector Voltage (Vcc): ");
        double vcc = Double.parseDouble(scanner.nextLine());

        double Rth = (r1 * r2) / (r1 + r2);
        double Vth = (vcc * r2) / (r1 + r2);

        System.out.println("1. Calculate Base Current");
        System.out.println("2. Calculate Voltage Thevenin");
        System.out.println("3. Calculate Resistance Thevenin");
        System.out.println("4. Calculate Forward Gain");
        System.out.println("5. Calculate Emitter Resistance");
        System.out.println("6. Calculate Collector-Emitter Voltage");
        System.out.println("7. Calculate Emitter Current");
        System.out.println("8. Calculate Collector Resistance");

        System.out.print("Please enter the serial number corresponding to the parameter you wish to calculate: ");
        String a = scanner.nextLine();

        if (a.equals("1")) {
            System.out.print("Enter the value of Forward Gain (B): ");
            double B = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Emitter Resistance (Re): ");
            double re = Double.parseDouble(scanner.nextLine());
            double i = (Vth - 0.7) / Rth + ((B + 1) * re);
            System.out.println("The Base Current is " + i + " Amperes.");
        } else if (a.equals("2")) {
            System.out.println("The Voltage Thevenin is " + Vth + " Volts.");
        } else if (a.equals("3")) {
            System.out.println("The Resistance Thevenin is " + Rth + " Ohms.");
        } else if (a.equals("4")) {
            System.out.print("Enter the value of Base Current (Ib): ");
            double ib = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Emitter Resistance (Re): ");
            double re = Double.parseDouble(scanner.nextLine());
            double B = (((Vth - 0.7) / ib) - Rth) / re;
            double b = B - 1;
            System.out.println("The Forward Gain is " + b);
        } else if (a.equals("5")) {
            System.out.print("Enter the value of Base Current (Ib): ");
            double ib = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Forward Gain (B): ");
            double B = Double.parseDouble(scanner.nextLine());
            double re = (((Vth - 0.7) / ib) - Rth) / (B + 1);
            System.out.println("The Emitter Resistance is " + re + " Ohms.");
        } else if (a.equals("6")) {
            System.out.print("Enter the value of Collector Resistance (Rc): ");
            double rc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Emitter Resistance (Re): ");
            double re = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Collector Current (Ic): ");
            double ic = Double.parseDouble(scanner.nextLine());
            double v = vcc - (ic * (rc + re));
            System.out.println("The Collector-Emitter Voltage is " + v + " Volts.");
        } else if (a.equals("7")) {
            System.out.print("Enter the value of Collector Voltage (Vcc): ");
            vcc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Collector-Emitter Voltage (Vce): ");
            double vce = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Collector Resistance (Rc): ");
            double rc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Emitter Resistance (Re): ");
            double re = Double.parseDouble(scanner.nextLine());
            double i = (vcc - vce) / (rc + re);
            System.out.println("The Collector Current is " + i + " Amperes.");
        } else if (a.equals("8")) {
            System.out.print("Enter the value of Collector Voltage (Vcc): ");
            vcc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Collector-Emitter Voltage (Vce): ");
            double vce = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Collector Resistance Current (Ic): ");
            double ic = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Emitter Resistance (Re): ");
            double re = Double.parseDouble(scanner.nextLine());
            double rc = ((vcc - vce) / ic) - re;
            System.out.println("The Collector Resistance is " + rc + " Ohms.");
        } else {
            System.out.println("Invalid option selected. Please choose a valid option.");
        }
    }
}
