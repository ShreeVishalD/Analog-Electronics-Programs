import java.util.Scanner;

public class EmitterBiasCalculator {
    public static void main(String[] args) {
        System.out.println("Emitter Bias Configuration Calculator");
        System.out.println("1. Calculate Base Current\n2. Calculate Collector Voltage\n3. Calculate Base Resistance\n4. Calculate Forward Gain\n5. Calculate Emitter Resistance\n6. Calculate Collector-Emitter Voltage\n7. Calculate Emitter Current\n8. Calculate Collector Resistance");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the serial number corresponding to the parameter you wish to calculate: ");
        String userChoice = scanner.nextLine();

        if (userChoice.equals("1")) {
            System.out.print("Enter the Collector Voltage (Vcc): ");
            double vcc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Base Resistance (Rb): ");
            double rb = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Forward Gain (Beta): ");
            double B = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Emitter Resistance (Re): ");
            double re = Double.parseDouble(scanner.nextLine());
            double baseCurrent = (vcc - 0.7) / rb + ((B + 1) * re);
            System.out.println("The Base Current is " + baseCurrent + " Amperes.");
        } else if (userChoice.equals("2")) {
            System.out.print("Enter the Base Resistance (Rb): ");
            double rb = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Emitter Resistance (Re): ");
            double re = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Forward Gain (Beta): ");
            double B = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Base Current (Ib): ");
            double ib = Double.parseDouble(scanner.nextLine());
            double collectorVoltage = (ib * (rb + ((B + 1) * re))) + 0.7;
            System.out.println("The Collector Voltage is " + collectorVoltage + " Volts.");
        } else if (userChoice.equals("3")) {
            System.out.print("Enter the Collector Voltage (Vcc): ");
            double vcc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Base Current (Ib): ");
            double ib = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Forward Gain (Beta): ");
            double B = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Emitter Resistance (Re): ");
            double re = Double.parseDouble(scanner.nextLine());
            double baseResistance = ((vcc - 0.7) / ib) - ((B + 1) * re);
            System.out.println("The Base Resistance is " + baseResistance + " Ohms.");
        } else if (userChoice.equals("4")) {
            System.out.print("Enter the Collector Voltage (Vcc): ");
            double vcc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Base Current (Ib): ");
            double ib = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Base Resistance (Rb): ");
            double rb = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Emitter Resistance (Re): ");
            double re = Double.parseDouble(scanner.nextLine());
            double B = (((vcc - 0.7) / ib) - rb) / re;
            double forwardGain = B - 1;
            System.out.println("The Forward Gain is " + forwardGain);
        } else if (userChoice.equals("5")) {
            System.out.print("Enter the Collector Voltage (Vcc): ");
            double vcc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Base Current (Ib): ");
            double ib = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Base Resistance (Rb): ");
            double rb = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Forward Gain (Beta): ");
            double B = Double.parseDouble(scanner.nextLine());
            double emitterResistance = (((vcc - 0.7) / ib) - rb) / (B - 1);
            System.out.println("The Emitter Resistance is " + emitterResistance + " Ohms.");
        } else if (userChoice.equals("6")) {
            System.out.print("Enter the Collector Voltage (Vcc): ");
            double vcc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Collector Resistance (Rc): ");
            double rc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Emitter Resistance (Re): ");
            double re = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Collector Current (Ic): ");
            double ic = Double.parseDouble(scanner.nextLine());
            double collectorEmitterVoltage = vcc - (ic * (rc + re));
            System.out.println("The Collector-Emitter Voltage is " + collectorEmitterVoltage + " Volts.");
        } else if (userChoice.equals("7")) {
            System.out.print("Enter the Collector Voltage (Vcc): ");
            double vcc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Collector-Emitter Voltage (Vce): ");
            double vce = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Collector Resistance (Rc): ");
            double rc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Emitter Resistance (Re): ");
            double re = Double.parseDouble(scanner.nextLine());
            double emitterCurrent = (vcc - vce) / (rc - re);
            System.out.println("The Emitter Current is " + emitterCurrent + " Amperes.");
        } else if (userChoice.equals("8")) {
            System.out.print("Enter the Collector Voltage (Vcc): ");
            double vcc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Collector-Emitter Voltage (Vce): ");
            double vce = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Collector Current (Ic): ");
            double ic = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Emitter Resistance (Re): ");
            double re = Double.parseDouble(scanner.nextLine());
            double collectorResistance = (vcc - vce) / (ic - re);
            System.out.println("The Collector Resistance is " + collectorResistance + " Ohms.");
        } else {
            System.out.println("Invalid option selected. Please choose a valid option.");
        }
    }
}
