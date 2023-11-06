import java.util.Scanner;

public class CollectorFeedbackCalculator {
    public static void main(String[] args) {
        System.out.println("Collector Feedback Configuration Calculator");
        System.out.println("1. Calculate Base Current\n2. Calculate Forward Resistance\n3. Calculate Forward Gain\n4. Calculate Collector Resistance\n5. Calculate Emitter Resistance\n6. Calculate Collector Voltage\n7. Calculate Collector-Emitter Voltage\n8. Calculate Collector Current");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the serial number corresponding to the parameter you wish to calculate: ");
        String a = scanner.nextLine();

        if (a.equals("1")) {
            System.out.print("Enter the Collector Voltage value: ");
            double vcc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Forward Resistance value: ");
            double rf = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Forward Gain value: ");
            double beta = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Collector Resistance value: ");
            double rc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Emitter Resistance value: ");
            double re = Double.parseDouble(scanner.nextLine());
            double baseCurrent = (vcc - 0.7) / rf + (beta * rc) + (beta * re);
            System.out.println("The Base Current is " + baseCurrent + " Amperes.");
        } else if (a.equals("2")) {
            System.out.print("Enter the Collector Voltage value: ");
            double vcc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Forward Gain value: ");
            double beta = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Base Current value: ");
            double ib = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Collector Resistance value: ");
            double rc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Emitter Resistance value: ");
            double re = Double.parseDouble(scanner.nextLine());
            double forwardResistance = (vcc - 0.7 - (beta * ib * rc) - (beta * ib * re)) / ib;
            System.out.println("The Forward Resistance is " + forwardResistance + " Ohms.");
        } else if (a.equals("3")) {
            System.out.print("Enter the Collector Current value: ");
            double ic = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Base Current value: ");
            double ib = Double.parseDouble(scanner.nextLine());
            double beta = ic / ib;
            System.out.println("The Forward Gain is " + beta + ".");
        } else if (a.equals("4")) {
            System.out.print("Enter the Collector Voltage value: ");
            double vcc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Collector Current value: ");
            double ic = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Emitter Resistance value: ");
            double re = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Collector-Emitter Voltage value: ");
            double vce = Double.parseDouble(scanner.nextLine());
            double collectorResistance = (vcc - (ic * re) - vce) / ic;
            System.out.println("The Collector Resistance is " + collectorResistance + " Ohms.");
        } else if (a.equals("5")) {
            System.out.print("Enter the Collector Voltage value: ");
            double vcc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Collector Current value: ");
            double ic = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Collector Resistance value: ");
            double rc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Collector-Emitter Voltage value: ");
            double vce = Double.parseDouble(scanner.nextLine());
            double emitterResistance = (vcc - (ic * rc) - vce) / ic;
            System.out.println("The Emitter Resistance is " + emitterResistance + " Ohms.");
        } else if (a.equals("6")) {
            System.out.print("Enter the Collector-Emitter Voltage value: ");
            double vce = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Collector Current value: ");
            double ic = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Collector Resistance value: ");
            double rc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Emitter Resistance value: ");
            double re = Double.parseDouble(scanner.nextLine());
            double collectorVoltage = vce + (ic * rc) + (ic * re);
            System.out.println("The Collector Voltage is " + collectorVoltage + " Volts.");
        } else if (a.equals("7")) {
            System.out.print("Enter the Collector Voltage value: ");
            double vcc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Collector Current value: ");
            double ic = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Collector Resistance value: ");
            double rc = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Emitter Resistance value: ");
            double re = Double.parseDouble(scanner.nextLine());
            double collectorEmitterVoltage = vcc - (ic * rc) - (ic * re);
            System.out.println("The Collector-Emitter Voltage is " + collectorEmitterVoltage + " Volts.");
        } else if (a.equals("8")) {
            System.out.print("Enter the Forward Gain value: ");
            double beta = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the Base Current value: ");
            double ib = Double.parseDouble(scanner.nextLine());
            double collectorCurrent = beta * ib;
            System.out.println("The Collector Current is " + collectorCurrent + " Amperes.");
        } else {
            System.out.println("Invalid option selected. Please choose a valid option.");
        }
    }
}
