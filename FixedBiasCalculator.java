import java.util.Scanner;

public class FixedBiasCalculator {
    public static void main(String[] args) {
        System.out.println("Calculator for Fixed Bias Configuration");
        System.out.println("1. Calculate Base Current\n2. Calculate Base Resistance\n3. Calculate Collector Voltage\n4. Calculate Collector-Emitter Voltage\n5. Calculate Collector Current\n6. Calculate Collector Resistance");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the serial number corresponding to the parameter you wish to calculate: ");
        String a = scanner.nextLine();

        if (a.equals("1")) {
            System.out.print("Enter the value of Collector Voltage (Vcc): ");
            double vcc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Base Resistance (Rb): ");
            double rb = Double.parseDouble(scanner.nextLine());
            double baseCurrent = (vcc - 0.7) / rb;
            System.out.println("The Base Current is " + baseCurrent + " Amperes.");
        } else if (a.equals("2")) {
            System.out.print("Enter the value of Collector Voltage (Vcc): ");
            double vcc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Base Current (Ib): ");
            double ib = Double.parseDouble(scanner.nextLine());
            double baseResistance = (vcc - 0.7) / ib;
            System.out.println("The Base Resistance is " + baseResistance + " Ohms.");
        } else if (a.equals("3")) {
            System.out.print("Enter the value of Base Resistance (Rb): ");
            double rb = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Base Current (Ib): ");
            double ib = Double.parseDouble(scanner.nextLine());
            double collectorVoltage = (ib * rb + 0.7);
            System.out.println("The Collector Voltage is " + collectorVoltage + " Volts.");
        } else if (a.equals("4")) {
            System.out.print("Enter the value of Collector Voltage (Vcc): ");
            double vcc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Collector Current (Ic): ");
            double ic = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Collector Resistance (Rc): ");
            double rc = Double.parseDouble(scanner.nextLine());
            double collectorEmitterVoltage = vcc - (ic * rc);
            System.out.println("The Collector-Emitter Voltage is " + collectorEmitterVoltage + " Volts.");
        } else if (a.equals("5")) {
            System.out.print("Enter the value of Collector Voltage (Vcc): ");
            double vcc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Collector-Emitter Voltage (Vce): ");
            double vce = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Collector Resistance (Rc): ");
            double rc = Double.parseDouble(scanner.nextLine());
            double collectorCurrent = (vcc - vce) / rc;
            System.out.println("The Collector Current is " + collectorCurrent + " Amperes.");
        } else if (a.equals("6")) {
            System.out.print("Enter the value of Collector Voltage (Vcc): ");
            double vcc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Collector-Emitter Voltage (Vce): ");
            double vce = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the value of Collector Current (Ic): ");
            double ic = Double.parseDouble(scanner.nextLine());
            double collectorResistance = (vcc - vce) / ic;
            System.out.println("The Collector Resistance is " + collectorResistance + " Ohms.");
        } else {
            System.out.println("Invalid option selected. Please choose a valid option.");
        }
    }
}
